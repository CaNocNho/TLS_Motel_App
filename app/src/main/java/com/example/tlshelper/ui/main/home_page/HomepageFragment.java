package com.example.tlshelper.ui.main.home_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tlshelper.databinding.FragmentHomepageBinding;

public class HomepageFragment extends Fragment {
    private FragmentHomepageBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomepageBinding.inflate(inflater);
        return binding.getRoot();
    }
}
