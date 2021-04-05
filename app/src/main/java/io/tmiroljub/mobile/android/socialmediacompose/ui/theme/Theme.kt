package io.tmiroljub.mobile.android.socialmediacompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Elevations(val card: Dp = 0.dp)

internal val LocalElevations = staticCompositionLocalOf { Elevations() }

private val BlueThemeLight = lightColors(
    primary = blue700,
    onPrimary = Color.White,
    primaryVariant = blue800,
    secondary = yellow500
)

private val BlueThemeDark = darkColors(
    primary = blue200,
    secondary = yellow200,
    surface = blueDarkPrimary
)

private val IndigoThemeLight = lightColors(
    primary = indigo800,
    onPrimary = Color.White,
    primaryVariant = indigo700,
    secondary = deepOrange500
)

private val IndigoThemeDark = darkColors(
    primary = indigo200,
    secondary = deepOrange200,
    surface = indigoDarkPrimary
)



@Composable
fun BlueTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        BlueThemeDark
    } else {
        BlueThemeLight
    }
    SocialMediaComposeTheme(darkTheme, colors, content)
}


@Composable
fun IndigoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        IndigoThemeDark
    } else {
        IndigoThemeLight
    }
    SocialMediaComposeTheme(darkTheme, colors, content)
}


private val LightElevation = Elevations()

private val DarkElevation = Elevations(card = 1.dp)

@Composable
fun SocialMediaComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(),
                            colors: Colors,
                            content: @Composable() () -> Unit) {
    val elevation = if (darkTheme) DarkElevation else LightElevation
    //val colors = if (darkTheme) DarkColorPalette else LightColorPalette
    CompositionLocalProvider(
        LocalElevations provides elevation
    ) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

object SocialMediaComposeTheme {

    val colors: Colors
        @Composable
        get() = MaterialTheme.colors

    val typography: Typography
        @Composable
        get() = MaterialTheme.typography


    val elevations: Elevations
        @Composable
        get() = LocalElevations.current

}

