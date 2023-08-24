package com.example.tlshelper.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tlshelper.R;
import com.example.tlshelper.databinding.ActivityMainBinding;
import com.example.tlshelper.ui.main.home_page.HomepageFragment;
import com.example.tlshelper.ui.main.search.SearchFragment;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private long lastBackPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Fragment fragment = new HomepageFragment();

        getSupportFragmentManager().beginTransaction().replace(binding.holderMain.getId(), fragment).commit();

        binding.botNavMain.setOnItemSelectedListener((OnItemSelectedListener) i -> {
            Fragment selectedFragment;

            switch (i){
                case 0: {
                    selectedFragment = new HomepageFragment();
                    break;
                }
                case 1:{
                    selectedFragment = new SearchFragment();
                    break;
                }
                default:{
                    selectedFragment = new HomepageFragment();
                }
            }

            getSupportFragmentManager().beginTransaction().replace(binding.holderMain.getId(), selectedFragment).commit();
            return true;
        });



    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastBackPressedTime > 2000) {
            Toast.makeText(this, "Nhấn một lần nữa để thoát", Toast.LENGTH_SHORT).show();
            lastBackPressedTime = currentTime;
        } else {
            super.onBackPressed();
        }
    }


}