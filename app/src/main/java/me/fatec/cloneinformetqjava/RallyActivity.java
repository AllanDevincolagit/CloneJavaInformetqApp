package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RallyActivity extends AppCompatActivity {
    public void irParaMapaRally(View view){
        Intent intent_mapar = new Intent(getApplicationContext(), RallyMapsActivity.class);
        startActivity(intent_mapar);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rally);
    }
}