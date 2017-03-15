package com.example.ismail.pfe.Json;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.example.ismail.pfe.Pharmacie.AlMassira;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by ISMAIL on 05/03/2017.
 */

public class ChargeJson  extends AsyncTask<String, Void, Reponse> {


    public ChargeJson( ChargeJson.Listener listener) {

        mListener = listener;
    }

    public interface Listener {

        void onLoaded(List<PharmacieInfo> androidList);

        void onError();
    }

    private ChargeJson.Listener mListener;

    private ProgressDialog progressDialog;




    @Override
    protected void onPreExecute() {
        // set up progress dialog
        progressDialog = new ProgressDialog((Context) mListener);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Attendez S.V.P ...");
        progressDialog.show();
    }


    @Override
    protected Reponse doInBackground(String... strings) {
        try {

            String stringResponse = loadJSON(strings[0]);
            Gson gson = new Gson();

            return gson.fromJson(stringResponse, Reponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    protected void onPostExecute(Reponse response) {

        if (response != null) {

            mListener.onLoaded(response.getAndroid());

        } else {

            mListener.onError();
        }
    }

    private String loadJSON(String jsonURL) throws IOException {

        URL url = new URL(jsonURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = in.readLine()) != null) {

            response.append(line);
        }

        in.close();
        progressDialog.dismiss();
        return response.toString();
    }
}
