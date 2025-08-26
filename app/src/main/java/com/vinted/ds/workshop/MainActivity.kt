package com.vinted.ds.workshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vinted.bloom.compose.molecule.list.BloomVerticalList
import com.vinted.bloom.compose.theme.BloomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                BloomVerticalList {

                }
            }
        }
    }
}