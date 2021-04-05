package io.tmiroljub.mobile.android.socialmediacompose.ui.view.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.tmiroljub.mobile.android.socialmediacompose.R

@Composable
fun FollowersView(followers : Int){
    Column(
        modifier = Modifier.padding(top = 8.dp, end = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = followers.toString(),
            style = MaterialTheme.typography.subtitle2,
            color = Color.White
        )
        Text(
            text = stringResource(R.string.followers),
            style = MaterialTheme.typography.caption,
            color = Color.White
        )
    }
}