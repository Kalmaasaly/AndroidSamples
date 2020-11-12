package com.example.androidSamples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapFragment extends Fragment {




    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_map, container, false);
      //  view.
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.google_map);
        supportMapFragment.onCreate(savedInstanceState);
        supportMapFragment.onResume();
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final GoogleMap googleMap) {

                        LatLng haddah = new LatLng(15.305070, 44.186460);
                        LatLng fajAttan = new LatLng(15.328790,44.181640);


                        MarkerOptions markerOptions =  new MarkerOptions();
                        MarkerOptions markerOptionsfaj =  new MarkerOptions();

                        markerOptions.position(haddah);

                        markerOptions.title("Lorem ipsum dolor sit amet,Lorem ipsum " +
                                "dolor sit amet Lorem ipsum dolor sit amet");
                        markerOptionsfaj.position(fajAttan);

                        markerOptionsfaj.title("Lorem ipsum dolor sit amet,Lorem ipsum " +
                                "dolor sit amet Lorem ipsum dolor sit amet");
                        googleMap.clear();
                        googleMap.animateCamera(CameraUpdateFactory.newLatLng( haddah));
                        googleMap.animateCamera(CameraUpdateFactory.newLatLng( fajAttan));
                        googleMap.addMarker(markerOptions);
                        googleMap.addMarker(markerOptionsfaj);



            }
        });

        return view;
    }


}