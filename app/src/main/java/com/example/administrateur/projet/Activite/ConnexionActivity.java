package com.example.administrateur.projet.Activite;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.administrateur.projet.BL.AgenceLogic;
import com.example.administrateur.projet.BL.LocationLogic;
import com.example.administrateur.projet.BL.LoginLogic;
import com.example.administrateur.projet.BL.VehiculeLogic;
import com.example.administrateur.projet.BO.Agence;
import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.Fragment.ConnexionFragment;
import com.example.administrateur.projet.R;
import com.example.administrateur.projet.Service.LoginService;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ConnexionActivity extends AppCompatActivity implements ConnexionFragment.OnFragmentInteractionListener {
    private LoginService loginService;
    private LoginLogic loginLogic;
    private AgenceLogic agenceLogic;
    private LocationLogic locationLogic;
    private VehiculeLogic vehiculeLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
    }

    @Override
    public void Connexion(Utilisateur utilisateur) {
        final String URL = "http://10.0.2.2:8080/connect";

        // Post params to be sent to the server
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("mail", "test2@icysoft.fr");
        params.put("password", "azerty");

        JsonObjectRequest req = new JsonObjectRequest(URL, new JSONObject(params),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String agenceId = response.getString("agenceID");
                            String userId = response.getString("userID");
                            //String error = response.getString("error");
                            Log.i("vallue !!", agenceId);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("Error: ", error.getMessage() == null ? "" : error.getMessage());
            }
        });

        RequestQueue queue = Volley.newRequestQueue(ConnexionActivity.this);
        queue.add(req);

       /* Utilisateur utilisateur1 = loginLogic.Connexion(utilisateur);

        agenceLogic.setAgences();
        locationLogic.setLocations();
        vehiculeLogic.setVehicules();

        if (utilisateur1 != null) {
            Intent intent = new Intent(ConnexionActivity.this, MenuActivity.class);
            intent.putExtra("id", utilisateur1.getId());
            startActivity(intent);
        } */
    }

    @Override
    public void Inscription() {
        Intent intent = new Intent(ConnexionActivity.this, InscriptionActivity.class);
        startActivity(intent);
    }

    /*private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            loginService = ((LoginService.LoginServiceBinder) iBinder).getService();
            loginService.Event(utilisateur2);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };*/
}
