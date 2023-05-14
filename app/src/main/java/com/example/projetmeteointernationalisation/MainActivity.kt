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
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /*private val mqttClient by lazy {
        MqttClientHelper(this)
    }*/

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ouvre la vue paramètre
        val parametreButton = findViewById<Button>(R.id.settingsButton)
        parametreButton.setOnClickListener {
            val intent = Intent(this, ParametreActivity::class.java)
            startActivity(intent)
        }

        //setSupportActionBar(toolbar)
        /*textViewMsgPayload.movementMethod = ScrollingMovementMethod()

        setMqttCallBack()

        // initialize 'num msgs received' field in the view
        textViewNumMsgs.text = "0"

        // publisher button
        btnPub.setOnClickListener { view ->
            var snackbarMsg : String
            val topic = editTextPubTopic.text.toString().trim()
            snackbarMsg = "Cannot publish to empty topic!"
            if (topic.isNotEmpty()) {
                snackbarMsg = try {
                    mqttClient.publish(topic, editTextMsgPayload.text.toString())
                    "Published to topic '$topic'"
                } catch (ex: MqttException) {
                    "Error publishing to topic: $topic"
                }
            }
            Snackbar.make(view, snackbarMsg, 300)
                .setAction("Action", null).show()

        }

        // subcriber button
        btnSub.setOnClickListener { view ->
            var snackbarMsg : String
            val topic = editTextSubTopic.text.toString().trim()
            snackbarMsg = "Cannot subscribe to empty topic!"
            if (topic.isNotEmpty()) {
                snackbarMsg = try {
                    mqttClient.subscribe(topic)
                    "Subscribed to topic '$topic'"
                } catch (ex: MqttException) {
                    "Error subscribing to topic: $topic"
                }
            }
            Snackbar.make(view, snackbarMsg, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }

        Timer("CheckMqttConnection", false).schedule(3000) {
            if (!mqttClient.isConnected()) {
                Snackbar.make(textViewNumMsgs, "Failed to connect to: '$SOLACE_MQTT_HOST' within 3 seconds", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Action", null).show()
            }
        }*/

    }

    /*private fun setMqttCallBack() {
        mqttClient.setCallback(object : MqttCallbackExtended {
            override fun connectComplete(b: Boolean, s: String) {
                val snackbarMsg = "Connected to host:\n'$SOLACE_MQTT_HOST'."
                Log.w("Debug", snackbarMsg)
                Snackbar.make(findViewById(android.R.id.content), snackbarMsg, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
            override fun connectionLost(throwable: Throwable) {
                val snackbarMsg = "Connection to host lost:\n'$SOLACE_MQTT_HOST'"
                Log.w("Debug", snackbarMsg)
                Snackbar.make(findViewById(android.R.id.content), snackbarMsg, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
            @Throws(Exception::class)
            override fun messageArrived(topic: String, mqttMessage: MqttMessage) {
                Log.w("Debug", "Message received from host '$SOLACE_MQTT_HOST': $mqttMessage")
                textViewNumMsgs.text = ("${textViewNumMsgs.text.toString().toInt() + 1}")
                val str: String = "------------"+ Calendar.getInstance().time +"-------------\n$mqttMessage\n${textViewMsgPayload.text}"
                textViewMsgPayload.text = str
            }

            override fun deliveryComplete(iMqttDeliveryToken: IMqttDeliveryToken) {
                Log.w("Debug", "Message published to host '$SOLACE_MQTT_HOST'")
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onDestroy() {
        mqttClient.destroy()
        super.onDestroy()
    }*/
}