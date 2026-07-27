package io.legado.app.ui.config

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshots.Snapshot
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import io.legado.app.data.repository.dataStore
import io.legado.app.help.config.DsSync
import io.legado.app.utils.getPrefBoolean
import io.legado.app.utils.getPrefFloat
import io.legado.app.utils.getPrefInt
import io.legado.app.utils.getPrefLong
import io.legado.app.utils.getPrefString
import io.legado.app.utils.putPrefBoolean
import io.legado.app.utils.putPrefFloat
import io.legado.app.utils.putPrefInt
import io.legado.app.utils.putPrefLong
import io.legado.app.utils.putPrefString
import io.legado.app.utils.putPrefStringSync
import kotlinx.coroutines.launch
import splitties.init.appCtx
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

interface PrefDelegate<T> : ReadWriteProperty<Any?, T> {
    val state: State<T>
    fun dispose()
}

class PrefStateDelegate<T>(private val delegate: PrefDelegate<T>) : ReadWriteProperty<Any?, T> by delegate {
    val state: State<T> get() = delegate.state
}

fun <T> prefDelegate(
    key: String,
    defaultValue: T,
    lifecycleOwner: LifecycleOwner? = null,
    sync: Boolean = false,
    onValueChange: ((T) -> Unit)? = null
): PrefDelegate<T> {
    return object : PrefDelegate<T> {
        private var _value: MutableState<T>
        override val state: State<T> get() = _value

        @Volatile
        private var currentValue: T = defaultValue

        init {
            // 优先从 SP 读取初始值（SP 是内存缓存，速度极快且是同步的，避免阻塞主线程）
            val initialValue = readFromSp() ?: defaultValue
            _value = mutableStateOf(initialValue)
            currentValue = initialValue
        }

        override fun dispose() {
            // 不需要再做任何清理工作，因为移除了 DataStore 观察协程
        }

        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            return _value.value
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
            if (currentValue != value) {
                updateValue(value)
                // 同步写入 SP（向后兼容：AppConfig/MainViewModel 等仍直接读 SP）
                when (value) {
                    is String? -> if (sync) appCtx.putPrefStringSync(key, value) else appCtx.putPrefString(key, value)
                    is Int -> appCtx.putPrefInt(key, value)
                    is Boolean -> appCtx.putPrefBoolean(key, value)
                    is Long -> appCtx.putPrefLong(key, value)
                    is Float -> appCtx.putPrefFloat(key, value)
                }
                // 异步写入 DataStore（SP 已同步写入，DataStore 仅作备份）
                kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.IO).launch {
                    runCatching {
                        when (value) {
                            is String? -> DsSync.putString(key, value)
                            is Int -> DsSync.putInt(key, value)
                            is Boolean -> DsSync.putBoolean(key, value)
                            is Long -> DsSync.putLong(key, value)
                            is Float -> DsSync.putFloat(key, value)
                        }
                    }
                }
                onValueChange?.invoke(value)
            }
        }

        /**
         * 从 SharedPreferences 同步读取初始值。
         */
        @Suppress("UNCHECKED_CAST")
        private fun readFromSp(): T? {
            return when {
                defaultValue is String || defaultValue == null ->
                    appCtx.getPrefString(key, defaultValue as String?) as T?
                defaultValue is Int ->
                    appCtx.getPrefInt(key, defaultValue) as T
                defaultValue is Boolean ->
                    appCtx.getPrefBoolean(key, defaultValue) as T
                defaultValue is Long ->
                    appCtx.getPrefLong(key, defaultValue) as T
                defaultValue is Float ->
                    appCtx.getPrefFloat(key, defaultValue) as T
                else -> null
            }
        }

        private fun updateValue(value: T) {
            currentValue = value
            Snapshot.withMutableSnapshot {
                _value.value = value
            }
        }
    }
}

fun <T> prefStateDelegate(
    key: String,
    defaultValue: T,
    lifecycleOwner: LifecycleOwner? = null,
    sync: Boolean = false,
    onValueChange: ((T) -> Unit)? = null
): PrefStateDelegate<T> {
    val delegate = prefDelegate(key, defaultValue, lifecycleOwner, sync, onValueChange)
    return PrefStateDelegate(delegate)
}
