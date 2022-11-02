package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TopicosActivity extends AppCompatActivity {
    public void irParaSupermercados(View view){
        Intent intent_supermercados = new Intent(getApplicationContext(), SupermercadosActivity.class);
        startActivity(intent_supermercados);
    }

    public void irParaRestaurantes(View view){
        Intent intent_restaurantes = new Intent(getApplicationContext(), RestaurantesActivity.class);
        startActivity(intent_restaurantes);
    }

    public void irParaSaude(View view){
        Intent intent_saude = new Intent(getApplicationContext(), SaudeActivity.class);
        startActivity(intent_saude);
    }

    public void irParaCombustiveis(View view){
        Intent intent_combustiveis = new Intent(getApplicationContext(), CombustiveisActivity.class);
        startActivity(intent_combustiveis);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicos);
    }
}