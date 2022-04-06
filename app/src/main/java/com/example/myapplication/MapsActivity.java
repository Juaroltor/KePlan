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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    public void buttonDiscotecasPress(View view){

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
        String url = "https://www.entradas.com/";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void buttonSalasPress(View view){


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View buttonDiscotecas = findViewById(R.id.discotecas);
        View buttonSalas = findViewById(R.id.salas);
        View buttonBares = findViewById(R.id.bares);



        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

/**
 *      buttonDiscotecas.setOnClickListener(new View.OnClickListener(){
 *         public void onClick(View v){
 *              LatLng antique = new LatLng(37.4050289, -6.0010657);
 *             mMap.addMarker(new MarkerOptions().position(antique).title("Antique"));
 * }
 });
 */

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng seville = new LatLng(37.3826, -5.99629);
        //LatLng RBB = new LatLng(37.353831918, -5.975496098);
        //mMap.addMarker(new MarkerOptions().position(seville).title("Marker in Seville"));
        //mMap.addMarker(new MarkerOptions().position(RBB).title("Musho Beti"));
        float zoomLevel = 13.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seville, zoomLevel));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(RBB));

        //LatLng antique = new LatLng(37.4050289, -6.0010657);
        //mMap.addMarker(new MarkerOptions().position(antique).title("Antique"));




    }



    public void buttonBares(View view){
        Toast.makeText(this, "Bares Button CLicked", Toast.LENGTH_SHORT).show();
    }


}