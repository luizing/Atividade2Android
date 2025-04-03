package br.unifor.atividade2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import br.unifor.atividade2.ui.theme.Atividade2Theme
import br.unifor.atividade2.data.PlanetDatabase
import br.unifor.atividade2.ui.component.PlanetComponent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val planetas = PlanetDatabase.findAll()
                    LazyColumn(
                        modifier = Modifier.padding(innerPadding)
                    ) {

                        item{
                            Text(
                                text = "Lista de Planetas",
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp
                            )
                        }

                        items(planetas){ planeta ->
                            PlanetComponent(planeta)


                        }


                    }
                }
            }
        }
    }
}