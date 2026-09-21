package com.example.compose3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose3.screen.Hal1Screen
import com.example.compose3.screen.Hal2Screen
import com.example.compose3.ui.theme.Compose3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose3Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = NavDestination.Hal1)
                {
                    composable(NavDestination.Hal1) {
                        Hal1Screen(onNavigateToHal2 = { navController.navigate(NavDestination.Hal2) })
                    }
                    composable(NavDestination.Hal2) {
                        Hal2Screen(onNavigateToHal1 = { navController.navigate(NavDestination.Hal1) })
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose3Theme {

    }
}