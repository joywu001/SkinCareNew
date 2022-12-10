package com.example.skincare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.HttpClient;

public class Prod_Cheap extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstantState) {
        return inflater.inflate(R.layout.prod_cheap, container, false);


    }
}
