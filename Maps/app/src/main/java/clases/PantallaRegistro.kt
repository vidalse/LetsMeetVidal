package clases

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.maps.R

class PantallaRegistro:AppCompatActivity() {

    lateinit var botonRegistrar: Button
    lateinit var siDeseaSubsInf:RadioButton
    lateinit var noDeseaSubsInf:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        siDeseaSubsInf=findViewById(R.id.radioSi)
        noDeseaSubsInf=findViewById(R.id.radioNo)
        botonRegistrar=findViewById(R.id.botonRegistro)
        botonRegistrar.setOnClickListener(View.OnClickListener { view -> irAPantalla2(view) })


    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, R.string.onRestart, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, R.string.onDestroy, Toast.LENGTH_SHORT).show()
    }

    fun irAPantalla2(view: View?) {
        var nombreReal:EditText=findViewById(R.id.nombreinput)
        var apellido:EditText=findViewById(R.id.apellidoInput)
        var dni:EditText=findViewById(R.id.inputDni)
        var mail:EditText=findViewById(R.id.inputMail)
        var nombreUsuario:EditText=findViewById(R.id.inputNomrbeUsuario)
        var contraseña:EditText=findViewById(R.id.inputContraseña)
        var valorSiSub: RadioButton =findViewById(R.id.radioSi)

        var pasarActividad: Intent = Intent(this,Pantalla::class.java)
        var bundle: Bundle = Bundle()
        bundle.putBoolean("valorSiSubs", valorSiSub.isChecked)//true=si false=no
        bundle.putString("nombre",nombreReal.text.toString())
        bundle.putString("appelido",apellido.text.toString())
        bundle.putString("dni",dni.text.toString())
        bundle.putString("mail",mail.text.toString())
        bundle.putString("nombreUs",nombreUsuario.text.toString())
        bundle.putString("contraseña",contraseña.text.toString())
        pasarActividad.putExtras(bundle)
        this.startActivity(pasarActividad)


    }
}