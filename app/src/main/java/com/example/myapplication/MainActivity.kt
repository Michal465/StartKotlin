package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var counter = 0 // Proměnná pro uchování počítadla

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Připojení prvků z XML
        val counterText: TextView = findViewById(R.id.counterText)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val decrementButton: Button = findViewById(R.id.decrementButton)

        // Nastavení kliknutí na tlačítko
        incrementButton.setOnClickListener {
            counter++ // Zvyšte počítadlo
            counterText.text = counter.toString() // Aktualizujte zobrazený text
        }

        // Nastavení kliknutí na tlačítko
        decrementButton.setOnClickListener {
            counter-- // Snizte počítadlo
            counterText.text = counter.toString() // Aktualizujte zobrazený text
        }
    }
}