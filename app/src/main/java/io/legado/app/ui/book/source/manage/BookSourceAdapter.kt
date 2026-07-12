package io.legado.app.ui.book.source.manage

//import io.legado.app.lib.theme.backgroundColor
import android.content.Context
import android.content.res.ColorStateList
import io.legado.app.ui.config.themeConfig.ThemeConfig
import io.legado.app.lib.theme.primaryColor
import io.legado.app.utils.ColorUtils
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import io.legado.app.utils.themeColor
import android.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.doOnLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import io.legado.app.R
import io.legado.app.base.adapter.ItemViewHolder
import io.legado.app.base.adapter.RecyclerAdapter
import io.legado.app.data.entities.BookSourcePart
import io.legado.app.databinding.ItemBookSourceBinding
import io.legado.app.model.Debug
import io.legado.app.ui.login.SourceLoginActivity
import io.legado.app.ui.widget.recycler.DragSelectTouchHelper
import io.legado.app.ui.widget.recycler.ItemTouchCallback
import io.legado.app.utils.buildMainHandler
import io.legado.app.utils.gone
import io.legado.app.utils.invisible
import io.legado.app.utils.startActivity
import io.legado.app.utils.visible
import java.util.Collections


class BookSourceAdapter(
    context: Context,
    private val callBack: CallBack,
    private val recyclerView: RecyclerView
) : RecyclerAdapter<BookSourcePart, ItemBookSourceBinding>(context),
    ItemTouchCallback.Callback {

    private val selected = linkedSetOf<BookSourcePart>()
    private val finalMessageRegex = Regex("thành công|thất bại|Thành công|Thất bại|成功|失败")
    private val handler = buildMainHandler()
    var showSourceHost = false

    val selection: List<BookSourcePart>
        get() {
            return getItems().filter {
                selected.contains(it)
            }
        }

    val diffItemCallback = object : DiffUtil.ItemCallback<BookSourcePart>() {

        override fun areItemsTheSame(oldItem: BookSourcePart, newItem: BookSourcePart): Boolean {
            return oldItem.bookSourceUrl == newItem.bookSourceUrl
        }

        override fun areContentsTheSame(oldItem: BookSourcePart, newItem: BookSourcePart): Boolean {
            return oldItem.bookSourceName == newItem.bookSourceName
                    && oldItem.bookSourceGroup == newItem.bookSourceGroup
                    && oldItem.enabled == newItem.enabled
                    && oldItem.enabledExplore == newItem.enabledExplore
                    && oldItem.hasExploreUrl == newItem.hasExploreUrl
        }

        override fun getChangePayload(oldItem: BookSourcePart, newItem: BookSourcePart): Any? {
            val payload = Bundle()
            if (oldItem.bookSourceName != newItem.bookSourceName
                || oldItem.bookSourceGroup != newItem.bookSourceGroup
            ) {
                payload.putBoolean("upName", true)
            }
            if (oldItem.enabled != newItem.enabled) {
                payload.putBoolean("enabled", newItem.enabled)
            }
            if (oldItem.enabledExplore != newItem.enabledExplore ||
                oldItem.hasExploreUrl != newItem.hasExploreUrl
            ) {
                payload.putBoolean("upExplore", true)
            }
            if (payload.isEmpty) {
                return null
            }
            return payload
        }

    }

    private var isNight = false
    private var activeSkinName = ""
    private var skinColorScheme: io.legado.app.help.skin.SkinColorScheme? = null
    private var itemBackground = 0
    private var cardBackground = 0
    private var textColor = 0
    private var secondaryTextColor = 0
    private var primaryColorResolved = 0
    private var outlineColor = 0
    private var controlNormalColor = 0
    private var primaryColorStateList: ColorStateList? = null
    private var textSecondaryColorStateList: ColorStateList? = null
    private var trackColorStateList: ColorStateList? = null
    private var thumbColorStateList: ColorStateList? = null
    private var areColorsCached = false

    private fun cacheColors(context: Context) {
        if (areColorsCached) return
        isNight = io.legado.app.help.config.AppConfig.isNightTheme
        activeSkinName = ThemeConfig.activeSkinPack
        val activePack = if (activeSkinName.isNotBlank()) io.legado.app.help.skin.SkinPackManager.getPack(activeSkinName) else null
        skinColorScheme = activePack?.manifest?.colorScheme

        fun parseColor(colorStr: String?, defaultColor: Int): Int {
            if (colorStr.isNullOrBlank()) return defaultColor
            return try {
                android.graphics.Color.parseColor(colorStr)
            } catch (e: Exception) {
                defaultColor
            }
        }

        itemBackground = if (skinColorScheme?.background != null) {
            parseColor(skinColorScheme?.background, context.themeColor(android.R.attr.colorBackground))
        } else if (ThemeConfig.enableDeepPersonalization && ThemeConfig.themeBackgroundColor != 0) {
            ThemeConfig.themeBackgroundColor
        } else {
            context.themeColor(android.R.attr.colorBackground)
        }

        cardBackground = if (skinColorScheme?.surfaceContainer != null) {
            parseColor(skinColorScheme?.surfaceContainer, context.themeColor(com.google.android.material.R.attr.colorSurfaceContainer))
        } else if (skinColorScheme?.background != null) {
            parseColor(skinColorScheme?.background, context.themeColor(com.google.android.material.R.attr.colorSurfaceContainer))
        } else if (ThemeConfig.enableDeepPersonalization && ThemeConfig.themeBackgroundColor != 0) {
            ThemeConfig.themeBackgroundColor
        } else {
            try {
                context.themeColor(com.google.android.material.R.attr.colorSurfaceContainer)
            } catch (e: Exception) {
                context.themeColor(android.R.attr.colorBackground)
            }
        }

        textColor = if (skinColorScheme?.onSurface != null) {
            parseColor(skinColorScheme?.onSurface, context.themeColor(android.R.attr.textColorPrimary))
        } else if (ThemeConfig.enableDeepPersonalization && ThemeConfig.primaryTextColor != 0) {
            ThemeConfig.primaryTextColor
        } else {
            context.themeColor(android.R.attr.textColorPrimary)
        }

        secondaryTextColor = if (skinColorScheme?.onSurface != null) {
            val parsedColor = parseColor(skinColorScheme?.onSurface, context.themeColor(android.R.attr.textColorPrimary))
            ColorUtils.adjustAlpha(parsedColor, 0.7f)
        } else if (ThemeConfig.enableDeepPersonalization && ThemeConfig.secondaryTextColor != 0) {
            ThemeConfig.secondaryTextColor
        } else {
            try {
                context.themeColor(com.google.android.material.R.attr.colorOutline)
            } catch (e: Exception) {
                if (isNight) 0xFFCAC4D0.toInt() else 0xFF49454F.toInt()
            }
        }

        primaryColorResolved = if (skinColorScheme?.primary != null) {
            parseColor(skinColorScheme?.primary, context.primaryColor)
        } else if (ThemeConfig.enableDeepPersonalization && ThemeConfig.themeColor != 0) {
            ThemeConfig.themeColor
        } else {
            val seed = if (isNight) ThemeConfig.cNPrimary else ThemeConfig.cPrimary
            if (seed != 0) seed else context.primaryColor
        }

        outlineColor = try {
            context.themeColor(com.google.android.material.R.attr.colorOutlineVariant)
        } catch (e: Exception) {
            ColorUtils.adjustAlpha(textColor, 0.12f)
        }

        controlNormalColor = try {
            context.themeColor(android.R.attr.colorControlNormal)
        } catch (e: Exception) {
            textColor
        }

        val checkedColor = if (ColorUtils.isColorLight(primaryColorResolved)) textColor else primaryColorResolved

        primaryColorStateList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_enabled, -android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_enabled, android.R.attr.state_checked)
            ),
            intArrayOf(
                ColorUtils.adjustAlpha(textColor, 0.38f),
                ColorUtils.adjustAlpha(textColor, 0.54f),
                checkedColor
            )
        )

        textSecondaryColorStateList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_enabled)
            ),
            intArrayOf(
                ColorUtils.adjustAlpha(secondaryTextColor, 0.38f),
                secondaryTextColor
            )
        )

        trackColorStateList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_enabled, -android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_enabled, android.R.attr.state_checked)
            ),
            intArrayOf(
                ColorUtils.adjustAlpha(textColor, 0.12f),
                ColorUtils.adjustAlpha(textColor, 0.38f),
                ColorUtils.adjustAlpha(checkedColor, 0.54f)
            )
        )

        thumbColorStateList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_enabled, -android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_enabled, android.R.attr.state_checked)
            ),
            intArrayOf(
                ColorUtils.adjustAlpha(textColor, 0.38f),
                ColorUtils.adjustAlpha(textColor, 0.7f),
                checkedColor
            )
        )

        areColorsCached = true
    }

    override fun getViewBinding(parent: ViewGroup): ItemBookSourceBinding {
        return ItemBookSourceBinding.inflate(inflater, parent, false)
    }

    override fun convert(
        holder: ItemViewHolder,
        binding: ItemBookSourceBinding,
        item: BookSourcePart,
        payloads: MutableList<Any>
    ) {
        cacheColors(context)
        binding.run {
            if (payloads.isEmpty()) {
                cardView.setCardBackgroundColor(cardBackground)
                cardView.strokeColor = outlineColor
                cbBookSource.setTextColor(textColor)
                tvHostText.setTextColor(secondaryTextColor)
                ivDebugText.setTextColor(secondaryTextColor)
                ivEdit.setColorFilter(controlNormalColor)
                ivMenuMore.setColorFilter(controlNormalColor)
                cbBookSource.buttonTintList = primaryColorStateList
                swtEnabled.thumbTintList = thumbColorStateList
                swtEnabled.trackTintList = trackColorStateList

                cbBookSource.text = item.getDisPlayNameGroup()
                swtEnabled.isChecked = item.enabled
                cbBookSource.isChecked = selected.contains(item)
                upCheckSourceMessage(binding, item)
                upShowExplore(ivExplore, item)
                upSourceHost(binding, holder.layoutPosition)
            } else {
                for (i in payloads.indices) {
                    val bundle = payloads[i] as Bundle
                    bundle.keySet().forEach {
                        when (it) {
                            "enabled" -> swtEnabled.isChecked = bundle.getBoolean("enabled")
                            "upName" -> cbBookSource.text = item.getDisPlayNameGroup()
                            "upExplore" -> upShowExplore(ivExplore, item)
                            "selected" -> cbBookSource.isChecked = selected.contains(item)
                            "checkSourceMessage" -> upCheckSourceMessage(binding, item)
                            "upSourceHost" -> upSourceHost(binding, holder.layoutPosition)
                        }
                    }
                }
            }
        }
    }

    override fun registerListener(holder: ItemViewHolder, binding: ItemBookSourceBinding) {
        binding.apply {
            swtEnabled.setOnCheckedChangeListener { view, checked ->
                getItem(holder.layoutPosition)?.let {
                    if (view.isPressed) {
                        it.enabled = checked
                        callBack.enable(checked, it)
                    }
                }
            }
            cbBookSource.setOnCheckedChangeListener { view, checked ->
                getItem(holder.layoutPosition)?.let {
                    if (view.isPressed) {
                        if (checked) {
                            selected.add(it)
                        } else {
                            selected.remove(it)
                        }
                        callBack.upCountView()
                    }
                }
            }
            ivEdit.setOnClickListener {
                getItem(holder.layoutPosition)?.let {
                    callBack.edit(it)
                }
            }
            ivMenuMore.setOnClickListener {
                showMenu(ivMenuMore, holder.layoutPosition)
            }
        }
    }

    override fun onCurrentListChanged() {
        callBack.upCountView()
        recyclerView.doOnLayout {
            handler.post {
                notifyItemRangeChanged(0, itemCount, bundleOf("upSourceHost" to null))
            }
        }
    }

    private fun showMenu(view: View, position: Int) {
        val source = getItem(position) ?: return
        val popupMenu = PopupMenu(context, view)
        popupMenu.inflate(R.menu.book_source_item)
        popupMenu.menu.findItem(R.id.menu_top).isVisible = callBack.sort == BookSourceSort.Default
        popupMenu.menu.findItem(R.id.menu_bottom).isVisible =
            callBack.sort == BookSourceSort.Default
        val qyMenu = popupMenu.menu.findItem(R.id.menu_enable_explore)
        if (!source.hasExploreUrl) {
            qyMenu.isVisible = false
        } else {
            if (source.enabledExplore) {
                qyMenu.setTitle(R.string.disable_explore)
            } else {
                qyMenu.setTitle(R.string.enable_explore)
            }
        }
        val loginMenu = popupMenu.menu.findItem(R.id.menu_login)
        loginMenu.isVisible = source.hasLoginUrl
        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_top -> callBack.toTop(source)
                R.id.menu_bottom -> callBack.toBottom(source)
                R.id.menu_login -> context.startActivity<SourceLoginActivity> {
                    putExtra("type", "bookSource")
                    putExtra("key", source.bookSourceUrl)
                }

                R.id.menu_search -> callBack.searchBook(source)
                R.id.menu_debug_source -> callBack.debug(source)
                R.id.menu_del -> {
                    callBack.del(source)
                    selected.remove(source)
                }

                R.id.menu_enable_explore -> {
                    callBack.enableExplore(!source.enabledExplore, source)
                }
            }
            true
        }
        popupMenu.show()
    }

    private fun upShowExplore(iv: MaterialCardView, source: BookSourcePart) {
        when {
            !source.hasExploreUrl -> {
                iv.invisible()
            }

            source.enabledExplore -> {
                iv.setCardBackgroundColor(ContextCompat.getColor(context, R.color.md_green_500))
                iv.visible()
                iv.contentDescription = context.getString(R.string.tag_explore_enabled)
            }

            else -> {
                iv.setCardBackgroundColor(ContextCompat.getColor(context, R.color.md_red_400))
                iv.visible()
                iv.contentDescription = context.getString(R.string.tag_explore_disabled)
            }
        }
    }

    private fun upCheckSourceMessage(
        binding: ItemBookSourceBinding,
        item: BookSourcePart
    ) = binding.run {
        val msg = Debug.debugMessageMap[item.bookSourceUrl] ?: ""
        ivDebugText.text = msg
        val isEmpty = msg.isEmpty()
        var isFinalMessage = msg.contains(finalMessageRegex)
        if (!Debug.isChecking && !isFinalMessage) {
            Debug.updateFinalMessage(item.bookSourceUrl, "Kiểm tra thất bại")
            ivDebugText.text = Debug.debugMessageMap[item.bookSourceUrl] ?: ""
            isFinalMessage = true
        }
        ivDebugText.visibility =
            if (!isEmpty) View.VISIBLE else View.GONE
        ivProgressBar.visibility =
            if (isFinalMessage || isEmpty || !Debug.isChecking) View.GONE else View.VISIBLE
    }

    private fun upSourceHost(binding: ItemBookSourceBinding, position: Int) = binding.run {
        if (showSourceHost && isItemHeader(position)) {
            tvHostText.text = getHeaderText(position)
            tvHostText.visible()
        } else {
            tvHostText.gone()
        }
    }

    fun selectAll() {
        getItems().forEach {
            selected.add(it)
        }
        notifyItemRangeChanged(0, itemCount, bundleOf(Pair("selected", null)))
        callBack.upCountView()
    }

    fun revertSelection() {
        getItems().forEach {
            if (selected.contains(it)) {
                selected.remove(it)
            } else {
                selected.add(it)
            }
        }
        notifyItemRangeChanged(0, itemCount, bundleOf(Pair("selected", null)))
        callBack.upCountView()
    }

    fun checkSelectedInterval() {
        val selectedPosition = linkedSetOf<Int>()
        getItems().forEachIndexed { index, it ->
            if (selected.contains(it)) {
                selectedPosition.add(index)
            }
        }
        val minPosition = Collections.min(selectedPosition)
        val maxPosition = Collections.max(selectedPosition)
        val itemCount = maxPosition - minPosition + 1
        for (i in minPosition..maxPosition) {
            getItem(i)?.let {
                selected.add(it)
            }
        }
        notifyItemRangeChanged(minPosition, itemCount, bundleOf(Pair("selected", null)))
        callBack.upCountView()
    }

    fun getHeaderText(position: Int): String {
        val source = getItem(position)!!
        return callBack.getSourceHost(source.bookSourceUrl)
    }

    fun isItemHeader(position: Int): Boolean {
        if (position == 0) return true
        val lastHost = getHeaderText(position - 1)
        val curHost = getHeaderText(position)
        return lastHost != curHost
    }

    override fun swap(srcPosition: Int, targetPosition: Int): Boolean {
        val srcItem = getItem(srcPosition)
        val targetItem = getItem(targetPosition)
        if (srcItem != null && targetItem != null) {
            val srcOrder = srcItem.customOrder
            srcItem.customOrder = targetItem.customOrder
            targetItem.customOrder = srcOrder
            movedItems.add(srcItem)
            movedItems.add(targetItem)
        }
        swapItem(srcPosition, targetPosition)
        return true
    }

    private val movedItems = hashSetOf<BookSourcePart>()

    override fun onClearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
        if (movedItems.isNotEmpty()) {
            val sortNumberSet = hashSetOf<Int>()
            movedItems.forEach {
                sortNumberSet.add(it.customOrder)
            }
            if (movedItems.size > sortNumberSet.size) {
                callBack.upOrder(getItems().mapIndexed { index, bookSourcePart ->
                    bookSourcePart.customOrder = if (callBack.sortAscending) index else -index
                    bookSourcePart
                })
            } else {
                callBack.upOrder(movedItems.toList())
            }
            movedItems.clear()
        }
    }

    val dragSelectCallback: DragSelectTouchHelper.Callback =
        object : DragSelectTouchHelper.AdvanceCallback<BookSourcePart>(Mode.ToggleAndReverse) {
            override fun currentSelectedId(): MutableSet<BookSourcePart> {
                return selected
            }

            override fun getItemId(position: Int): BookSourcePart? {
                return getItem(position)
            }

            override fun updateSelectState(position: Int, isSelected: Boolean): Boolean {
                getItem(position)?.let {
                    if (isSelected) {
                        selected.add(it)
                    } else {
                        selected.remove(it)
                    }
                    notifyItemChanged(position, bundleOf(Pair("selected", null)))
                    callBack.upCountView()
                    return true
                }
                return false
            }
        }

    interface CallBack {
        val sort: BookSourceSort
        val sortAscending: Boolean
        fun del(bookSource: BookSourcePart)
        fun edit(bookSource: BookSourcePart)
        fun toTop(bookSource: BookSourcePart)
        fun toBottom(bookSource: BookSourcePart)
        fun searchBook(bookSource: BookSourcePart)
        fun debug(bookSource: BookSourcePart)
        fun upOrder(items: List<BookSourcePart>)
        fun enable(enable: Boolean, bookSource: BookSourcePart)
        fun enableExplore(enable: Boolean, bookSource: BookSourcePart)
        fun upCountView()
        fun getSourceHost(origin: String): String
    }
}
