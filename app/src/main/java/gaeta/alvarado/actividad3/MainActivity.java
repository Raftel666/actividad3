package gaeta.alvarado.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextPass;
    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Match con la vista
        setContentView(R.layout.activity_main);
        //Match con los widgets
        editTextNombre = findViewById(R.id.etNombre);
        editTextPass = findViewById(R.id.etPass);
        botonIngreso = findViewById(R.id.buttonAccept);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String password = editTextPass.getText().toString();

                if (nombreUsuario.isEmpty() || password.isEmpty()){
                    //Nombre de usuario vacio
                } else {
                    if (nombreUsuario.equals("") && password.equals("1234")){
                        //Imprimir Bienvenido
                        mensaje("Bienvenido");
                    } else {
                        //Imprimir datos errones
                        mensaje("Datos erroneos");
                    }
                }
            }
        });
    }
    public void mensaje(String mensajeh){
        Toast.makeText(this,mensajeh,Toast.LENGTH_LONG).show();
    }
}
