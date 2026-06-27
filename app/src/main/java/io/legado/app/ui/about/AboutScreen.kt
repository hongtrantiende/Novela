package io.legado.app.ui.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.legado.app.R
import io.legado.app.constant.AppConst.appInfo
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.theme.ThemeResolver
import io.legado.app.ui.widget.components.AppScaffold
import io.legado.app.ui.widget.components.SettingItemWithDivider
import io.legado.app.ui.widget.components.SplicedColumnGroup
import io.legado.app.ui.widget.components.alert.AppAlertDialog
import io.legado.app.ui.widget.components.card.TextCard
import io.legado.app.ui.widget.components.log.CrashLogSheet
import io.legado.app.ui.widget.components.progressIndicator.AppCircularProgressIndicator
import io.legado.app.ui.widget.components.settingItem.SettingItem
import io.legado.app.ui.widget.components.text.AppText
import io.legado.app.ui.widget.components.topbar.GlassMediumFlexibleTopAppBar
import io.legado.app.ui.widget.components.topbar.GlassTopAppBarDefaults
import io.legado.app.ui.widget.components.topbar.TopBarNavigationButton
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun AboutScreen(
    state: AboutUiState,
    onIntent: (AboutIntent) -> Unit,
    onBack: () -> Unit = {},
    versionName: String = appInfo.versionName,
) {
    if (ThemeResolver.isMiuixEngine(LegadoTheme.composeEngine)) {
        MiuixAboutScreen(
            state = state,
            onIntent = onIntent,
            onBack = onBack,
            versionName = versionName,
        )
    } else {
        MaterialAboutScreen(
            state = state,
            onIntent = onIntent,
            onBack = onBack,
            versionName = versionName,
        )
    }

    AboutOverlays(state = state, onIntent = onIntent)
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun MaterialAboutScreen(
    state: AboutUiState,
    onIntent: (AboutIntent) -> Unit,
    onBack: () -> Unit,
    versionName: String,
) {
    val scrollBehavior = GlassTopAppBarDefaults.defaultScrollBehavior()
    val privacyPolicyTitle = stringResource(R.string.about_privacy_policy_title)
    val licenseTitle = stringResource(R.string.about_license_title)
    val disclaimerTitle = stringResource(R.string.about_disclaimer_title)

    AppScaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            GlassMediumFlexibleTopAppBar(
                title = stringResource(R.string.about),
                navigationIcon = {
                    TopBarNavigationButton(onClick = onBack)
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher3),
                contentDescription = null,
                modifier = Modifier
                    .size(88.dp)
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(18.dp))
            )
            AppText(
                text = stringResource(R.string.app_name),
                style = LegadoTheme.typography.bodyLarge,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
            TextCard(
                text = versionName,
                cornerRadius = 8.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(vertical = 4.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                FilledTonalButton(
                    onClick = { onIntent(AboutIntent.CheckUpdate) },
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_import),
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    AppText(text = stringResource(R.string.check_update))
                }

                val context = androidx.compose.ui.platform.LocalContext.current
                FilledTonalButton(
                    onClick = {
                        runCatching {
                            val intent = android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://discord.gg/2E4p4sAgVj"))
                            context.startActivity(intent)
                        }
                    }
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_discord_logo),
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    AppText(text = "Cộng đồng Discord")
                }
            }
            AppText(
                text = stringResource(R.string.about_description),
                style = LegadoTheme.typography.bodyLarge,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(start = 16.dp, end = 16.dp, bottom = 4.dp)
            )
        }
    }
}

@Composable
private fun AboutOverlays(
    state: AboutUiState,
    onIntent: (AboutIntent) -> Unit,
) {
    val currentSheet = state.sheet
    var renderedSheet by remember { mutableStateOf<AboutSheet>(AboutSheet.None) }
    LaunchedEffect(currentSheet) {
        if (currentSheet is AboutSheet.None) {
            delay(300)
            renderedSheet = AboutSheet.None
        } else {
            renderedSheet = currentSheet
        }
    }

    when (val sheet = renderedSheet) {
        is AboutSheet.None -> Unit
        is AboutSheet.Markdown -> MarkdownSheet(
            show = currentSheet is AboutSheet.Markdown,
            title = sheet.title,
            content = sheet.content,
            onDismissRequest = { onIntent(AboutIntent.DismissSheet) },
        )

        is AboutSheet.CrashLogs -> CrashLogSheet(
            show = currentSheet is AboutSheet.CrashLogs,
            logFiles = state.crashLogFiles,
            onDismissRequest = { onIntent(AboutIntent.DismissSheet) },
            onReadFile = { onIntent(AboutIntent.ReadCrashFile(it)) },
            onClear = { onIntent(AboutIntent.ClearCrashLogs) },
        )

        is AboutSheet.Update -> UpdateSheet(
            show = currentSheet is AboutSheet.Update,
            updateInfo = sheet.updateInfo,
            mode = sheet.mode,
            onDismissRequest = { onIntent(AboutIntent.DismissSheet) },
            onStartDownload = { onIntent(AboutIntent.StartDownload) },
        )
    }

    AppAlertDialog(
        show = state.dialog is AboutDialog.CheckingUpdate,
        onDismissRequest = {},
        content = {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                AppCircularProgressIndicator()
            }
        }
    )
}
