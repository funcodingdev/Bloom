package cn.funcoding.bloom.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cn.funcoding.bloom.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default, fontWeight = FontWeight.Normal, fontSize = 16.sp
    )
)

val nunitoSansFamily = FontFamily(
    Font(R.font.nunitosans_light, FontWeight.Light),
    Font(R.font.nunitosans_semibold, FontWeight.SemiBold),
    Font(R.font.nunitosans_bold, FontWeight.Bold)
)

val h1 = TextStyle(
    fontSize = 18.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.Bold
)

val h2 = TextStyle(
    fontSize = 14.sp,
    fontFamily = nunitoSansFamily,
    letterSpacing = 0.15.sp,
    fontWeight = FontWeight.Bold
)

val subtitle1 = TextStyle(
    fontSize = 16.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.Light
)

val body1 = TextStyle(
    fontSize = 14.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.Light
)

val body2 = TextStyle(
    fontSize = 12.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.Light
)

val button = TextStyle(
    fontSize = 14.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.SemiBold
)

val caption = TextStyle(
    fontSize = 12.sp, fontFamily = nunitoSansFamily, fontWeight = FontWeight.SemiBold
)