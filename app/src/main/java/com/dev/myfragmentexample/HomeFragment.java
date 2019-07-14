package com.dev.myfragmentexample;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private  HomeFragmentConnect homeFragmentConnect;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof HomeFragmentConnect){
            homeFragmentConnect = (HomeFragmentConnect) getActivity();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn = (Button)view.findViewById(R.id.homeBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragmentConnect.onHomeBtnPressed();
            }
        });

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface HomeFragmentConnect{
        void onHomeBtnPressed();
    }
}
