package com.dadybima.navdraweractivity.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dadybima.navdraweractivity.R;
import com.dadybima.navdraweractivity.databinding.FragmentBioBinding;

public class HomeFragment extends Fragment {
    Activity context;
    private FragmentBioBinding binding;
    private Spinner kota;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle
                                     savedInstanceState) {
        context = getActivity();
        binding = FragmentBioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    public void onStart() {
        super.onStart();
        Button simpan = (Button) context.findViewById(R.id.simpan_button);
        Spinner kota = (Spinner) context.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(getActivity(), R.array.kota,
                        android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kota.setAdapter(adapter);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, "Biodata Tersimpan",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}