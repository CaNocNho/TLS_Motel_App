package com.example.tlshelper.ui.main.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tlshelper.databinding.FragmentSearchBinding;
import com.example.tlshelper.utils.Constant;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class SearchFragment extends Fragment {
    private FragmentSearchBinding binding;
    private JSONObject jsonHCMDistrictsToWards;
    private String selectedDistrict;
    private String selectedWard;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater);
        initComponents();
        return binding.getRoot();
    }

    private void initComponents() {
        spinnersSetup();
    }

    private void spinnersSetup() {
        binding.spinnerWards.setEnabled(false);
        try {
            jsonHCMDistrictsToWards = new JSONObject(Constant.JSON_HCM_DISTRICT_TO_WARDS);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        List<String> districts = new ArrayList<>(jsonHCMDistrictsToWards.length());
        Iterator<String> keysIterator = jsonHCMDistrictsToWards.keys();

        while (keysIterator.hasNext()) {
            districts.add(keysIterator.next());
        }

        ArrayAdapter<String> districtsAdapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, districts);
        districtsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerDistricts.setAdapter(districtsAdapter);
        binding.spinnerDistricts.setOnItemClickListener((adapterView, view, i, l) -> {
            String selectedKey = districts.get(i);
            selectedWard = null;
            selectedDistrict = selectedKey;
            try {
                JSONArray wardsJSONArray = jsonHCMDistrictsToWards.getJSONArray(selectedKey);
                List<String> wards = new ArrayList<>(wardsJSONArray.length());

                for (int j = 0; j < wardsJSONArray.length(); j++) {
                    wards.add(wardsJSONArray.getString(j));
                }

                ArrayAdapter<String> wardsAdapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, wards);
                wardsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                binding.spinnerWards.setAdapter(wardsAdapter);
                binding.spinnerWards.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        selectedWard = wards.get(i);
                    }
                });
                binding.spinnerWards.setEnabled(true);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        });
    }

}
