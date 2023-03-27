package com.example.calculadoragustavoluizfernando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     String numero_um ="";
     String numero_dois = "";
     String operacao = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();



        Button button= (Button)findViewById(R.id.numero_um);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (operacao!=""){
                    numero_dois+=1;


                }else{
                    numero_um+=1;


                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button2= (Button)findViewById(R.id.numero_dois);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=2;
                }else{
                    numero_um+=2;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button3= (Button)findViewById(R.id.numero_tres);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=3;
                }else{
                    numero_um+=3;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button4= (Button)findViewById(R.id.numero_quatro);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=4;
                }else{
                    numero_um+=4;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button5= (Button)findViewById(R.id.numero_cinco);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=5;
                }else{
                    numero_um+=5;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button6= (Button)findViewById(R.id.numero_seis);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=6;
                }else{
                    numero_um+=6;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button7= (Button)findViewById(R.id.numero_sete);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=7;
                }else{
                    numero_um+=7;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button8= (Button)findViewById(R.id.numero_oito);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=8;
                }else{
                    numero_um+=8;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button9= (Button)findViewById(R.id.numero_nove);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=9;
                }else{
                    numero_um+=9;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button button0= (Button)findViewById(R.id.numero_zero);
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (operacao!=""){
                    numero_dois+=0;
                }else{
                    numero_um+=0;

                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonSoma= (Button)findViewById(R.id.soma);
        buttonSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operacao="+";
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }

        });
        Button buttonSub= (Button)findViewById(R.id.subtracao);
        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operacao="-";
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonDiv= (Button)findViewById(R.id.divisao);
        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operacao="/";
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonMult= (Button)findViewById(R.id.multiplicacao);
        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operacao="*";
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonBack= (Button)findViewById(R.id.backspace);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (operacao==""){
                   numero_um =( numero_um == null || numero_um.length() == 0)? null: (numero_um.substring(0, numero_um.length() - 1));

                }else{
                    numero_dois =( numero_dois == null || numero_dois.length() == 0)? null: (numero_dois.substring(0, numero_dois.length() - 1));
                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_expressao);
                helloTextView.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonLimpar= (Button)findViewById(R.id.bt_limpar);
        buttonLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operacao="";
                numero_um="";
                numero_dois="";
                final TextView helloTextView = (TextView) findViewById(R.id.txt_resultado);
                helloTextView.setText("");
                final TextView helloTextView2 = (TextView) findViewById(R.id.txt_expressao);
                helloTextView2.setText(numero_um+" "+ operacao + "" + numero_dois);
            }
        });
        Button buttonIgual= (Button)findViewById(R.id.igual);
        buttonIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switch (operacao){
                    case "+":
                        numero_um = String.valueOf(Integer.parseInt(numero_um) + Integer.parseInt(numero_dois));
                        operacao="";
                        numero_dois="";
                    break;
                    case "-":
                        numero_um = String.valueOf(Integer.parseInt(numero_um) - Integer.parseInt(numero_dois));
                        operacao="";
                        numero_dois="";
                        break;
                    case "*":
                        numero_um = String.valueOf(Integer.parseInt(numero_um) * Integer.parseInt(numero_dois));
                        operacao="";
                        numero_dois="";
                        break;
                    case "/":
                        numero_um = String.valueOf(Integer.parseInt(numero_um) / Integer.parseInt(numero_dois));
                        operacao="";
                        numero_dois="";
                        break;
                }
                final TextView helloTextView = (TextView) findViewById(R.id.txt_resultado);
                helloTextView.setText(numero_um);
            }
        });





    }




}