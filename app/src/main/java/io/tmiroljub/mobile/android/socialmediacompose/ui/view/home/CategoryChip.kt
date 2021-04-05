package io.tmiroljub.mobile.android.socialmediacompose.ui.view.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.tmiroljub.mobile.android.socialmediacompose.data.*
import io.tmiroljub.mobile.android.socialmediacompose.ui.theme.BlueTheme

@Composable
fun CategoryChip(
    category: String
) {
    Surface(
        modifier = Modifier.padding(end = 6.dp),
        elevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colors.secondary
    ) {
        Row(
        ) {
            Text(
                text = category,
                style = MaterialTheme.typography.caption,
                color = Color.White,
                modifier = Modifier.padding(
                    start = 6.dp,
                    end = 6.dp, top = 4.dp, bottom = 4.dp
                )
            )
        }
    }
}

@ExperimentalFoundationApi
@Preview("Category Chip Dark")
@Composable
fun CategoryChipPreviewDark() {
    BlueTheme(darkTheme = true) {
        CategoryChip(categories2[1])
    }
}

@ExperimentalFoundationApi
@Preview("Category Chip Light")
@Composable
fun CategoryChipPreviewLight() {
    CategoryChip(categories1[1])
}

@ExperimentalFoundationApi
@Preview("Categories Chip Dark")
@Composable
fun CategoriesChipPreviewDark() {
    BlueTheme(darkTheme = true) {
        Row(modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)) {
            categories1.forEach { category ->
                CategoryChip(category)
            }
        }
    }
}

@ExperimentalFoundationApi
@Preview("Categories Chip Lighr")
@Composable
fun CategoriesChipPreviewLight() {
    Row(modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)) {
        categories2.forEach { category ->
            CategoryChip(category)
        }
    }

}