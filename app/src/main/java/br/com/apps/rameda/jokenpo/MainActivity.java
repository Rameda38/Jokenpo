package br.com.apps.rameda.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String valo;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageView ivPedra = (ImageView)findViewById(R.id.iv_pedra);
         ImageView ivTesoura = (ImageView)findViewById(R.id.iv_tesoura);
         ImageView ivPapel = (ImageView)findViewById(R.id.iv_papel);
         final ImageView ivResultado = (ImageView)findViewById(R.id.iv_resultado);
         final TextView tvResultado = (TextView) findViewById(R.id.tv_Resultado);



         //metodos
         ivPedra.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     valo = "Pedra";
                     Jokenppo jokenppo = new Jokenppo(valo);
                     jokenppo.escolhaComputador(ivResultado);
                     tvResultado.setText( jokenppo.retornaResultado());


                 }
             });
         ivPapel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 valo = "Papel";
                 Jokenppo jokenppo = new Jokenppo(valo);
                 jokenppo.escolhaComputador(ivResultado);
                 tvResultado.setText( jokenppo.retornaResultado());


             }
         });
         ivTesoura.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 valo = "Tesoura";
                 Jokenppo jokenppo = new Jokenppo(valo);
                 jokenppo.escolhaComputador(ivResultado);
                 tvResultado.setText( jokenppo.retornaResultado());



             }
         });
    }



}
