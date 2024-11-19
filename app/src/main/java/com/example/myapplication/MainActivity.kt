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
        val ZeroButton: Button = findViewById(R.id.ZeroButton)
        val FiftyButton: Button = findViewById(R.id.FiftyButton)
        val OneHunderedButton: Button = findViewById(R.id.OneHunderedButton)

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

        // Nastavení kliknutí na tlačítko
        ZeroButton.setOnClickListener {
            counter = 0 // Snizte počítadlo
            counterText.text = counter.toString() // Aktualizujte zobrazený text
        }

        // Nastavení kliknutí na tlačítko
        FiftyButton.setOnClickListener {
            counter = 50 // Snizte počítadlo
            counterText.text = counter.toString() // Aktualizujte zobrazený text
        }

        // Nastavení kliknutí na tlačítko
        OneHunderedButton.setOnClickListener {
            counter = 100 // Snizte počítadlo
            counterText.text = counter.toString() // Aktualizujte zobrazený text
        }
    }
}