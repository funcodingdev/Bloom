package cn.funcoding.bloom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cn.funcoding.bloom.ui.theme.BloomTheme
import cn.funcoding.bloom.ui.theme.body1
import cn.funcoding.bloom.ui.theme.body2
import cn.funcoding.bloom.ui.theme.button
import cn.funcoding.bloom.ui.theme.gray
import cn.funcoding.bloom.ui.theme.h1
import cn.funcoding.bloom.ui.theme.medium
import cn.funcoding.bloom.ui.theme.pink900
import cn.funcoding.bloom.ui.theme.small
import cn.funcoding.bloom.ui.theme.white

@Composable
fun LoginPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(white)
            .padding(horizontal = 16.dp)
    ) {
        LoginTitle()
        LoginInputBox()
        HiltWithUnderLine()
        LoginButton()
    }
}

@Composable
fun LoginTitle() {
    Text(
        text = "Log in with Email",
        modifier = Modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 184.dp, bottom = 16.dp),
        style = h1,
        color = gray,
        textAlign = TextAlign.Center
    )
}

@Composable
fun LoginInputBox() {
    LoginTextField(placeholder = "Email address")
    Spacer(modifier = Modifier.height(8.dp))
    LoginTextField(placeholder = "Password(8+Characters)")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(placeholder: String) {
    OutlinedTextField(value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clip(small),
        placeholder = {
            Text(
                text = placeholder, style = body1, color = gray
            )
        })
}

@Composable
fun HiltWithUnderLine() {
    Column(
        modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 16.dp)
    ) {
        TopText()
        BottomText()
    }
}

@Composable
fun TopText() {
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val keywordPre = "By Clicking below you agree to our".split(" ")
        val keywordPost = "and consent".split(" ")
        for (word in keywordPre) {
            Text(text = word, style = body2, color = gray)
        }
        Text(
            text = "Terms of Use",
            style = body2,
            color = gray,
            textDecoration = TextDecoration.Underline
        )
        for (word in keywordPost) {
            Text(text = word, style = body2, color = gray)
        }
    }
}

@Composable
fun BottomText() {
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "to Our ", style = body2, color = gray)
        Text(
            text = "privacy Policy.",
            style = body2,
            color = gray,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Composable
fun LoginButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .clip(medium),
        colors = ButtonDefaults.buttonColors(containerColor = pink900)
    ) {
        Text(text = "Log in", style = button, color = white)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    BloomTheme {
        LoginPage()
    }
}