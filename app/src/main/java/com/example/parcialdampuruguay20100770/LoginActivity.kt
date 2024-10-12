package com.example.parcialdampuruguay20100770

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inicializar vistas
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.btnLogin)

        // Configurar el click listener para el botón de login
        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            // Verificar las credenciales
            if (email == "invitado@android.com" && password == "invitado123") {
                // Si las credenciales son correctas, redirigir al Navigation Drawer
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finalizamos la actividad actual para que el usuario no pueda volver al login presionando "atrás"
            } else {
                // Mostrar un mensaje de error
                Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}