package com.vinted.ds.workshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vinted.bloom.compose.theme.BloomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                Button(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .height(44.dp),
                    onClick = { /* Do something */ },
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = Color(0xFF007782),
                        contentColor = Color.White,
                    ),
                    shape = RoundedCornerShape(4.dp),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Text("Click me")
                        Spacer(modifier = Modifier.size(3.dp))
                        Icon(
                            painter = painterResource(R.drawable.icon),
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}