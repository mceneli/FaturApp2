package com.example.faturapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String name = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button daire1b = (Button)findViewById(R.id.daire1);
        Button daire2b = (Button)findViewById(R.id.daire2);
        Button graphb = (Button)findViewById(R.id.grafik);

        daire1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name="Daire 1";
                gotoDaire(name);
            }
        });

        daire2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name="Daire 2";
                gotoDaire(name);
            }
        });

        graphb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoGraph();
            }
        });


    }

    private void gotoDaire(String dname){
        Intent intent =new Intent(this,DaireActivity.class);
        intent.putExtra(name,dname);
        startActivity(intent);
    }

    private void gotoGraph(){
        Intent intent =new Intent(this,GraphActivity.class);

        int[] arr = new int[4];
        int i;

        for(i=0;i<4;i++){
            arr[i]=4-i;
        }
        intent.putExtra("array", arr);
        startActivity(intent);

    }






    /*public void startActivity(View view) {
        Button daire1 = (Button) findViewById(R.id.daire1);
        Intent intent = new Intent(this, DaireActivity.class);
        String str = daire1.getText().toString();
        System.out.println(str);
        intent.putExtra(name, str);
        startActivity(intent);
    }
*/

}
