package helloandroid.br.com.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //View
        setContentView(R.layout.activity_main)
        val btLogin = findViewById<Button>(R.id.btLogin)
        //Eventos
            btLogin.setOnClickListener{
                val tLogin = findViewById<TextView>(R.id.tLogin)
                val tSenha = findViewById<TextView>(R.id.tSenha)
                val login = tLogin.text.toString()
                val senha = tSenha.text.toString()
                if ("Viktor" == login && "123456" == senha ) {
                    toast("Bem-vindo, login realizado com sucesso.")
                } else {
                    toast("Login e senha incorretos")
                }
            }
    }
    fun toast(message: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, message, length).show()
    }
}
