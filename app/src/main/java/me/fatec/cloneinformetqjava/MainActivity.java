package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {

    public void irParaSubInicial(View view){
        Intent intent_subinicial = new Intent(getApplicationContext(), SubInicialActivity.class);
        startActivity(intent_subinicial);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}