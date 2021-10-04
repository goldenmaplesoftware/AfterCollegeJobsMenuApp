package com.example.comtoisjean0674826_lab123.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.comtoisjean0674826_lab123.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SoftwareDeveloper#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SoftwareDeveloper extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SoftwareDeveloper() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SoftwareDeveloper.
     */
    // TODO: Rename and change types and number of parameters
    public static SoftwareDeveloper newInstance(String param1, String param2) {
        SoftwareDeveloper fragment = new SoftwareDeveloper();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_software_developer, container, false);
        Animation animate= AnimationUtils.loadAnimation(getContext(),R.anim.alpha_in_translatesoft);
        return view;
    }
}