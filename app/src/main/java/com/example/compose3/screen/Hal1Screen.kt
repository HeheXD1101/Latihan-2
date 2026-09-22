package com.example.compose3.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Hal1Screen(onNavigateToHal2: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "NIM: 245150407111037", style = MaterialTheme.typography.titleMedium)
        Text(text = "Nama: Muhammad Murfid Kharomen", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = "Screen 1")
        Spacer(modifier = Modifier.size(10.dp))
        Button (onClick = onNavigateToHal2) { Text("Ke halaman 2") }
    }
}

@Preview
@Composable
fun PreviewHal1Screen() {
    Hal1Screen(onNavigateToHal2 = {})
}
