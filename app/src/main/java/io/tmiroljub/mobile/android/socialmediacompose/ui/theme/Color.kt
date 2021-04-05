package io.tmiroljub.mobile.android.socialmediacompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

val blue200 = Color(0xff91a4fc)
val blue700 = Color(0xff0336ff)
val blue800 = Color(0xff0035c9)
val blueDarkPrimary = Color(0xff1c1d24)

val yellow200 = Color(0xffffeb46)
val yellow400 = Color(0xffffc000)
val yellow500 = Color(0xffffde03)
val yellowDarkPrimary = Color(0xff242316)

val indigo200 = Color(0xff9fa8da)
val indigo700 = Color(0xff303f9f)
val indigo800 = Color(0xff283593)
val indigoDarkPrimary = Color(0xff1c1d24)

val amber200 = Color(0xffffe082)
val amber400 = Color(0xffffd54f)
val amber500 = Color(0xffffc107)
val amber600 = Color(0xffffb300)
val amber700 = Color(0xffffa000)

val deepOrange200 = Color(0xffffcc80)
val deepOrange300 = Color(0xffffb74d)
val deepOrange400 = Color(0xffffa726)
val deepOrange500 = Color(0xffff9800)
val deepOrange600 = Color(0xfffb8c00)
val deepOrange700 = Color(0xfff57c00)


@Composable
fun Colors.compositedOnSurface(alpha: Float): Color {
    return onSurface.copy(alpha = alpha).compositeOver(surface)
}