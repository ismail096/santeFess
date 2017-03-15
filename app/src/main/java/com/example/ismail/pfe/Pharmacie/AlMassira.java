package com.example.ismail.pfe.Pharmacie;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.ismail.pfe.Json.PharmacieInfo;
import com.example.ismail.pfe.MapsAct;
import com.example.ismail.pfe.Json.ChargeJson;
import com.example.ismail.pfe.Maps.HttpDataHandler;
import com.example.ismail.pfe.R;
import com.example.ismail.pfe.Pharmacie.Pharmacies;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlMassira extends Activity implements ChargeJson.Listener, AdapterView.OnItemClickListener {
    String e1;
    public final static String lava = "";
    String f1;
    String f3;
    String f4;

    double userlocatLa;
    double userlocatLn;

    private ListView mListView;
    private ProgressDialog progress;
    LocationManager locationManager;

    LocationListener locationListener;

    SimpleAdapter adapter;


    private List<HashMap<String, String>> mAndroidMapList = new ArrayList<>();

    private static final String KEY_TITLE = "title";
    private static final String KEY_ADRESS = "adress";
    private static final String KEY_TEL = "tel";

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)

                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_al_massira);
        //////////////////////////////////////////////

        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        locationListener = new LocationListener() {

            @Override
            public void onLocationChanged(Location location) {

                userlocatLn=location.getLongitude();
                userlocatLa=location.getLatitude();

             //   Log.i("wiliba",location.getLongitude() + " " + location.getLatitude());

            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }

        };

        // If device is running SDK < 23

        if (Build.VERSION.SDK_INT < 23) {

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

        } else {

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                // ask for permission

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);


            } else {

                // we have permission!

                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

            }

        }







        //////////////////////////////////////////////

        Intent intent = getIntent();
        e1=intent.getStringExtra(Pharmacies.sendData);
        String URL = "http://www.pfefes.tk/Pharmacie/PharmacieSimple/"+ e1+".php";
        mListView = (ListView) findViewById(R.id.list_view);

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



    }


    private class GetCoordinates extends AsyncTask<String,Void,String> {


        @Override
        protected String doInBackground(String... strings) {
            String response;
            String response1;
            String response2;
            String response3;
            try{
                String address = strings[0];
                HttpDataHandler http = new HttpDataHandler();
                String url = String.format("https://maps.googleapis.com/maps/api/geocode/json?address=%s",address+",fes,maroc");
                response = http.getHTTPData(url);

                Log.i("wilima",""+url);
                if(response.contains("\"status\" : \"OK\"")) {

                    return response;
                }
                else{
                    String address1 = f4.toString().replace(" ","+");
                    HttpDataHandler http1 = new HttpDataHandler();
                    String url1 = String.format("https://maps.googleapis.com/maps/api/geocode/json?address=%s",address1+",fes,maroc");
                    response1 = http1.getHTTPData(url1);

                    Log.i("wilima",""+url1);
                    if(response1.contains("\"status\" : \"OK\"")) {

                        return response1;
                    }
                    else{

                        String address2 = f3.toString().replace(" ","+");
                        HttpDataHandler http2 = new HttpDataHandler();
                        String url2 = String.format("https://maps.googleapis.com/maps/api/geocode/json?address=%s",address2+",fes,maroc");
                        response2 = http2.getHTTPData(url2);

                        Log.i("wilima",""+url2);
                        if(response2.contains("\"status\" : \"OK\"")) {

                            return response2;
                        }
                        else{

                            HttpDataHandler http3 = new HttpDataHandler();
                            String url3= String.format("https://maps.googleapis.com/maps/api/geocode/json?address=Fes,Maroc");
                            response3 = http3.getHTTPData(url3);
                            Log.i("wilima",""+url3);
                            return response3;
                        }

                    }


                }
            }
            catch (Exception ex)
            {

            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            try{
                JSONObject jsonObject = new JSONObject(s);

                String lat = ((JSONArray)jsonObject.get("results")).getJSONObject(0).getJSONObject("geometry")
                        .getJSONObject("location").get("lat").toString();
                String lngs = ((JSONArray)jsonObject.get("results")).getJSONObject(0).getJSONObject("geometry")
                        .getJSONObject("location").get("lng").toString();

                Intent t3 = new Intent(AlMassira.this,MapsAct.class);

                String f8= lat + ","+ lngs+ "," + f1;
                String f9= userlocatLa+ ","+ userlocatLn;
                String f10= f8 +","+ f9;
                t3.putExtra(lava, String.valueOf(f10));
                startActivity(t3);
                progress.dismiss();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadListView() {

        adapter = new SimpleAdapter(AlMassira.this, mAndroidMapList, R.layout.list_item,
                new String[] { KEY_TITLE, KEY_ADRESS, KEY_TEL },
                new int[] { R.id.title,R.id.adress, R.id.tel }){

            @Override
            public View getView (final int position, View convertView, ViewGroup parent)
            {
                View v = super.getView(position, convertView, parent);

                Button b=(Button)v.findViewById(R.id.btt5);

                Button b2=(Button)v.findViewById(R.id.btt6);
                b.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {






                        // TODO Auto-generated method stub
                        f1 =mAndroidMapList.get(position).get(KEY_TITLE);
                        String f2=mAndroidMapList.get(position).get(KEY_ADRESS);
                        f3=f2.replace("Adresse :","");
                         f4=f1+" "+f3;

                        progress=new ProgressDialog(AlMassira.this);
                        progress.setMessage("Attendez S.V.P...");
                        progress.setIndeterminate(true);
                        progress.show();

                        new GetCoordinates().execute(f1.toString().replace(" ","+"));
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        try{Intent callIntent = new Intent(Intent.ACTION_CALL);

                                String a=mAndroidMapList.get(position).get(KEY_TEL).replace("tel:","");
                                callIntent.setData(Uri.parse("tel:"+a));
                                startActivity(callIntent);
                        }
                        catch (SecurityException err){
                            System.out.println(err);
                        }
                    }
                });
                return v;
            }


        };

        mListView.setAdapter(adapter);
        mListView.setTextFilterEnabled(true);



        EditText myFilter = (EditText) findViewById(R.id.myFilter);

        myFilter.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                v.setFocusable(true);
                v.setFocusableInTouchMode(true);
                return false;
            }
        });

        myFilter.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s.toString());
            }
        });
    }


}