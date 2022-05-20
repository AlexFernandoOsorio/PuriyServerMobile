package com.example.puriymovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    //Inicializacion
    private var edtxEmail: EditText? =null
    private var edtxPasswrd: EditText? =null
    private var btnLogin: Button? = null
    private var txtrecoverPass: TextView? = null
    private var txtSingUp: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Casteo
        edtxEmail = findViewById(R.id.etextInputL_log_email)
        edtxPasswrd = findViewById(R.id.etextInputL_log_password)
        btnLogin = findViewById(R.id.btn_log_singIn)
        txtSingUp = findViewById(R.id.text_log_singUp)
        txtrecoverPass = findViewById(R.id.text_log_recoverPass)

        //Acciones

        btnLogin?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })







    }

}