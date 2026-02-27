package me.nicolasduarte.quizandroidpabloosorio

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nicolasduarte.quizandroidpabloosorio.ui.theme.QuizAndroidPabloOsorioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizAndroidPabloOsorioTheme {
            }
        }
    }
}


//@Preview(showSystemUi = true)
@Composable
fun Pantalla() {
    Column(modifier = Modifier.fillMaxSize().background(color = Color.White).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Encabezado", modifier = Modifier.background(color = Color.Cyan).padding(8.dp))
        Spacer(modifier = Modifier.padding(150.dp))
        Row(Modifier.fillMaxWidth().background(color = Color.Green).padding(24.dp), horizontalArrangement = Arrangement.SpaceAround) {
            Text(text = "Item 1", modifier = Modifier.background(color = Color.Yellow).padding(8.dp))
            Text(text = "Item 2", modifier = Modifier.background(color = Color.Red).padding(8.dp))
            Text(text = "Item 3", modifier = Modifier.background(color = Color.Magenta).padding(8.dp))
        }
        Spacer(modifier = Modifier.padding(150.dp))
        Text(text = "Pie de Página", modifier = Modifier.background(color = Color.Red).padding(8.dp))
    }

}
@Preview(showSystemUi = true)
@Composable
fun Pantalla2(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.White).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Cubo verde", modifier = Modifier.clip(
            CircleShape
        ))
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Juan Pérez", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Desarrollador Android apasionado por la tecnología y el diseño", fontSize = 16.sp, textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.padding(20.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(30.dp).background(color = Color.White), horizontalArrangement = Arrangement.SpaceAround) {
            Column() {
                Text(text = "150", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Post", fontSize = 16.sp)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "2.3k", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "seguidores", fontSize = 16.sp)
            }
            Column() {
                Text(text = "980", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "Likes", fontSize = 16.sp)
            }

        }
    }
}