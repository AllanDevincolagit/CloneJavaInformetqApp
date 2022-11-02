package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubInicialActivity extends AppCompatActivity {

    public void irParaInicial(View view){
        Intent intent_inicial = new Intent(getApplicationContext(), InicialActivity2.class);
        startActivity(intent_inicial);
    }

    public void irParaCadastro(View view){
        Intent intent_cadastro = new Intent(getApplicationContext(), CadastroActivity.class);
        startActivity(intent_cadastro);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_inicial);

    }
}