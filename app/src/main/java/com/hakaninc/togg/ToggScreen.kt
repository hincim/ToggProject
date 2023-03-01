package com.hakaninc.togg

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/*
@Composable
fun ToggScreen(
    navController: NavController,
){

    val image : Painter = painterResource(id = R.drawable.togg)
    val animatedProgress = remember { Animatable(0f) }

    val infiniteTransition = rememberInfiniteTransition()

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000),
            repeatMode = RepeatMode.Restart
        )
    )

    androidx.compose.material.Surface(
        color = androidx.compose.ui.graphics.Color.Black,

    ) {
            Box(modifier = Modifier.fillMaxSize()
                .graphicsLayer(rotationZ = animatedProgress.value).clickable {
                    lifec
                }){
                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxSize()) {
                    Image(painter = image, contentDescription = "Togg",
                        alignment = Alignment.Center, modifier = Modifier.size(250.dp,250.dp))

        }

    }
    }
}
*/

@Composable
fun ToggScreen(navController: NavController) {

    val image: Painter = painterResource(id = R.drawable.togg)

    androidx.compose.material.Surface(color = androidx.compose.ui.graphics.Color.Black) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            // Animasyon kodunu burada yazın
            val animatedProgress = remember { Animatable(0f) }

            LaunchedEffect(Unit) {
                animatedProgress.animateTo(
                    targetValue = 360f,
                    animationSpec = tween(durationMillis = 1500)
                )
            }

            Box(
                modifier = Modifier
                    .graphicsLayer(
                        rotationY = animatedProgress.value
                    )
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = image, contentDescription = "Togg",
                        alignment = Alignment.Center, modifier = Modifier.size(250.dp, 250.dp)
                    )
                }
            }
        }
    }
}




















