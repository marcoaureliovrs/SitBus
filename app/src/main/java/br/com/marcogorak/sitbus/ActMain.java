package br.com.marcogorak.sitbus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.marcogorak.sitbus.MyFragments.FragConfig;
import br.com.marcogorak.sitbus.MyFragments.FragHome;
import br.com.marcogorak.sitbus.MyFragments.FragMapa;

public class ActMain extends AppCompatActivity {

    private TextView mTextMessage;
    private GoogleMap mMap;
    SupportMapFragment mapFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    FragHome fragHome = new FragHome();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_id,fragHome).commit();
                    return true;
                case R.id.navigation_dashboard:
                    FragMapa fragMapa = new FragMapa();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_id,fragMapa).commit();
                    return true;
                case R.id.navigation_notifications:
                    FragConfig fragConfig = new FragConfig();
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_id,fragConfig).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);


        FragHome fragHome = new FragHome();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_id,fragHome).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
