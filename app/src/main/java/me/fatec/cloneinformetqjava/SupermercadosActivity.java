package me.fatec.cloneinformetqjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SupermercadosActivity extends AppCompatActivity {
    public void irParaCarvalho(View view){
        Intent intent_carvalho = new Intent(getApplicationContext(), CarvalhoTq.class);
        startActivity(intent_carvalho);
    }

    public void irParaIpiranga(View view){
        Intent intent_ipiranga = new Intent(getApplicationContext(), IpirangaActivity.class);
        startActivity(intent_ipiranga);
    }

    public void irParaCompreFacil(View view){
        Intent intent_facil = new Intent(getApplicationContext(), CompreFacilActivity.class);
        startActivity(intent_facil);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermercados);
    }
}