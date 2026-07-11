package io.legado.app.ui.widget.dialog

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.legado.app.ui.config.translation.TranslationConfig
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.text.AppText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TranslationSettingsDialog(
    onDismissRequest: () -> Unit,
    onSettingsClick: () -> Unit,
    onSave: (enabled: Boolean, target: String, engine: String, scope: String) -> Unit
) {
    val context = LocalContext.current
    var tempEnabled by remember { mutableStateOf(TranslationConfig.translationEnabled) }
    var tempSource by remember { mutableStateOf("Tiếng Trung") }
    var tempTarget by remember { mutableStateOf(TranslationConfig.translationTarget) }
    var tempEngine by remember { mutableStateOf(TranslationConfig.translationEngine) }
    var tempScope by remember { mutableStateOf(TranslationConfig.translationScope) }

    var targetMenuExpanded by remember { mutableStateOf(false) }
    var engineMenuExpanded by remember { mutableStateOf(false) }
    var scopeMenuExpanded by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .width(340.dp)
                .clip(RoundedCornerShape(28.dp))
                .background(LegadoTheme.colorScheme.surfaceContainerHigh)
                .border(
                    1.dp,
                    LegadoTheme.colorScheme.outline.copy(alpha = 0.15f),
                    RoundedCornerShape(28.dp)
                )
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Title and Settings Gear
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onDismissRequest
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Đóng",
                            tint = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    AppText(
                        text = "Dịch",
                        style = LegadoTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                        color = LegadoTheme.colorScheme.onSurface
                    )
                    IconButton(
                        onClick = {
                            onDismissRequest()
                            onSettingsClick()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Cài đặt",
                            tint = LegadoTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // Row 1: Source Language, Switch, Target Language
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Source Dropdown (Disabled since it's Chinese-to-Vietnamese translation)
                    Box(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16.dp))
                                .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                .padding(horizontal = 10.dp, vertical = 10.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppText(
                                text = tempSource,
                                color = LegadoTheme.colorScheme.onSurface,
                                fontSize = 13.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

                    // Switch
                    Switch(
                        checked = tempEnabled,
                        onCheckedChange = { tempEnabled = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = LegadoTheme.colorScheme.primary,
                            checkedTrackColor = LegadoTheme.colorScheme.primary.copy(alpha = 0.3f),
                            uncheckedThumbColor = LegadoTheme.colorScheme.outline,
                            uncheckedTrackColor = LegadoTheme.colorScheme.surfaceVariant
                        )
                    )

                    // Target Dropdown
                    Box(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16.dp))
                                .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                .clickable { targetMenuExpanded = true }
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppText(
                                text = tempTarget,
                                color = LegadoTheme.colorScheme.onSurface,
                                fontSize = 13.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null,
                                tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                        DropdownMenu(
                            expanded = targetMenuExpanded,
                            onDismissRequest = { targetMenuExpanded = false }
                        ) {
                            listOf("Việt (VP)", "Hán Việt").forEach { lang ->
                                DropdownMenuItem(
                                    text = { AppText(lang) },
                                    onClick = {
                                        tempTarget = lang
                                        targetMenuExpanded = false
                                    }
                                )
                            }
                        }
                    }
                }

                // Row 2: Engine, Scope, Save Button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Engine Dropdown
                    Box(modifier = Modifier.weight(1.1f)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16.dp))
                                .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                .clickable { engineMenuExpanded = true }
                                .padding(horizontal = 10.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(20.dp)
                                    .background(LegadoTheme.colorScheme.primary.copy(alpha = 0.2f), CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Book,
                                    contentDescription = null,
                                    tint = LegadoTheme.colorScheme.primary,
                                    modifier = Modifier.size(12.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(6.dp))
                            AppText(
                                text = tempEngine,
                                color = LegadoTheme.colorScheme.onSurface,
                                fontSize = 14.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null,
                                tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                        DropdownMenu(
                            expanded = engineMenuExpanded,
                            onDismissRequest = { engineMenuExpanded = false }
                        ) {
                            listOf("VP", "STV", "AI").forEach { eng ->
                                DropdownMenuItem(
                                    text = { AppText(eng) },
                                    onClick = {
                                        tempEngine = eng
                                        engineMenuExpanded = false
                                    }
                                )
                            }
                        }
                    }

                    // Scope Dropdown
                    Box(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16.dp))
                                .background(LegadoTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                                .clickable { scopeMenuExpanded = true }
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppText(
                                text = tempScope,
                                color = LegadoTheme.colorScheme.onSurface,
                                fontSize = 13.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Spacer(modifier = Modifier.width(2.dp))
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = null,
                                tint = LegadoTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                        DropdownMenu(
                            expanded = scopeMenuExpanded,
                            onDismissRequest = { scopeMenuExpanded = false }
                        ) {
                            listOf("Tất cả", "Chỉ thông tin").forEach { scp ->
                                DropdownMenuItem(
                                    text = { AppText(scp) },
                                    onClick = {
                                        tempScope = scp
                                        scopeMenuExpanded = false
                                    }
                                )
                            }
                        }
                    }

                    // Save Button
                    Button(
                        onClick = {
                            TranslationConfig.applySettings(
                                enabled = tempEnabled,
                                target = tempTarget,
                                engine = tempEngine,
                                scope = tempScope
                            )
                            onDismissRequest()
                            onSave(tempEnabled, tempTarget, tempEngine, tempScope)
                            Toast.makeText(context, "Đã lưu cài đặt dịch", Toast.LENGTH_SHORT).show()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LegadoTheme.colorScheme.primary,
                            contentColor = LegadoTheme.colorScheme.onPrimary
                        ),
                        shape = RoundedCornerShape(12.dp),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 10.dp)
                    ) {
                        AppText("Lưu", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
