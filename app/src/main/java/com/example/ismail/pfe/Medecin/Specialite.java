package com.example.ismail.pfe.Medecin;

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

public class Specialite extends Activity {
    public final static String sendData= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_specialite);

        final Spinner spinner =(Spinner) findViewById(R.id.spinner2);
        final List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Taper ici");
        spinnerArray.add("Anatomo-pathologie");
        spinnerArray.add("Anesthésie-réanimation");
        spinnerArray.add("Biologie médicale");
        spinnerArray.add("Biologie vétérinaire");
        spinnerArray.add("Cardiologie");
        spinnerArray.add("Chirurgie cardio-vasculaire");
        spinnerArray.add("Chirurgie dentaire");
        spinnerArray.add("Chirurgie générale");
        spinnerArray.add("Chirurgie thoracique");
        spinnerArray.add("Dermatologie");
        spinnerArray.add("Diététique");
        spinnerArray.add("Endocrinologie et maladies métaboliques");
        spinnerArray.add("Gastro-entérologie");
        spinnerArray.add("Gynéco-obstétrique et sexologie");
        spinnerArray.add("Gynéco-obstétrique");
        spinnerArray.add("Infirmier");
        spinnerArray.add("Kinésithérapie");
        spinnerArray.add("Maladies infectieuses");
        spinnerArray.add("Médecine du sport");
        spinnerArray.add("Médecine générale");
        spinnerArray.add("Médecine interne");
        spinnerArray.add("Médecine légale et de travail");
        spinnerArray.add("Médecine nucléaire");
        spinnerArray.add("Médecine physique et réadaptation fonctionnelle");
        spinnerArray.add("Mésothérapie");
        spinnerArray.add("Néphrologie");
        spinnerArray.add("Neurochirurgie");
        spinnerArray.add("Neurologie");
        spinnerArray.add("Oncologie médicale");
        spinnerArray.add("Ophtalmologie");
        spinnerArray.add("Optique");
        spinnerArray.add("Orthodontie");
        spinnerArray.add("Orthophonie");
        spinnerArray.add("Oto-rhino-laryngologie");
        spinnerArray.add("Parodontologie");
        spinnerArray.add("Pédiatrie");
        spinnerArray.add("Pharmacologie");
        spinnerArray.add("Pneumo-phtisiologie");
        spinnerArray.add("Psychiatrie");
        spinnerArray.add("Radiologie");
        spinnerArray.add("Radiothérapie");
        spinnerArray.add("Rhumatologie");
        spinnerArray.add("Stomatologie et chirurgie maxillo-faciale");
        spinnerArray.add("Traumatologie orthopédie");
        spinnerArray.add("Urologie et chirurgie urologique");




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {

                    case 1:
                        Intent t2 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t2.putExtra(sendData, String.valueOf(position));
                        startActivity(t2);

                        break;

                    case 2:
                        Intent t3 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t3.putExtra(sendData, String.valueOf(position));
                        startActivity(t3);
                        break;
                    case 3:
                        Intent t4 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t4.putExtra(sendData, String.valueOf(position));
                        startActivity(t4);
                        break;
                    case 4:
                        Intent t5 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t5.putExtra(sendData, String.valueOf(position));
                        startActivity(t5);
                        break;
                    case 5:
                        Intent t6 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t6.putExtra(sendData, String.valueOf(position));
                        startActivity(t6);
                        break;
                    case 6:
                        Intent t7 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t7.putExtra(sendData, String.valueOf(position));
                        startActivity(t7);
                        break;
                    case 7:
                        Intent t8 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t8.putExtra(sendData, String.valueOf(position));
                        startActivity(t8);
                        break;
                    case 8:
                        Intent t9 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t9.putExtra(sendData, String.valueOf(position));
                        startActivity(t9);
                        break;
                    case 9:
                        Intent t10 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t10.putExtra(sendData, String.valueOf(position));
                        startActivity(t10);
                        break;
                    case 10:
                        Intent t11 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t11.putExtra(sendData, String.valueOf(position));
                        startActivity(t11);
                        break;

                    case 11:
                        Intent t12 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t12.putExtra(sendData, String.valueOf(position));
                        startActivity(t12);
                        break;


                    case 12:
                        Intent t13 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t13.putExtra(sendData, String.valueOf(position));
                        startActivity(t13);

                        break;

                    case 13:
                        Intent t14 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t14.putExtra(sendData, String.valueOf(position));
                        startActivity(t14);
                        break;
                    case 14:
                        Intent t15 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t15.putExtra(sendData, String.valueOf(position));
                        startActivity(t15);
                        break;
                    case 15:
                        Intent t16 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t16.putExtra(sendData, String.valueOf(position));
                        startActivity(t16);
                        break;
                    case 16:
                        Intent t17 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t17.putExtra(sendData, String.valueOf(position));
                        startActivity(t17);
                        break;
                    case 17:
                        Intent t18 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t18.putExtra(sendData, String.valueOf(position));
                        startActivity(t18);
                        break;
                    case 18:
                        Intent t19 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t19.putExtra(sendData, String.valueOf(position));
                        startActivity(t19);
                        break;
                    case 19:
                        Intent t20 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t20.putExtra(sendData, String.valueOf(position));
                        startActivity(t20);
                        break;
                    case 20:
                        Intent t21 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t21.putExtra(sendData, String.valueOf(position));
                        startActivity(t21);
                        break;
                    case 21:
                        Intent t22 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t22.putExtra(sendData, String.valueOf(position));
                        startActivity(t22);
                        break;

                    case 22:
                        Intent t23 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t23.putExtra(sendData, String.valueOf(position));
                        startActivity(t23);
                        break;

                    case 23:
                        Intent t24 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t24.putExtra(sendData, String.valueOf(position));
                        startActivity(t24);

                        break;

                    case 24:
                        Intent t25 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t25.putExtra(sendData, String.valueOf(position));
                        startActivity(t25);
                        break;
                    case 25:
                        Intent t26 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t26.putExtra(sendData, String.valueOf(position));
                        startActivity(t26);
                        break;
                    case 26:
                        Intent t27 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t27.putExtra(sendData, String.valueOf(position));
                        startActivity(t27);
                        break;
                    case 27:
                        Intent t28 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t28.putExtra(sendData, String.valueOf(position));
                        startActivity(t28);
                        break;
                    case 28:
                        Intent t29 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t29.putExtra(sendData, String.valueOf(position));
                        startActivity(t29);
                        break;
                    case 29:
                        Intent t30 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t30.putExtra(sendData, String.valueOf(position));
                        startActivity(t30);
                        break;
                    case 30:
                        Intent t31 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t31.putExtra(sendData, String.valueOf(position));
                        startActivity(t31);
                        break;
                    case 31:
                        Intent t32 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t32.putExtra(sendData, String.valueOf(position));
                        startActivity(t32);
                        break;
                    case 32:
                        Intent t33 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t33.putExtra(sendData, String.valueOf(position));
                        startActivity(t33);
                        break;

                    case 33:
                        Intent t34 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t34.putExtra(sendData, String.valueOf(position));
                        startActivity(t34);
                        break;


                    case 34:
                        Intent t35 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t35.putExtra(sendData, String.valueOf(position));
                        startActivity(t35);

                        break;

                    case 35:
                        Intent t36 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t36.putExtra(sendData, String.valueOf(position));
                        startActivity(t36);
                        break;
                    case 36:
                        Intent t37 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t37.putExtra(sendData, String.valueOf(position));
                        startActivity(t37);
                        break;
                    case 37:
                        Intent t38 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t38.putExtra(sendData, String.valueOf(position));
                        startActivity(t38);
                        break;
                    case 38:
                        Intent t39 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t39.putExtra(sendData, String.valueOf(position));
                        startActivity(t39);
                        break;
                    case 39:
                        Intent t40 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t40.putExtra(sendData, String.valueOf(position));
                        startActivity(t40);
                        break;
                    case 40:
                        Intent t41 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t41.putExtra(sendData, String.valueOf(position));
                        startActivity(t41);
                        break;
                    case 41:
                        Intent t42 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t42.putExtra(sendData, String.valueOf(position));
                        startActivity(t42);
                        break;
                    case 42:
                        Intent t43 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t43.putExtra(sendData, String.valueOf(position));
                        startActivity(t43);
                        break;
                    case 43:
                        Intent t44 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t44.putExtra(sendData, String.valueOf(position));
                        startActivity(t44);
                        break;

                    case 44:
                        Intent t45 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t45.putExtra(sendData, String.valueOf(position));
                        startActivity(t45);
                        break;

                    case 45:
                        Intent t46 = new Intent(com.example.ismail.pfe.Medecin.Specialite.this, DetailSpecialite.class);
                        t46.putExtra(sendData, String.valueOf(position));
                        startActivity(t46);
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
