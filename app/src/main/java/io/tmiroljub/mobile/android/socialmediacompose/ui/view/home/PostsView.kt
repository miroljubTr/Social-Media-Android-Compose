package io.tmiroljub.mobile.android.socialmediacompose.ui.view.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.coil.CoilImage
import io.tmiroljub.mobile.android.socialmediacompose.R
import io.tmiroljub.mobile.android.socialmediacompose.data.model.Post
import io.tmiroljub.mobile.android.socialmediacompose.ui.navigation.ScreenSection
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.NetworkImage

@Composable
fun PostListView(posts: List<Post>, modifier : Modifier, navigateTo: (String) -> Unit) {
    for(post in posts) {
        PostCard(post, modifier, navigateTo)
    }
}

@Composable
fun PostCard(post: Post, modifier: Modifier = Modifier, navigateTo: (String) -> Unit) {
    Card(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 8.dp)
            .clickable(onClick = {
                navigateTo(ScreenSection.Comment.route)
            }),
        shape = RoundedCornerShape(16.dp),
        elevation = 3.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
        ) {
            val imageModifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .clip(shape = RoundedCornerShape(percent = 6))
            Row( modifier = Modifier.padding(top = 8.dp, bottom = 6.dp),verticalAlignment = Alignment.CenterVertically) {
                CoilImage(
                    data = post.owner.picture,
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .clip(CircleShape),
                    loading = {
                    },
                    error = {
                    }
                )

                Column(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
                    Text(
                        text = post.owner.lastName + " " +  post.owner.firstName,
                        style = MaterialTheme.typography.h1
                    )
                    Text(text = post.date,
                        style = MaterialTheme.typography.caption
                    )
                }

            }

            NetworkImage(
                url = post.image,
                contentDescription = null,
                modifier = imageModifier
            )

            Row(modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)) {
                for (category in post.categories) {
                    CategoryChip(category)

                }
            }
            Text(
                text = post.title,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = post.text,
                style = MaterialTheme.typography.body2
            )
            Row(modifier = Modifier.padding(top = 12.dp)) {
                Text(
                    text =  stringResource(R.string.likes,post.likes.toString()),
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 4.dp)
                        .wrapContentWidth(Alignment.Start)
                )
                Text(
                    text =  stringResource(R.string.comments, post.comments.toString() ),
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 4.dp)
                        .wrapContentWidth(Alignment.End)
                )
            }
        }
    }
}