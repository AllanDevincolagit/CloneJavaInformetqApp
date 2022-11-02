package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RestaurantesActivity extends AppCompatActivity {
    public void irParaKimura(View view){
        Intent intent_kimura = new Intent(getApplicationContext(), KimuraActivity.class);
        startActivity(intent_kimura);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
    }
}