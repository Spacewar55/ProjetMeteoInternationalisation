package com.example.projetmeteointernationalisation

// Adresse de connection au broker
const val SOLACE_MQTT_HOST = "tcp://172.16.5.100:1883"

// Autre options
const val SOLACE_CONNECTION_TIMEOUT = 3
const val SOLACE_CONNECTION_KEEP_ALIVE_INTERVAL = 60
const val SOLACE_CONNECTION_CLEAN_SESSION = true
const val SOLACE_CONNECTION_RECONNECT = true