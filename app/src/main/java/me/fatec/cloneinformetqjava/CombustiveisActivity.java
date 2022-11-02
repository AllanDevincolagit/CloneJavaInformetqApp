package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CombustiveisActivity extends AppCompatActivity {
    public void irParaRally(View view){
        Intent intent_rally = new Intent(getApplicationContext(), RallyActivity.class);
        startActivity(intent_rally);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustiveis);
    }
}