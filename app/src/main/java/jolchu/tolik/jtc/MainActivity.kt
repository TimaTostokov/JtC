package jolchu.tolik.jtc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import jolchu.tolik.jtc.screen.MainCard
import jolchu.tolik.jtc.screen.TabLayout
import jolchu.tolik.jtc.ui.theme.JtCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JtCTheme {
                Image(
                    painter = painterResource(id = R.drawable.weather_bg),
                    contentDescription = "img1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5f),
                    contentScale = ContentScale.FillBounds
                )
                Column {
                    MainCard()
                    TabLayout()
                }
            }
        }
    }

}