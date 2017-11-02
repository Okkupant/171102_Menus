package com.example.jan.a171102_menus;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start1();
            }
        });
        ((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start2();
            }
        });
    }
    public void start1(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void start2(){
        Intent intent = new Intent(this, Main2Activity.class); // hier daten senden
        intent.putExtra("WHICH_BUTTON","Button 2");
        startActivity(intent);

    }
}
