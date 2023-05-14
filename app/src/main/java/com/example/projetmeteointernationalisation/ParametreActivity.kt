/**
Vue Principale de l'application
@author Alex De Souza
    @version 1.0 17/02/23
        Création de la page + fonctionnement
 */

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
                Toast.makeText(this, getString(R.string.txtSettingsN), Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, getString(R.string.txtSettingsY), Toast.LENGTH_SHORT).show()
            }
        }
    }
}