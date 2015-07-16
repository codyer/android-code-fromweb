package com.pao123.contrl.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pao123.www.R;


public class RealTimeFragment extends Fragment {

    private View parentView;
   // private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.realtime, container, false);
        //listView   = (ListView) parentView.findViewById(R.id.listView);

        return parentView;
    }

 
 
}
