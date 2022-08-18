package br.unigran.olamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nomeEntrada;
    TextView textoResposta;
    Button botaoOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomeEntrada=findViewById(R.id.nomeId);
        textoResposta=findViewById(R.id.respostaId);
        botaoOK=findViewById(R.id.btnOKId);

        textoResposta.setText("Aqui vai aparecer a resposta");


    }
}