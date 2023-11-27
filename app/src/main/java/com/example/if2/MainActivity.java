package com.example.if2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    Button c;
    private final String TAG="sumeyrah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.button);
        a=findViewById(R.id.editTextNumber);
        b=findViewById(R.id.editTextNumber2);
        Log.d(TAG,"DEBUG");
    }
    public void kontrol(View view){
        Integer sayi1=0,sayi2=0,Hatakontrol=0;
        try {
            sayi1=Integer.parseInt(a.getText().toString());
            Log.i(TAG,"sayı 1 yazıdan sayıya çevrildi");
            sayi2=Integer.parseInt(b.getText().toString());
            Log.i(TAG,"sayı 2 yazıdan sayıya çevrildi");
        } catch (Exception e) {
            Log.e(TAG,"çevirme hatası");
            Hatakontrol=1;

        }
        finally {

            if (sayi1>sayi2 && Hatakontrol!=1){
                Toast.makeText(this,"1.sayı daha büyük",Toast.LENGTH_LONG).show();

            }
            if (sayi2>sayi1 && Hatakontrol!=1){
                Toast.makeText(this,"2.sayı daha büyük",Toast.LENGTH_LONG).show();

            }
            if (sayi1==sayi2 && Hatakontrol!=1){
                Toast.makeText(this,"iki sayı eşit",Toast.LENGTH_LONG).show();

            }
            else  {
                Toast.makeText(this,"Hatalı giriş",Toast.LENGTH_LONG).show();
            }

        }

    }
}