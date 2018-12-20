package br.com.apps.rameda.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Random;

public class Jokenppo extends AppCompatActivity {
    //atribuos
    private String escolhaUser;
    private  int valor=0;
    String escolhaPc="aaaaaaa";
    int vitoria=0;
    int derrotas=0;
    int impates=0;

    //construtor
    public Jokenppo(String escolhaUsuario ){
        escolhaUser = escolhaUsuario;

    }

    //metodos
    public ImageView escolhaComputador(ImageView ivResult){
        valor = new Random().nextInt(3);
        String opcao[] = {"Tesoura","Pedra","Papel"};
        escolhaPc = opcao[valor];
        ImageView ivResulta=null;
        if (valor==0) {
            ivResult.setImageResource(R.drawable.tesoura);
            return ivResult;
        }
        else{
            if (valor==1) {
                ivResult.setImageResource(R.drawable.pedra);
                return ivResult;
            }else {
                if (valor==2) {
                    ivResult.setImageResource(R.drawable.papel);
                    return ivResult;
                }
            }
        }
        return ivResult;

    }

    public String retornaResultado(){
        if (
                (escolhaPc=="Tesoura"&& escolhaUser=="Pedra")||
                (escolhaPc=="Pedra"&&escolhaUser=="Papel")||
                (escolhaPc=="Papel"&&escolhaUser=="Tesoura")

                ){
            vitoria = vitoria+1;
            return "VOCE GANHOU !";
        }else{
            if(
                    (escolhaUser=="Tesoura"&& escolhaPc=="Pedra")||
                    (escolhaUser=="Pedra"&&escolhaPc=="Papel")||
                    (escolhaUser=="Papel"&&escolhaPc=="Tesoura")
                    ){
                derrotas = derrotas+1;
                return "VOCE PERDEU !";
            }
            else {
                impates = impates+1;
                return "EMPATE";
            }
        }


    }

}
