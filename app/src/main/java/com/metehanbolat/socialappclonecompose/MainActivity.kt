package com.metehanbolat.socialappclonecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.socialappclonecompose.ui.theme.SocialAppCloneComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SocialAppCloneComposeTheme {

            }
        }
    }
}