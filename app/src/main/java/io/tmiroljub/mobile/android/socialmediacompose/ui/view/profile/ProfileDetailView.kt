package io.tmiroljub.mobile.android.socialmediacompose.ui.view.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.tmiroljub.mobile.android.socialmediacompose.data.model.Profile
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.compoment.NetworkImage

@Composable
fun ProfileDetailView(profile : Profile) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        NetworkImage(
            url = profile.picture,
            contentDescription = null,
            modifier =  Modifier
                .width(60.dp)
                .height(60.dp)
                .clip(CircleShape)
        )

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = profile.firstName + " " + profile.lastName,
            style = MaterialTheme.typography.subtitle1,
            color = Color.White
        )
        Text(
            text = profile.email,
            style = MaterialTheme.typography.caption,
            color = Color.White
        )
        Row(modifier = Modifier.padding(top = 8.dp, end = 8.dp))
        {
            FollowersView(profile.followers)
            Divider(
                modifier = Modifier
                    .height(50.dp)
                    .width(1.dp)
            )
            FollowingView(profile.following)
        }
    }
}