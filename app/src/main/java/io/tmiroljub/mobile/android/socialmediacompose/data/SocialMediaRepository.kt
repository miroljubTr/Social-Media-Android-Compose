package io.tmiroljub.mobile.android.socialmediacompose.data

import javax.inject.Inject

class SocialMediaRepository  @Inject constructor() {

    suspend fun getPosts() = posts

    suspend fun getStories() = stories

    suspend fun getFavorites() = favorites

    suspend fun getProfile() = profile

    suspend fun getComments() = comments

}