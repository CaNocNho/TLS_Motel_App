package com.example.tlshelper.ui.app_intro;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.example.tlshelper.App;
import com.example.tlshelper.R;
import com.example.tlshelper.data.local.pref.AppIntroPrefManager;
import com.example.tlshelper.ui.main.MainActivity;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.AppIntroPageTransformerType;

public class AppIntroActivity extends AppIntro {
    private AppIntroPrefManager appIntroPrefManager;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        App app = (App) getApplication();
        appIntroPrefManager = app.getAppIntroPrefManager();

        if(!appIntroPrefManager.isIntroShown()){
            initComponents();
        }
        else {
            changeToMainActivity();
        }

    }

    private void initComponents(){
        addSlide(AppIntroFragment.createInstance(
                getString(R.string.app_intro_welcome_title) + "\n" + getString(R.string.app_name),
                getString(R.string.app_intro_welcome_description),
                R.drawable.img_intro_logo_200x200,
                R.color.main_color,
                R.color.white,
                R.color.white
        ));

        addSlide(AppIntroFragment.createInstance(
                getString(R.string.app_intro_easy_title) + "\n" + getString(R.string.app_name),
                getString(R.string.app_intro_easy_description),
                R.drawable.img_intro_map_location_200x200,
                R.color.main_color,
                R.color.white,
                R.color.white
        ));

        addSlide(AppIntroFragment.createInstance(
                getString(R.string.app_intro_become_title) + "\n" + getString(R.string.app_name),
                getString(R.string.app_intro_become_description),
                R.drawable.img_intro_connections_200x200,
                R.color.main_color,
                R.color.white,
                R.color.white
        ));

        setTransformer(AppIntroPageTransformerType.Fade.INSTANCE);
        showStatusBar(true);
        setColorTransitionsEnabled(true);
        setSystemBackButtonLocked(true);
        setWizardMode(true);
        setImmersiveMode();
        setIndicatorEnabled(true);
        setButtonsEnabled(true);
        setVibrate(true);
    }

    private void changeToMainActivity(){
        startActivity(
                new Intent(this, MainActivity.class)
        );
        finish();
    }

    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        appIntroPrefManager.setIntroShown(true);
        changeToMainActivity();
    }
}