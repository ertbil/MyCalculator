package com.examples.mycaculator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    double firstNumber;
    double numberDeleter;
    char operation;
    char deleter;


    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
    public static String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }
    public static double addition(double firstValue, double secondValue){
        return firstValue+secondValue;

    }
    public static double extraction(double firstValue, double secondValue){
        return firstValue-secondValue;
    }
    public static double division(double firstValue, double secondValue){
        return firstValue/secondValue;
    }
    public static double multiplication(double firstValue, double secondValue){
        return firstValue*secondValue;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt0 = findViewById(R.id.button0);
        Button bt1 = findViewById(R.id.button1);
        Button bt2 = findViewById(R.id.button2);
        Button bt3 = findViewById(R.id.button3);
        Button bt4 = findViewById(R.id.button4);
        Button bt5 = findViewById(R.id.button5);
        Button bt6 = findViewById(R.id.button6);
        Button bt7 = findViewById(R.id.button7);
        Button bt8 = findViewById(R.id.button8);
        Button bt9 = findViewById(R.id.button9);
        Button btClr = findViewById(R.id.buttonClr);
        Button btPls = findViewById(R.id.buttonPls);
        Button btPt = findViewById(R.id.buttonPoint);
        Button btPerc = findViewById(R.id.buttonPerc);
        Button btMns = findViewById(R.id.buttonMns);
        Button btMlt = findViewById(R.id.buttonMLt);
        Button btDvd = findViewById(R.id.buttonDvd);
        Button btBckspc = findViewById(R.id.buttonBspc);
        Button btEqpl = findViewById(R.id.buttonEql);

        TextView txt = findViewById(R.id.txt);
        TextView res = findViewById(R.id.result);



        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("0");

                }
                else {
                    txt.setText(txt.getText()+"0");

                }
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("1");

                }
                else {
                    txt.setText(txt.getText() + "1");
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("2");

                }
                else {
                    txt.setText(txt.getText() + "2");
                }

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("3");

                }
                else {
                    txt.setText(txt.getText() + "3");
                }

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("4");

                }
                else {
                    txt.setText(txt.getText() + "4");
                }

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("5");

                }
                else {
                    txt.setText(txt.getText() + "5");
                }

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("6");

                }
                else {
                    txt.setText(txt.getText() + "6");
                }

            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("7");

                }
                else {
                    txt.setText(txt.getText() + "7");
                }

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("8");

                }
                else {
                    txt.setText(txt.getText() + "8");
                }

            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals("0")) {
                    txt.setText("9");

                }
                else {
                    txt.setText(txt.getText() + "9");
                }

            }
        });
        btClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNumber= numberDeleter;
                operation = deleter;
                res.setText("");
                txt.setText("");

            }
        });
        btBckspc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(removeLastChar(txt.getText().toString()));
            }
        });
        btPls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().equals("")){
                    operation ='+';
                    firstNumber =Double.valueOf(txt.getText().toString());;
                    txt.setText("");}
                else{
                    operation ='+';
                    firstNumber =Double.valueOf(res.getText().toString());;
                    txt.setText("");

                }

            }
        });
        btMlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().equals("")){
                    operation ='x';
                    firstNumber =Double.valueOf(txt.getText().toString());;
                    txt.setText("");}
                else{
                    operation ='x';
                    firstNumber =Double.valueOf(res.getText().toString());;
                    txt.setText("");

                }



            }
        });
        btMns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().equals("")){
                operation ='-';
                firstNumber =Double.valueOf(txt.getText().toString());;
                txt.setText("");}
                else{
                    operation ='-';
                    firstNumber =Double.valueOf(res.getText().toString());;
                    txt.setText("");

                }

            }
        });
        btDvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().equals("")){
                    operation ='/';
                    firstNumber =Double.valueOf(txt.getText().toString());;
                    txt.setText("");}
                else{
                    operation ='/';
                    firstNumber =Double.valueOf(res.getText().toString());;
                    txt.setText("");

                }

            }
        });
        btPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText().toString().equals("")){
                    operation ='%';
                    firstNumber =Double.valueOf(txt.getText().toString());;
                    txt.setText("");}
                else{
                    operation ='%';
                    firstNumber =Double.valueOf(res.getText().toString());;
                    txt.setText("");

                }

            }

            });
        btPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + ".");

            }
        });
        btEqpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char op = operation;

                if (operation != '='){

                switch (op){
                    case '+':
                        res.setText(String.valueOf(addition(firstNumber,Double.valueOf(txt.getText().toString()))));
                        operation='=';
                        break;
                    case 'x':
                        res.setText(String.valueOf(multiplication(firstNumber,Double.valueOf(txt.getText().toString()))));
                        operation='=';
                        break;
                    case '-':
                        res.setText(String.valueOf(extraction(firstNumber,Double.valueOf(txt.getText().toString()))));
                        operation='=';
                        break;
                    case '/':
                        res.setText(String.valueOf(division(firstNumber,Double.valueOf(txt.getText().toString()))));
                        operation='=';
                        break;
                    case '%':
                        res.setText(String.valueOf(division(firstNumber,100)));
                        operation='=';
                        break;

                }
                }
                else {
                    txt.setText(res.getText());
                    res.setText("");
                }
            }
        });




    }
}