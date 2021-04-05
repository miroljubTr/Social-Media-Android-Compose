package io.tmiroljub.mobile.android.socialmediacompose.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import io.tmiroljub.mobile.android.socialmediacompose.R
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.favorite.FavoriteScreen
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.home.HomeScreen
import io.tmiroljub.mobile.android.socialmediacompose.ui.view.profile.ProfileScreen

@ExperimentalFoundationApi
@Composable
fun SocialMediaScreen(navigateTo: (String) -> Unit) {
    val navController = rememberNavController()
    val sections =
        listOf(MainSection.Home, MainSection.Favorite, MainSection.Profile)
    Scaffold(
        topBar = { MainAppBar() },
        bottomBar = { MainBottomNavigation(navController = navController, sections = sections) }
    ) { innerPadding ->
        val modifier = Modifier.padding(innerPadding)
        NavHost(navController = navController, startDestination = MainSection.Home.route) {

            composable(MainSection.Home.route) {
                HomeScreen(
                    viewModel = it.hiltNavGraphViewModel(), modifier = modifier
                ) { route ->
                    navigateTo(route)
                }
            }
            composable(MainSection.Profile.route) {
                ProfileScreen(
                    viewModel = it.hiltNavGraphViewModel(),
                    modifier
                )
            }
            composable(MainSection.Favorite.route) {
                FavoriteScreen(
                    viewModel = it.hiltNavGraphViewModel(),
                    modifier
                )
            }
        }
    }
}

@Composable
fun MainAppBar(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primary
) {
    TopAppBar(
        title = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(R.string.social_media_android_compose))
            }
        },
        backgroundColor = backgroundColor,
        modifier = modifier
    )
}

@Composable
fun MainBottomNavigation(
    sections: List<MainSection>,
    navController: NavHostController
) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
        sections.forEach { section ->
            BottomNavigationItem(
                icon = { Icon(imageVector = section.icon, contentDescription = "") },
                label = { Text(stringResource(section.label)) },
                alwaysShowLabel = false,
                selected = currentRoute == section.route,
                onClick = {
                    navController.navigate(route = section.route) {
                        popUpTo(currentRoute.orEmpty()) { inclusive = true }
                    }
                }
            )
        }
    }
}

@Composable
inline fun <reified VM : ViewModel> NavBackStackEntry.hiltNavGraphViewModel(): VM {
    val viewModelFactory = HiltViewModelFactory(LocalContext.current, this)
    return ViewModelProvider(this, viewModelFactory).get(VM::class.java)
}

sealed class MainSection(val route: String, @StringRes val label: Int, val icon: ImageVector) {
    object Home : MainSection("home", R.string.label_home, Icons.Outlined.Home)
    object Profile : MainSection("profile", R.string.label_profile, Icons.Outlined.AccountCircle)
    object Favorite : MainSection("favorite", R.string.label_favorite, Icons.Outlined.Favorite)
}

sealed class ScreenSection(val route: String) {
    object Main : ScreenSection("main")
    object Comment : ScreenSection("comment")
}

