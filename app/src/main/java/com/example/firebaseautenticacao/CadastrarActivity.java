package com.example.firebaseautenticacao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CadastrarActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText_EmailCadastro, editText_SenhaCadastro, editText_SenhaRepetirCadastro;
    private Button button_CadastroUsuario, button_Cancelar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        editText_EmailCadastro = (EditText) findViewById(R.id.editText_EmailCadastro);
        editText_SenhaCadastro = (EditText) findViewById(R.id.editText_SenhaCadastro);
        editText_SenhaRepetirCadastro = (EditText) findViewById(R.id.editText_SenhaRepetirCadastro);

        button_CadastroUsuario = (Button) findViewById(R.id.button_CadastroUsuario);
        button_Cancelar = (Button) findViewById(R.id.button_Cancelar);

        button_CadastroUsuario.setOnClickListener(this);
        button_Cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button_CadastroUsuario:
                cadastrar();
                break;
        }
    }

    private void cadastrar() {
        Toast.makeText(this, "Cadastrar clicado", Toast.LENGTH_LONG).show();
    }
}
