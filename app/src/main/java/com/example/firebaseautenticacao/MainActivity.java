package com.example.firebaseautenticacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_Login, button_Cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Login = (Button) findViewById(R.id.button_login);
        button_Cadastrar = (Button) findViewById(R.id.button_Cadastrar);

        button_Login.setOnClickListener(this);
        button_Cadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_login:

                //executar um comanddo
                break;
            case R.id.button_Cadastrar:
                startActivity(new Intent(this, CadastrarActivity.class));
                //outro comando
                break;
        }
    }
}