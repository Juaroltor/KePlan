package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.example.myapplication.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.net.URI;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Button link;


    public void buttonDiscotecasPress(View view){

        mMap.clear();

        //Coordenadas de Antique
        LatLng antique = new LatLng(37.4050289, -6.0010657);
        mMap.addMarker(new MarkerOptions().position(antique).title("Antique").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Coordenadas de Uthopia

        LatLng uthopia = new LatLng(37.3910154, -6.0033025);
        mMap.addMarker(new MarkerOptions().position(uthopia).title("Uthopia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Coordenadas de Abril
        LatLng abril = new LatLng(37.3873087, -5.972504);
        mMap.addMarker(new MarkerOptions().position(abril).title("Abril").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Coordenadas de Le Chic
        LatLng lechic = new LatLng(37.3802592, -5.9774349);
        mMap.addMarker(new MarkerOptions().position(lechic).title("Le Chic Viapol").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

    }

    public void buttonEntradasPress(View view){
        String _url = "https://www.entradas.com/";
        Uri uri = Uri.parse(_url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void buttonHoyPress(View view){
        String url = "https://www.google.es/maps/search/que+hacer+hoy+en+sevilla/@37.3872801,-5.9948767,17z/data=!3m1!4b1";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void buttonSalasPress(View view){

        mMap.clear();

        //Coordenadas de Cosmos
        LatLng cosmos = new LatLng(37.3784644, -5.9743113);
        mMap.addMarker(new MarkerOptions().position(cosmos).title("Sala Cosmos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        //Coordenadas de Sala Even
        LatLng even = new LatLng(37.408385, -5.9887635);
        mMap.addMarker(new MarkerOptions().position(even).title("Sala Even").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        //Coordenadas de Sala X
        LatLng salax = new LatLng(37.408386, -5.9887636);
        mMap.addMarker(new MarkerOptions().position(salax).title("Sala X").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        //Coordenadas de Sala La Calle
        LatLng lacalle = new LatLng(37.408387, -5.9887637);
        mMap.addMarker(new MarkerOptions().position(lacalle).title("Sala La Calle").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        //Coordenadas de FunClub
        LatLng funclub = new LatLng(37.3970341, -5.994332);
        mMap.addMarker(new MarkerOptions().position(funclub).title("FUN CLUB").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

    }

    public void buttonBares(View view){
        mMap.clear();

        //Coordenadas el Rinconcillo
        LatLng rinconcillo = new LatLng(37.3933641, -5.9904862);
        mMap.addMarker(new MarkerOptions().position(rinconcillo).title("El Rinconcillo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Coordenadas de Antigua Taberna de las Escobas
        LatLng escobas = new LatLng(37.3869633, -5.9953046);
        mMap.addMarker(new MarkerOptions().position(escobas).title("Antigua Taberna de las Escobas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Coordenadas de la Flor del Toranzo
        LatLng flor = new LatLng(37.3877876, -5.9978398);
        mMap.addMarker(new MarkerOptions().position(flor).title("La Flor del Toranzo").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Coordenadas de las Teresas
        LatLng teresas = new LatLng(37.3859753, -5.9915018);
        mMap.addMarker(new MarkerOptions().position(teresas).title("Las Teresas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Coordenadas de Antigüedades Bar
        LatLng antiguedades = new LatLng(37.3872716, -5.994332);
        mMap.addMarker(new MarkerOptions().position(antiguedades).title("Antigüedades Bar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Coordenadas de Ovejas Negras Tapas
        LatLng ovejas = new LatLng(37.3872716, -5.9948767);
        mMap.addMarker(new MarkerOptions().position(ovejas).title("Ovejas Negras Tapas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View buttonDiscotecas = findViewById(R.id.discotecas);
        View buttonSalas = findViewById(R.id.salas);
        View buttonBares = findViewById(R.id.bares);
/*
        link = findViewById(R.id.btn_link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });*/

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng seville = new LatLng(37.3826, -5.99629);

        float zoomLevel = 13.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seville, zoomLevel));

        mMap.getUiSettings().setZoomControlsEnabled(true);




    }





}