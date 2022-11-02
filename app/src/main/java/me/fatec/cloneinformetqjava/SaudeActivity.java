package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaudeActivity extends AppCompatActivity {
    public void irParaSantaCasa(View view){
        Intent intent_santacasa = new Intent(getApplicationContext(), SantaCasaActivity.class);
        startActivity(intent_santacasa);
    }

    public void irParaBioFarma(View view){
        Intent intent_biofarma = new Intent(getApplicationContext(), BioFarmaActivity.class);
        startActivity(intent_biofarma);
    }

    public void irParaInterClinicas(View view){
        Intent intent_interclinicas = new Intent(getApplicationContext(), InterClinicasActivity.class);
        startActivity(intent_interclinicas);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saude);
    }
}