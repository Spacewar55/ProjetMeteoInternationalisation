package com.example.projetmeteointernationalisation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ParametreActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.parametre)

        val settingButton = findViewById<Button>(R.id.settingsSave)
        val broker = findViewById<EditText>(R.id.broker)
        val api = findViewById<EditText>(R.id.api)

        //Vérification des champs broker et APi
        //Si vide = erreur sinon retour à la page principale
        settingButton.setOnClickListener {
            if (broker.text.toString() == "" || api.text.toString() == ""){
                Toast.makeText(this, "Les champs Broker et API ne doivent pas être vide", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Paramètres enregistrés", Toast.LENGTH_SHORT).show()
            }
        }
    }
}