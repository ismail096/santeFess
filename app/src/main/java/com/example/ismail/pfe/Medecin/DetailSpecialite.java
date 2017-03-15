package com.example.ismail.pfe.Medecin;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.ismail.pfe.Json.PharmacieInfo;
import com.example.ismail.pfe.Json.ChargeJson;
import com.example.ismail.pfe.R;
import com.example.ismail.pfe.Pharmacie.Pharmacies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailSpecialite extends AppCompatActivity implements ChargeJson.Listener, AdapterView.OnItemClickListener {
    String e1;


    private ListView mListView;


    SimpleAdapter adapter;


    private List<HashMap<String, String>> mAndroidMapList = new ArrayList<>();

    private static final String KEY_TITLE = "title";
    private static final String KEY_ADRESS = "adress";
    private static final String KEY_TEL = "tel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detail_specialite);
        Intent intent = getIntent();
        e1=intent.getStringExtra(Pharmacies.sendData);
        String URL = "http://www.pfefes.tk/Medecin/"+ e1+".php";
        mListView = (ListView) findViewById(R.id.list_view2);

        mListView.setOnItemClickListener(this);
        new ChargeJson(this).execute(URL);
    }

    @Override
    public void onLoaded(List<PharmacieInfo> androidList) {

        for (PharmacieInfo android : androidList) {

            HashMap<String, String> map = new HashMap<>();

            map.put(KEY_TITLE, android.getTitle());
            map.put(KEY_ADRESS, android.getAdress());
            map.put(KEY_TEL, android.getTel());

            mAndroidMapList.add(map);
        }

        loadListView();
    }

    @Override
    public void onError() {

        Toast.makeText(this, "Error !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(this, mAndroidMapList.get(i).get(KEY_TITLE),Toast.LENGTH_LONG).show();
    }

    private void loadListView() {

        adapter = new SimpleAdapter(com.example.ismail.pfe.Medecin.DetailSpecialite.this, mAndroidMapList, R.layout.list_item,
                new String[] { KEY_TITLE, KEY_ADRESS, KEY_TEL },
                new int[] { R.id.title,R.id.adress, R.id.tel });

        mListView.setAdapter(adapter);


    }

}