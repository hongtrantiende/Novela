package io.legado.app.ui.main

import androidx.annotation.StringRes
import io.legado.app.R
import io.legado.app.ui.config.themeConfig.ThemeConfig
import kotlinx.collections.immutable.persistentListOf

sealed class MainDestination(
    val route: String,
    @StringRes val labelId: Int
) {
    object Home : MainDestination(
        route = "home",
        labelId = R.string.home
    )

    object Bookshelf : MainDestination(
        route = "bookshelf",
        labelId = R.string.bookshelf
    )

    object Explore : MainDestination(
        route = "explore",
        labelId = R.string.discovery
    )

    object Rss : MainDestination(
        route = "rss",
        labelId = R.string.rss
    )

    object Updates : MainDestination(
        route = "updates",
        labelId = R.string.sc_updated
    )

    object ReadRecord : MainDestination(
        route = "readRecord",
        labelId = R.string.read_record
    )

    object My : MainDestination(
        route = "my",
        labelId = R.string.my
    )

    companion object {
        val mainDestinations = persistentListOf<MainDestination>(Bookshelf, Updates, Explore, ReadRecord, My, Home, Rss)
    }
}

val MainDestination.customIconPath: String
    get() = when (this) {
        MainDestination.Home -> ThemeConfig.navIconHome
        MainDestination.Bookshelf -> ThemeConfig.navIconBookshelf
        MainDestination.Explore -> ThemeConfig.navIconExplore
        MainDestination.Rss -> ThemeConfig.navIconRss
        MainDestination.Updates -> ""
        MainDestination.ReadRecord -> ""
        MainDestination.My -> ThemeConfig.navIconMy
    }
