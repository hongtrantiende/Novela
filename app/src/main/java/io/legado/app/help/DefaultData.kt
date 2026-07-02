package io.legado.app.help

import io.legado.app.constant.AppConst
import io.legado.app.data.appDb
import io.legado.app.data.entities.DictRule
import io.legado.app.data.entities.HttpTTS
import io.legado.app.data.entities.KeyboardAssist
import io.legado.app.data.entities.RssSource
import io.legado.app.data.entities.TxtTocRule
import io.legado.app.help.config.LocalConfig
import io.legado.app.help.config.ThemeConfigStore
import io.legado.app.help.config.ReadBookConfig
import io.legado.app.help.coroutine.Coroutine
import io.legado.app.model.BookCover
import io.legado.app.utils.GSON
import io.legado.app.utils.fromJsonArray
import io.legado.app.utils.fromJsonObject
import io.legado.app.utils.printOnDebug
import splitties.init.appCtx
import java.io.File

object DefaultData {

    fun upVersion() {
        Coroutine.async {
            if (LocalConfig.needUpHttpTTS) {
                importDefaultHttpTTS()
            }
            if (LocalConfig.needUpTxtTocRule) {
                importDefaultTocRules()
            } else {
                val newRulePattern = "^[ 　\\t]{0,4}(?:[^a-zA-ZÀ-ỹ\\s\\d]{0,10})[ 　\\t]{0,4}(?:(?:[Cc]hương|[Cc]huong|[Qq]uyển|[Qq]uyen|[Hh]ồi|[Hh]oi)\\s{0,4}(?:\\d{1,5}|[IVXLCDM]{1,10})\\b|(?:[Tt]hứ|[Tt]hu)\\s{0,4}\\d{1,5}\\b\\s{0,4}(?:[Cc]hương|[Cc]huong|[Qq]uyển|[Qq]uyen|[Hh]ồi|[Hh]oi)|(?:Lời\\s{1,3}(?:mở\\s{1,3}đầu|nói\\s{1,3}đầu)|Mở\\s{1,3}đầu|Kết\\s{1,3}thúc|Ngoại\\s{1,3}truyện|Phụ\\s{1,3}lục)).{0,150}$"
                val existingRule = appDb.txtTocRuleDao.get(1782658994660L)
                if (existingRule == null) {
                    appDb.txtTocRuleDao.insert(
                        TxtTocRule(
                            id = 1782658994660L,
                            name = "Tiếng Việt: Chương/Phần",
                            rule = newRulePattern,
                            enable = true,
                            serialNumber = -1
                        )
                    )
                } else if (existingRule.rule != newRulePattern) {
                    existingRule.rule = newRulePattern
                    appDb.txtTocRuleDao.update(existingRule)
                }
            }
            if (LocalConfig.needUpRssSources) {
                importDefaultRssSources()
            }
            if (LocalConfig.needUpDictRule) {
                importDefaultDictRules()
            }
            if (LocalConfig.needUpReadConfig) {
                ReadBookConfig.configList.clear()
                ReadBookConfig.configList.addAll(readConfigs)
                ReadBookConfig.readStyleSelect = 0
                ReadBookConfig.comicStyleSelect = 0
                ReadBookConfig.save()
            }
        }.onError {
            it.printOnDebug()
        }
    }

    val httpTTS: List<HttpTTS> by lazy {
        val json =
            String(
                appCtx.assets.open("defaultData${File.separator}httpTTS.json")
                    .readBytes()
            )
        HttpTTS.fromJsonArray(json).getOrElse {
            emptyList()
        }
    }

    val readConfigs: List<ReadBookConfig.Config> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}${ReadBookConfig.configFileName}")
                .readBytes()
        )
        GSON.fromJsonArray<ReadBookConfig.Config>(json).getOrNull()
            ?: emptyList()
    }

    val txtTocRules: List<TxtTocRule> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}txtTocRule.json")
                .readBytes()
        )
        GSON.fromJsonArray<TxtTocRule>(json).getOrNull() ?: emptyList()
    }

    val themeConfigs: List<ThemeConfigStore.Config> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}${ThemeConfigStore.configFileName}")
                .readBytes()
        )
        GSON.fromJsonArray<ThemeConfigStore.Config>(json).getOrNull() ?: emptyList()
    }

    val rssSources: List<RssSource> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}rssSources.json")
                .readBytes()
        )
        GSON.fromJsonArray<RssSource>(json).getOrDefault(emptyList())
    }

    val coverRule: BookCover.CoverRule by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}coverRule.json")
                .readBytes()
        )
        GSON.fromJsonObject<BookCover.CoverRule>(json).getOrThrow()
    }

    val dictRules: List<DictRule> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}dictRules.json")
                .readBytes()
        )
        GSON.fromJsonArray<DictRule>(json).getOrThrow()
    }

    val keyboardAssists: List<KeyboardAssist> by lazy {
        val json = String(
            appCtx.assets.open("defaultData${File.separator}keyboardAssists.json")
                .readBytes()
        )
        GSON.fromJsonArray<KeyboardAssist>(json).getOrThrow()
    }

    fun importDefaultHttpTTS() {
        appDb.httpTTSDao.deleteDefault()
        appDb.httpTTSDao.insert(*httpTTS.toTypedArray())
        try {
            val baseDir = appCtx.externalCacheDir ?: appCtx.cacheDir
            val ttsFolder = java.io.File(baseDir, "httpTTS")
            val cacheFolder = java.io.File(baseDir, "httpTTS_cache")
            io.legado.app.utils.FileUtils.delete(ttsFolder.absolutePath)
            io.legado.app.utils.FileUtils.delete(cacheFolder.absolutePath)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun importDefaultTocRules() {
        appDb.txtTocRuleDao.deleteDefault()
        appDb.txtTocRuleDao.insert(*txtTocRules.toTypedArray())
    }

    fun importDefaultRssSources() {
        appDb.rssSourceDao.deleteDefault()
        appDb.rssSourceDao.insert(*rssSources.toTypedArray())
    }

    fun importDefaultDictRules() {
        appDb.dictRuleDao.insert(*dictRules.toTypedArray())
    }

}