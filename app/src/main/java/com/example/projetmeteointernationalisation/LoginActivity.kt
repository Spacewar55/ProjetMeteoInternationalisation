package com.example.projetmeteointernationalisation

import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.res.Configuration
import android.media.audiofx.DynamicsProcessing.Config
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.Locale

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadLocate()

        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val mBtn = findViewById<Button>(R.id.traductionButton)

        mBtn.setOnClickListener {
            showChangeLanguage()
        }

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

    private fun showChangeLanguage() {
        val listItmes = arrayOf("Francais", "English", "Deutsch")

        val mBuilder = AlertDialog.Builder(this@LoginActivity)
        mBuilder.setTitle("Choisissez votre langue")
        mBuilder.setSingleChoiceItems(listItmes, -1) { dialog, which ->
            if (which == 0){
                setLocate("fr")
                recreate()
            }
            if (which == 1){
                setLocate("en")
                recreate()
            }
            if (which == 2){
                setLocate("de")
                recreate()
            }

            dialog.dismiss()
        }
        val mDialog = mBuilder.create()

        mDialog.show()
    }

    private fun setLocate(Language: String) {
        val locale = Locale(Language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)

        val editor = getSharedPreferences("Parametres", Context.MODE_PRIVATE).edit()
        editor.putString("Mon_language", Language)
        editor.apply()
    }

    private fun loadLocate() {
        val sharedPreferences = getSharedPreferences("Parametres", Context.MODE_PRIVATE)
        val language = sharedPreferences.getString("Mon_language", "")
        setLocate(language.toString())
    }
}