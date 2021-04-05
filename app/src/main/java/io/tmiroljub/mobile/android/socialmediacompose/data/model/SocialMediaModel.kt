package io.tmiroljub.mobile.android.socialmediacompose.data.model

data class Storie(val name: String, val pseudo: String, val image: String)

data class Favorite(
    val id: Long,
    val name: String,
    val picture: String,
    val description: String,
    val photo: String
)

data class Post(
    val id: String, val image: String, val date: String, val title: String, val text: String,
    val categories: List<String>, val likes: Int, val comments: Int,
    val owner: Owner
)

data class Comments(
    val id: String, val text: String,val firstName: String,
    val lastName: String, val date: String, val picture: String
)

data class Owner(
    val id: String, val email: String, val title: String, val picture: String,
    val firstName: String, val lastName: String
)

data class Profile(
    val id: String, val phone: String, val firstName: String,
    val lastName: String, val email: String, val gender: String,
    val title: String, val thumbUrl: String, val picture: String, val dateOfBirth: String,
    val photos: List<String>,
    val following : Int,
    val followers : Int,
    val text: String
)
