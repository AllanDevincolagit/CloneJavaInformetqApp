package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SantaCasaActivity extends AppCompatActivity {
    public void irParaMapaSantaCasa(View view){
        Intent intent_santacasa = new Intent(getApplicationContext(), MapsSantaCasaActivity.class);
        startActivity(intent_santacasa);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa_casa);
    }
}