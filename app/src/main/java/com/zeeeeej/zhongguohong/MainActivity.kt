package com.zeeeeej.zhongguohong

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zeeeeej.zhongguohong.color.ZhRed
import com.zeeeeej.zhongguohong.color.ZhongGuoSe
import com.zeeeeej.zhongguohong.ui.theme.ZhongGuoHongTheme
import com.zeeeej.xlog.XLog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ZhongGuoHongTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

private fun ZhongGuoSe.toColor() = Color(this.r, this.g, this.b, this.a)

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "中国红",
            modifier = modifier,
            fontSize = 48.sp,
            //color = colorResource(id = R.color.zh_hong)
            color = ZhRed.toColor()
        )

        Text(
            text = XLog.msg(),
            modifier = modifier,
            fontSize = 12.sp,
            //color = colorResource(id = R.color.zh_hong)
            color = Color.Black
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ZhongGuoHongTheme {
        Greeting("Android")
    }
}