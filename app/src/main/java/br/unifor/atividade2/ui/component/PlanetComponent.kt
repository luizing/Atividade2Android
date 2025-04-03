package br.unifor.atividade2.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.unifor.atividade2.data.Planet


@Composable
fun PlanetComponent(planet: Planet) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Row (
            modifier = Modifier
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(planet.photo),
                contentDescription = "Planet photo",
                modifier = Modifier
                    .size(75.dp)
                    .border(
                        BorderStroke(1.dp, Color.Blue),
                        CircleShape
                    )
                    .clip(CircleShape)

            )
            Column(
                modifier = Modifier
                    .padding(start=10.dp)
            ) {
                Text(
                    text = planet.name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = planet.diameter,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}