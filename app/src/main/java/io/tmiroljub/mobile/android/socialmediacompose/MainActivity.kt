package io.tmiroljub.mobile.android.socialmediacompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.tmiroljub.mobile.android.socialmediacompose.ui.navigation.ScreenSection
import io.tmiroljub.mobile.android.socialmediacompose.ui.navigation.SocialMediaScreen
import io.tmiroljub.mobile.android.socialmediacompose.ui.navigation.hiltNavGraphViewModel
import io.tmiroljub.mobile.android.socialmediacompose.ui.theme.IndigoTheme
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.comments.CommentsScreen

@AndroidEntryPoint
@ExperimentalFoundationApi
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IndigoTheme() {
                MyApp()
            }
        }
    }

    @ExperimentalFoundationApi
    @Composable
    fun MyApp() {
        val navController = rememberNavController()

        Surface(color = MaterialTheme.colors.background) {
            NavHost(navController, startDestination = ScreenSection.Main.route) {
                composable(ScreenSection.Main.route) {
                    SocialMediaScreen(){ route ->
                        navController.navigate(route = route) {
                        }
                    }
                }
                composable(ScreenSection.Comment.route) {
                    CommentsScreen(
                        viewModel = it.hiltNavGraphViewModel(),
                        onBackPressed = { navController.navigateUp() }
                    )
                }
            }

        }
    }
}