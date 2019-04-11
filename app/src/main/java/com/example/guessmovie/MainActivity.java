package com.example.guessmovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import java.lang.Thread;
import java.util.NoSuchElementException;

public class MainActivity extends AppCompatActivity {
    private String[] s={"k h i l a d i","n a y a k","d h a r a m  v e e r","g o l m a a l","g a n g a j a l","b o r d e r","g a d a r","q u e e n","s a n j u","d h a d k a n","w a n t e d","h e l l o  b r o t h e r","h o l i d a y","l a k s h y a","j e w e l   t h i e f","y a a r a n a","a a s h i q u i","b l a c k","d a n g a l","k a a b i l","v e e r","b a a z i g a r","p i n k","d h a m a a l","d h o o m","g u i d e"};
    private String[] h={"Akshay Kumar","Anil Kapoor","Dharmendra","Ajay Devgan","Ajay Devgan","Sunny Deol","Sunny Deol","Kangana Ranaut","Ranbir Kapoor","Sunil Shetty","Salman Khan","Salman Khan","Akshay kumar","Hritik Roshan","Dev Anand","Amitabh Bachchan","Rahul Roy","Rani Mukherjee","Aamir Khan","Hritik Roshan","Salman Khan","Shahrukh Khan","Tapsee Pannu","Sanjay Dutt","John Abraham","Dev Anand"};
    private int rand=((int)(Math.random()*(s.length)));
    private String s0=s[rand],s1;
    private TextView t2,t4,t6;
    private int k=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t6=findViewById(R.id.t6);
        s1=s[rand].replaceAll("[a-zA-Z]", "_");
        printmov(s1);
        t4.setText("No.of attempts remaining: "+k);
        final Button b1=findViewById(R.id.b1);
        final Button b2=findViewById(R.id.b2);
        final Button b3=findViewById(R.id.b3);
        final Button b4=findViewById(R.id.b4);
        final Button b5=findViewById(R.id.b5);
        final Button b6=findViewById(R.id.b6);
        final Button b7=findViewById(R.id.b7);
        final Button b8=findViewById(R.id.b8);
        final Button b9=findViewById(R.id.b9);
        final Button b10=findViewById(R.id.b10);
        final Button b11=findViewById(R.id.b11);
        final Button b12=findViewById(R.id.b12);
        final Button b13=findViewById(R.id.b13);
        final Button b14=findViewById(R.id.b14);
        final Button b15=findViewById(R.id.b15);
        final Button b16=findViewById(R.id.b16);
        final Button b17=findViewById(R.id.b17);
        final Button b18=findViewById(R.id.b18);
        final Button b19=findViewById(R.id.b19);
        final Button b20=findViewById(R.id.b20);
        final Button b21=findViewById(R.id.b21);
        final Button b22=findViewById(R.id.b22);
        final Button b23=findViewById(R.id.b23);
        final Button b24=findViewById(R.id.b24);
        final Button b25=findViewById(R.id.b25);
        final Button b26=findViewById(R.id.b26);
        final Button hint=findViewById(R.id.hint);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('a',s0,s1);
                printmov(s1);
                b1.setEnabled(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('b',s0,s1);
                printmov(s1);
                b2.setEnabled(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('c',s0,s1);
                printmov(s1);
                b3.setEnabled(false);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('d',s0,s1);
                printmov(s1);
                b4.setEnabled(false);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('e',s0,s1);
                printmov(s1);
                b5.setEnabled(false);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('f',s0,s1);
                printmov(s1);
                b6.setEnabled(false);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('g',s0,s1);
                printmov(s1);
                b7.setEnabled(false);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('h',s0,s1);
                printmov(s1);
                b8.setEnabled(false);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('i',s0,s1);
                printmov(s1);
                b9.setEnabled(false);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('j',s0,s1);
                printmov(s1);
                b10.setEnabled(false);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('k',s0,s1);
                printmov(s1);
                b11.setEnabled(false);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('l',s0,s1);
                printmov(s1);
                b12.setEnabled(false);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('m',s0,s1);
                printmov(s1);
                b13.setEnabled(false);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('n',s0,s1);
                printmov(s1);
                b14.setEnabled(false);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('o',s0,s1);
                printmov(s1);
                b15.setEnabled(false);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('p',s0,s1);
                printmov(s1);
                b16.setEnabled(false);
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('q',s0,s1);
                printmov(s1);
                b17.setEnabled(false);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('r',s0,s1);
                printmov(s1);
                b18.setEnabled(false);
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('s',s0,s1);
                printmov(s1);
                b19.setEnabled(false);
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('t',s0,s1);
                printmov(s1);
                b20.setEnabled(false);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('u',s0,s1);
                printmov(s1);
                b21.setEnabled(false);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('v',s0,s1);
                printmov(s1);
                b22.setEnabled(false);
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('w',s0,s1);
                printmov(s1);
                b23.setEnabled(false);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('x',s0,s1);
                printmov(s1);
                b24.setEnabled(false);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('y',s0,s1);
                printmov(s1);
                b25.setEnabled(false);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=input('z',s0,s1);
                printmov(s1);
                b26.setEnabled(false);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(k<=2 && t6.getText().toString().equals("")) {
                    t6.setText("Actor: " + h[rand]);
                    hint.setEnabled(false);
                }
                else{
                    Toast.makeText(MainActivity.this,"Try at least "+(k-2)+" more times",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public String input(char c,String d,String e) throws NoSuchElementException{
        int l=0;
        boolean tf=true;
        /*Checking code*/
        while(l<d.length()){
            if(d.charAt(l)==c && e.charAt(l)=='_'){
                if(l!=0){
                    e=e.substring(0,l)+c+e.substring(l+1);
                }
                else {
                    e = c + e.substring(l + 1);
                }
                tf=false;
            }
            l=l+1;
        }
        if(e.indexOf('_')==-1)
        {
            Toast.makeText(MainActivity.this,"You Win!",Toast.LENGTH_SHORT).show();
        }
        if(tf && k>0 && e.indexOf('_')!=-1){
            k=k-1;
            if(k==0){
                //printmov(s0);
                t4.setText("");
                Toast.makeText(MainActivity.this, "You Lost!", Toast.LENGTH_SHORT).show();
                t6.setText("Right Answer:  "+s[rand]);
            }
            else{
                t4.setText("Wrong guesses remaining: "+k);
            }
        }
        return e;
    }
    public void printmov(String e){
        t2.setText(e);
    }

}
