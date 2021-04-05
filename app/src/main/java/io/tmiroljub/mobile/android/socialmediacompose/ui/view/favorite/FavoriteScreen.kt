package io.tmiroljub.mobile.android.socialmediacompose.ui.view.favorite

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import io.tmiroljub.mobile.android.socialmediacompose.data.favorites
import io.tmiroljub.mobile.android.socialmediacompose.data.model.Favorite
import io.tmiroljub.mobile.android.socialmediacompose.ui.theme.BlueTheme
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.NetworkImage
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.OutlinedAvatar
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.StaggeredVerticalGrid
import io.tmiroljub.mobile.android.socialmediacompose.ui.viewmodel.SocialMediaViewModel

@Composable
fun FavoriteScreen(
    viewModel: SocialMediaViewModel,
    modifier: Modifier = Modifier
) {

    viewModel.getFavorites()
    val favorites = viewModel.favorites.observeAsState(initial = emptyList())

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        StaggeredVerticalGrid(
            maxColumnWidth = 220.dp,
            modifier = Modifier.padding(4.dp)
        ) {
            favorites.value.forEach { favorite ->
                Favorite(favorite)
            }
        }
    }
}

@Composable
fun Favorite(
    favorite: Favorite,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.padding(4.dp),
        color = MaterialTheme.colors.surface,
        elevation = 3.dp,
        shape = MaterialTheme.shapes.medium
    ) {
        val featuredString = ""
        ConstraintLayout(
            modifier = Modifier
                .semantics {
                    contentDescription = featuredString
                }
        ) {
            val (image, avatar, subject, name) = createRefs()
            NetworkImage(
                url = favorite.picture,
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(4f / 3f)
                    .constrainAs(image) {
                        centerHorizontallyTo(parent)
                        top.linkTo(parent.top)
                    }
            )

            OutlinedAvatar(
                url = favorite.photo,
                modifier = Modifier
                    .size(45.dp)
                    .constrainAs(avatar) {
                        centerHorizontallyTo(parent)
                        centerAround(image.bottom)
                    }
            )
            Text(
                text = favorite.name.toUpperCase(),
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .padding(8.dp)
                    .constrainAs(subject) {
                        centerHorizontallyTo(parent)
                        top.linkTo(avatar.bottom)
                    }
            )
            Text(
                text = favorite.description,
                style = MaterialTheme.typography.body2,
                maxLines = 3,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .padding(bottom = 6.dp)
                    .constrainAs(name) {
                        centerHorizontallyTo(parent)
                        top.linkTo(subject.bottom)
                    }
            )
        }

    }

}

@ExperimentalFoundationApi
@Preview("Favorite dark")
@Composable
fun FavoritePreviewDark() {
    BlueTheme(darkTheme = true) {
        Favorite(favorites[0])
    }
}

@ExperimentalFoundationApi
@Preview("Favorite Light")
@Composable
fun FavoritePreviewLight() {
    BlueTheme(darkTheme = false) {
        Favorite(favorites[1])
    }
}