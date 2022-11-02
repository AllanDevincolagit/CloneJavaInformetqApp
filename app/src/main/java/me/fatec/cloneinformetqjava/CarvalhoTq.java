package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarvalhoTq extends AppCompatActivity {
    public void irParaMapaCarvalho(View view){
        Intent intent_carvalhotq = new Intent(getApplicationContext(), MapaCarvalhoaTqactivity.class);
        startActivity(intent_carvalhotq);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carvalho_tq);
    }
}