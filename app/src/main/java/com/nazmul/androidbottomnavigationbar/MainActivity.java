package com.nazmul.androidbottomnavigationbar;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottombar);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        bottomNavigationView.setItemBackgroundResource(R.color.home);
                        break;

                    case R.id.music:
                        bottomNavigationView.setItemBackgroundResource(R.color.music);
                        break;

                    case R.id.cart:
                        bottomNavigationView.setItemBackgroundResource(R.color.cart);
                        break;


                       

                }

            }
        });
    }
}
