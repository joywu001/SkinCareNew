package com.example.skincare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Needs_drySkin extends Fragment {

    //http://140.136.151.160/phpmyadmin/index.php?route=/sql&db=skin&table=skin&pos=0

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstantState){
        return inflater.inflate(R.layout.needs_dryskin,container,false);
    }
}
