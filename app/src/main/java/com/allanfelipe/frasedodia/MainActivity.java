package com.allanfelipe.frasedodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
            "Acredite que você pode, assim você já está no meio do caminho.",
            "A única maneira de fazer um ótimo trabalho é amar o que você faz.",
            "Não conte os dias, faça os dias contarem.",
            "A vida é 10% o que acontece com você e 90% como você reage a isso.",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(10);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);
    }

    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";

        for (String frase : frases) {
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }

}