package com.example.projetmeteointernationalisation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var mBtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        //Vérification du login et du mot de passe pour la connexion a l'application
        loginButton.setOnClickListener {
            if (username.text.toString() == "alexds2000@outlook.fr" && password.text.toString() == "1234"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Connexion réussie!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Connexion échouée!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}