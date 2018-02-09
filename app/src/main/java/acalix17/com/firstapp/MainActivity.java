package acalix17.com.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText activity_main_ed_nombre;
    private TextView activity_main_tv_texto;
    private Button btn;
    private ImageButton imageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btn = findViewById(R.id.activity_main_btn_enviar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_main_ed_nombre = findViewById(R.id.activity_main_ed_nombre);
                activity_main_tv_texto = findViewById(R.id.activity_main_tv_texto);
                String texto = activity_main_ed_nombre.getText().toString().trim();

                if (texto.isEmpty()) {
                    while (true) {
                        Toast toast = Toast.makeText(getApplicationContext(), "NO PUEDE ESTAR VACIO EL TEXTO!!!!", Toast.LENGTH_LONG);
                        toast.show();
                    }

                } else {
                    activity_main_tv_texto.setText("Ud acaba de ingresar: " + " " + texto);
                }

            }
        });*/

       /* <!-- <EditText
        android:id="@+id/activity_main_ed_nombre"
        android:layout_width="314dp"
        android:layout_height="53dp"
        android:layout_marginEnd="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:ems="10"
        android:hint="Ingrese cualquier cosa"
        android:inputType="textPersonName"
        android:textAlignment="center"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/activity_main_btn_enviar"
        android:layout_width="104dp"
        android:layout_height="60dp"
        android:layout_marginEnd="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:onClick="copiar"
        android:text="Enviar"
        android:textSize="18sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/activity_main_ed_nombre" />

    <TextView
        android:id="@+id/activity_main_tv_texto"
        android:layout_width="310dp"
        android:layout_height="55dp"
        android:layout_marginEnd="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="24dp"
        android:textAlignment="center"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/activity_main_btn_enviar" />-->
*/
    }
}