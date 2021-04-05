package io.tmiroljub.mobile.android.socialmediacompose.ui.view.profile

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.NetworkImage
import io.tmiroljub.mobile.android.socialmediacompose.ui.viewmodel.SocialMediaViewModel

@Composable
fun ProfileScreen(
    viewModel: SocialMediaViewModel,
    modifier: Modifier = Modifier
) {
    viewModel.getProfile()
    val profile = viewModel.profile.observeAsState()
    Box(
        modifier
            .padding(16.dp, 8.dp),
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            profile.value?.let {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = MaterialTheme.colors.surface
                ) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        NetworkImage(
                            url = it.thumbUrl,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )
                        ProfileDetailView(it)
                    }
                }
                Text(
                    text = it.text,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                    style = MaterialTheme.typography.body1
                )
                PhotosView(it.photos)
            }
        }
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun ProfilePreviewDark() {



}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun ProfilePreview() {



}