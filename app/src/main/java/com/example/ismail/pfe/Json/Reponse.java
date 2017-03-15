package com.example.ismail.pfe.Json;



import com.example.ismail.pfe.Json.PharmacieInfo;

import java.util.ArrayList;
import java.util.List;

public class Reponse {

    private List<PharmacieInfo> Pharmacie = new ArrayList<PharmacieInfo>();

    public List<PharmacieInfo> getAndroid() {
        return Pharmacie;
    }
}