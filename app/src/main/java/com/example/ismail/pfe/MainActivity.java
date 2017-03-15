package com.example.ismail.pfe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.ismail.pfe.Medecin.Specialite;
import com.example.ismail.pfe.Pharmacie.PharmaGarde;
import com.example.ismail.pfe.Pharmacie.Pharmacies;

import static com.example.ismail.pfe.R.*;

public class MainActivity extends Activity {

    public Button bt1;
    public Button bt2;
    public Button bt3;

    public void lancer(){
        bt1=(Button)findViewById(id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t1= new Intent(MainActivity.this, Pharmacies.class);
                startActivity(t1);
            }
        });


        bt2=(Button)findViewById(id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t1= new Intent(MainActivity.this, PharmaGarde.class);
                startActivity(t1);
            }
        });


        bt3=(Button)findViewById(id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t1= new Intent(MainActivity.this, Specialite.class);
                startActivity(t1);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(layout.activity_main);

        lancer();
    }
}
