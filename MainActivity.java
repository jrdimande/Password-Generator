package com.example.passwordgenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView campo;
    private Button gerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        campo = findViewById(R.id.campo);
        gerar = findViewById(R.id.gerar);

        gerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                String[] chars = {"a", "b", "c", "d", "f", "g", "h", "i",
                        "i", "j", "k", "l", "m", "n", "o", "p",
                        "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                        "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                        "!", "@", "#", "$", "%", "&", "*", "_"};


                ;

                String password = "";

                for (int i = 0; i < 12; i++){
                    password += chars[random.nextInt(chars.length)];
                }

                campo.setText(password);








            }
        });




    }
}