package io.tmiroljub.mobile.android.socialmediacompose.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.tmiroljub.mobile.android.socialmediacompose.data.SocialMediaRepository
import io.tmiroljub.mobile.android.socialmediacompose.data.model.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SocialMediaViewModel @Inject constructor(
    private val repository: SocialMediaRepository
) : ViewModel() {

    private val _stories = MutableLiveData<List<Storie>>(emptyList())
    val stories: LiveData<List<Storie>> = _stories

    private val _posts = MutableLiveData<List<Post>>(emptyList())
    val posts: LiveData<List<Post>> = _posts

    private val _favorites = MutableLiveData<List<Favorite>>(emptyList())
    val favorites: LiveData<List<Favorite>> = _favorites

    private val _profile = MutableLiveData<Profile>()
    val profile: LiveData<Profile> = _profile

    private val _comments = MutableLiveData<List<Comments>>()
    val comments: LiveData<List<Comments>> = _comments

    fun getStories() {
        viewModelScope.launch {
            _stories.value = repository.getStories()
        }
    }

    fun getPosts() {
        viewModelScope.launch {
            _posts.value = repository.getPosts()
        }
    }

    fun getFavorites() {
        viewModelScope.launch {
            _favorites.value = repository.getFavorites()
        }
    }

    fun getProfile() {
        viewModelScope.launch {
            _profile.value = repository.getProfile()
        }
    }

    fun getComments() {
        viewModelScope.launch {
            _comments.value = repository.getComments()
        }
    }

}