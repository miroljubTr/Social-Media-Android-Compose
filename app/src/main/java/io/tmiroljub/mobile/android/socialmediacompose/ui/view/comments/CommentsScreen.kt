package io.tmiroljub.mobile.android.socialmediacompose.ui.view.comments

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import io.tmiroljub.mobile.android.socialmediacompose.data.model.Comments
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.NetworkImage
import io.tmiroljub.mobile.android.socialmediacompose.ui.viewmodel.SocialMediaViewModel

@Composable
fun CommentCard(comment: Comments) {
    Card(
        modifier = Modifier
            .height(140.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row() {
                NetworkImage(
                    url = comment.picture,
                    contentDescription = null,
                    modifier = Modifier
                            .width(60.dp)
                            .height(60.dp)
                            .clip(CircleShape)
                )

                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        text = comment.lastName + " " + comment.firstName,
                        style = MaterialTheme.typography.h1
                    )
                    Text(text = comment.date, style = MaterialTheme.typography.caption)
                }
            }
            Divider(modifier = Modifier.padding(2.dp))
            Text(text = comment.text, style = MaterialTheme.typography.body2)
        }
    }
}

@Composable
fun CommentsTopBar(modifier: Modifier, onBackPressed: () -> Unit) {
    ConstraintLayout(modifier) {
        val (back) = createRefs()
        IconButton(
            onClick = onBackPressed,
            Modifier.constrainAs(back) {
                start.linkTo(parent.start, margin = 8.dp)
                top.linkTo(parent.top, margin = 8.dp)
            }
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

@Composable
fun CommentsScreen(viewModel: SocialMediaViewModel, onBackPressed: () -> Unit) {
    viewModel.getComments()

    Column() {
        val comments = viewModel.comments.observeAsState(initial = emptyList())
        CommentsTopBar(Modifier, onBackPressed)
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            comments.value.forEach { comment ->
                item {
                    CommentCard(comment)
                }
            }

        }
    }
}


@ExperimentalFoundationApi
@Preview("Comment Light")
@Composable
fun CommentPreview() {

}

@ExperimentalFoundationApi
@Preview("Comment Dark")
@Composable
fun CommentPreviewDark() {

}
