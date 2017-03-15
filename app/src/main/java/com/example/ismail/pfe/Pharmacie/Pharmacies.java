package com.example.ismail.pfe.Pharmacie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.example.ismail.pfe.Pharmacie.AlMassira;
import com.example.ismail.pfe.R;

import java.util.ArrayList;
import java.util.List;

public class Pharmacies extends Activity {
      public final static String sendData= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pharmacies);

        final Spinner spinner =(Spinner) findViewById(R.id.spinner);
        final List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Taper ici");
        spinnerArray.add("Al Massira");
        spinnerArray.add("Ben Debbab");
        spinnerArray.add("Bensouda");
        spinnerArray.add("Centre");
        spinnerArray.add("Jnanate");
        spinnerArray.add("Medina-Mellah");
        spinnerArray.add("Mont Fleuri");
        spinnerArray.add("Narjis-Sidi Brahim");
        spinnerArray.add("Saada-Adarissa");
        spinnerArray.add("Hay Tarek-Dokkarat");
        spinnerArray.add("Zouagha");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {

                    case 1:
                        Intent t2 = new Intent(Pharmacies.this, AlMassira.class);
                         t2.putExtra(sendData, String.valueOf(position));
                        startActivity(t2);

                        break;

                    case 2:
                        Intent t3 = new Intent(Pharmacies.this,  AlMassira.class);
                        t3.putExtra(sendData, String.valueOf(position));
                        startActivity(t3);
                        break;
                    case 3:
                        Intent t4 = new Intent(Pharmacies.this,  AlMassira.class);
                        t4.putExtra(sendData, String.valueOf(position));
                        startActivity(t4);
                        break;
                    case 4:
                        Intent t5 = new Intent(Pharmacies.this,  AlMassira.class);
                        t5.putExtra(sendData, String.valueOf(position));
                        startActivity(t5);
                        break;
                    case 5:
                        Intent t6 = new Intent(Pharmacies.this,  AlMassira.class);
                        t6.putExtra(sendData, String.valueOf(position));
                        startActivity(t6);
                        break;
                    case 6:
                        Intent t7 = new Intent(Pharmacies.this,  AlMassira.class);
                        t7.putExtra(sendData, String.valueOf(position));
                        startActivity(t7);
                        break;
                    case 7:
                        Intent t8 = new Intent(Pharmacies.this,  AlMassira.class);
                        t8.putExtra(sendData, String.valueOf(position));
                        startActivity(t8);
                        break;
                    case 8:
                        Intent t9 = new Intent(Pharmacies.this,  AlMassira.class);
                        t9.putExtra(sendData, String.valueOf(position));
                        startActivity(t9);
                        break;
                    case 9:
                        Intent t10 = new Intent(Pharmacies.this,  AlMassira.class);
                        t10.putExtra(sendData, String.valueOf(position));
                        startActivity(t10);
                        break;
                    case 10:
                        Intent t11 = new Intent(Pharmacies.this,  AlMassira.class);
                        t11.putExtra(sendData, String.valueOf(position));
                        startActivity(t11);
                        break;

                   case 11:
                        Intent t12 = new Intent(Pharmacies.this,  AlMassira.class);
                        t12.putExtra(sendData, String.valueOf(position));
                        startActivity(t12);
                        break;


                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spinner.setSelection(11);

            }
        });
    }
}
