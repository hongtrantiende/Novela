package io.legado.app.ui.main.homepage.modules

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.legado.app.data.entities.SearchBook
import io.legado.app.ui.main.bookCoverSharedElementKey
import io.legado.app.ui.main.homepage.HomepageBookItemUi
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.image.cover.CoilBookCover
import io.legado.app.ui.widget.components.text.AppText
import kotlinx.collections.immutable.ImmutableList

/**
 * Spotlight module: 1 item nổi bật lớn full-width với gradient overlay.
 * Item đầu tiên hiện dạng hero, các item tiếp theo hiện dạng row nhỏ bên dưới.
 */
@OptIn(ExperimentalSharedTransitionApi::class, ExperimentalFoundationApi::class)
@Composable
fun SpotlightModule(
    books: ImmutableList<HomepageBookItemUi>,
    onClick: (SearchBook, String?) -> Unit,
    onLongClick: ((SearchBook, String?) -> Unit)? = null,
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
    sharedCoverKeySourceId: String? = null,
) {
    if (books.isEmpty()) return

    val heroBook = books.first()
    val restBooks = if (books.size > 1) books.subList(1, minOf(books.size, 4)) else emptyList()

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        // Hero card — bìa lớn full width với gradient overlay
        val heroSharedKey = bookCoverSharedElementKey(
            heroBook.book.bookUrl,
            sharedCoverKeySourceId?.let { "$it:hero" }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(20.dp))
                .combinedClickable(
                    onClick = { onClick(heroBook.book, heroSharedKey) },
                    onLongClick = onLongClick?.let { cb -> { cb(heroBook.book, heroSharedKey) } }
                )
        ) {
            CoilBookCover(
                name = heroBook.book.name,
                author = heroBook.book.author,
                path = heroBook.book.coverUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                radius = 20.dp,
            )
            // Gradient overlay
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.85f)
                            ),
                            startY = 60f
                        )
                    )
            )
            // Text overlay
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                AppText(
                    text = heroBook.book.name,
                    style = LegadoTheme.typography.titleMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                if (heroBook.book.author.isNotBlank()) {
                    AppText(
                        text = heroBook.book.author,
                        style = LegadoTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.7f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }

        // Rest items — Row nhỏ dạng danh sách ngang
        if (restBooks.isNotEmpty()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                restBooks.forEachIndexed { index, item ->
                    val sharedKey = bookCoverSharedElementKey(
                        item.book.bookUrl,
                        sharedCoverKeySourceId?.let { "$it:rest:$index" }
                    )
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .background(LegadoTheme.colorScheme.surfaceContainerLow)
                            .combinedClickable(
                                onClick = { onClick(item.book, sharedKey) },
                                onLongClick = onLongClick?.let { cb ->
                                    { cb(item.book, sharedKey) }
                                }
                            )
                            .padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        CoilBookCover(
                            name = item.book.name,
                            author = item.book.author,
                            path = item.book.coverUrl,
                            modifier = Modifier
                                .width(70.dp)
                                .height(95.dp),
                            radius = 10.dp,
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        AppText(
                            text = item.book.name,
                            style = LegadoTheme.typography.labelSmall,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
    }
}
