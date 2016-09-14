package com.acme.monedas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.drive.internal.StringListResponse;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<String> arrMoney;
    Map<Double, Double> map;
    String[] ciudades = {};
    private Integer cont;
    private Iterator it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        String[] cd = {
                "Colombia pesos",
                "Usa Dolar",
                "Chile Pesos",
                "Brasil Reales",
                "China Yuan",
                "Japon Yen",
                "Mexico Pesos",
                "Euro"
        };
        ciudades = cd;
        map = new HashMap<Double, Double>();
        arrMoney = (ArrayList<String>) getIntent().getSerializableExtra("Monedas");
        map.put(4.570868, -74.29733299999998);
        map.put(40.7127837, -74.00594130000002);
        map.put(-35.675147, -71.54296899999997);
        map.put(-14.235004, -51.92527999999999);
        map.put(35.86166, 104.19539699999996);
        map.put(36.204824, 138.252924);
        map.put(23.634501, -102.55278399999997);
        map.put(52.7109496, 5.790705300000013);

        it = map.keySet().iterator();
        cont = 0;
        Integer s = arrMoney.size();
        Log.e("Size", s.toString());
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker

        while (it.hasNext()) {
            Double lat = (Double) it.next();
            Double lng = map.get(lat);
            Log.i("Location", lat.toString() + " - " + lng.toString());
            if (cont < arrMoney.size()) {
                this.cordenadas(lat, lng, ciudades[cont]);
                Log.e("Comparation", arrMoney.get(cont) + " = " + ciudades[cont]);
            }
            cont++;
        }


    }

    public void cordenadas(Double lat, Double lng, String name) {
        LatLng pais = new LatLng(lat, lng);
        mMap.addMarker(new MarkerOptions().position(pais).title(name));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(pais));
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
