package io.legado.app.ui.main.homepage.modules

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.legado.app.data.entities.SearchBook
import io.legado.app.ui.main.bookCoverSharedElementKey
import io.legado.app.ui.main.homepage.HomepageBookItemUi
import io.legado.app.ui.theme.LegadoTheme
import io.legado.app.ui.widget.components.image.cover.CoilBookCover
import io.legado.app.ui.widget.components.text.AppText
import kotlinx.collections.immutable.ImmutableList
import kotlin.math.abs

/**
 * CoverFlow module: Gallery bìa sách cuộn ngang.
 * Item ở giữa lớn hơn, các item bên cạnh nhỏ dần và hơi mờ — giống Apple CoverFlow.
 */
@OptIn(ExperimentalSharedTransitionApi::class, ExperimentalFoundationApi::class)
@Composable
fun CoverFlowModule(
    books: ImmutableList<HomepageBookItemUi>,
    onClick: (SearchBook, String?) -> Unit,
    onLongClick: ((SearchBook, String?) -> Unit)? = null,
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope? = null,
    animatedVisibilityScope: AnimatedVisibilityScope? = null,
    sharedCoverKeySourceId: String? = null,
) {
    if (books.isEmpty()) return

    val listState = rememberLazyListState()

    LazyRow(
        state = listState,
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 48.dp),
        horizontalArrangement = Arrangement.spacedBy(0.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        itemsIndexed(
            items = books,
            key = { index, item -> "${item.book.bookUrl}:$index" }
        ) { index, item ->
            val sharedCoverKey = bookCoverSharedElementKey(
                item.book.bookUrl,
                sharedCoverKeySourceId?.let { "$it:$index" }
            )

            // Calculate distance from center for scale/alpha effects
            val centerOffset by remember {
                derivedStateOf {
                    val layoutInfo = listState.layoutInfo
                    val viewportCenter =
                        (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2f
                    val itemInfo = layoutInfo.visibleItemsInfo.find { it.index == index }
                    if (itemInfo != null) {
                        val itemCenter = itemInfo.offset + itemInfo.size / 2f
                        abs(itemCenter - viewportCenter) / viewportCenter.coerceAtLeast(1f)
                    } else {
                        1f
                    }
                }
            }

            val scale = (1f - centerOffset * 0.2f).coerceIn(0.8f, 1f)
            val alpha = (1f - centerOffset * 0.4f).coerceIn(0.5f, 1f)

            Column(
                modifier = Modifier
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                        this.alpha = alpha
                    }
                    .width(110.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .shadow(
                        elevation = if (centerOffset < 0.3f) 8.dp else 2.dp,
                        shape = RoundedCornerShape(14.dp)
                    )
                    .combinedClickable(
                        onClick = { onClick(item.book, sharedCoverKey) },
                        onLongClick = onLongClick?.let { cb ->
                            { cb(item.book, sharedCoverKey) }
                        }
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CoilBookCover(
                    name = item.book.name,
                    author = item.book.author,
                    path = item.book.coverUrl,
                    modifier = Modifier
                        .width(110.dp)
                        .height(155.dp),
                    radius = 14.dp,
                )
                AppText(
                    text = item.book.name,
                    style = LegadoTheme.typography.labelSmall,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.width(100.dp),
                )
            }
        }
    }
}
