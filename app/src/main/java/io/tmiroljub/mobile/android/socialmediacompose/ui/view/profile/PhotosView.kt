package io.tmiroljub.mobile.android.socialmediacompose.ui.view.profile

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage
import io.tmiroljub.mobile.android.socialmediacompose.R
import io.tmiroljub.mobile.android.socialmediacompose.ui.theme.SocialMediaComposeTheme
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.StaggeredVerticalGrid

@Composable
fun PhotosView(photos :List<String>){
    Text(
        text = stringResource(R.string.photos), modifier = Modifier
            .padding(top = 6.dp)
            .fillMaxWidth(), textAlign = TextAlign.Start,
        style = MaterialTheme.typography.h2
    )
    StaggeredVerticalGrid(
        maxColumnWidth = 260.dp,
        modifier = Modifier.padding(4.dp)
    ) {
        photos.forEach { photo ->
            PhotoView(photo)
        }
    }
}

@Composable
fun PhotoView(
    photo: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.padding(4.dp),
        color = MaterialTheme.colors.surface,
        elevation = SocialMediaComposeTheme.elevations.card,
        shape = MaterialTheme.shapes.medium
    ) {
        CoilImage(
            data = photo,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(160.dp)
                .height(100.dp),
            loading = {
            },
            error = {
            }
        )
    }
}
