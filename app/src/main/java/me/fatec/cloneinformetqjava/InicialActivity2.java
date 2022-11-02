package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicialActivity2 extends AppCompatActivity {
    public void irParaTopicos(View view){
        Intent intent_topicos = new Intent(getApplicationContext(), TopicosActivity.class);
        startActivity(intent_topicos);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
    }
}