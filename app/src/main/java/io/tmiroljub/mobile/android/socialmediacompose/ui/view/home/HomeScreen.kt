package io.tmiroljub.mobile.android.socialmediacompose.ui.view.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import io.tmiroljub.mobile.android.socialmediacompose.ui.viewmodel.SocialMediaViewModel

@ExperimentalFoundationApi
@Composable
fun HomeScreen(viewModel: SocialMediaViewModel,
               modifier: Modifier = Modifier, navigateTo: (String) -> Unit) {
    viewModel.getStories()
    viewModel.getPosts()
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        val stories  = viewModel.stories.observeAsState(initial =  emptyList())
        val posts = viewModel.posts.observeAsState(initial = emptyList())
        StoriesView(stories = stories.value)
        PostListView(posts = posts.value,modifier, navigateTo)
    }
}