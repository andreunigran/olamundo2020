package br.unigran.olamundo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        acao();
    }
    public void acao(){
        botaoOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast= new Toast(getApplicationContext());
                toast.setText("Ola");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();

                Toast.makeText(getApplicationContext(),"Teste",Toast.LENGTH_SHORT).show();
                textoResposta.setText("Ola como vai "+nomeEntrada.getText());

            }
        });
    }
    public void acaoBtOK2(View view){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Titulo");
        alertDialog.setMessage("Olá");
         alertDialog.setNeutralButton("ok",
                 new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 Toast.makeText(getApplicationContext(),"Teste",Toast.LENGTH_SHORT).show();
             }
         });
         alertDialog.setPositiveButton("positivo",null);
         alertDialog.setNegativeButton("negativo",null);
        alertDialog.create().show();

     //  alertDialog.setMessage("ola").setTitle("sdfg").show();




        textoResposta.setText("Ola como vai "+nomeEntrada.getText());
    }
}