package com.example.comtoisjean0674826_lab123.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.comtoisjean0674826_lab123.R;

import java.util.Objects;
///This is also reffered to as the main fragement,  but menu is more accurate!
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
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
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_menu, container, false); //Return line added
        FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();

                                                ///Buttons:
        Button button1=view.findViewById(R.id.androidButton); ///Android button
        button1.setOnClickListener(new View.OnClickListener()  ///Makes the button active
            {
            @Override
            public void onClick(View v)
            {
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        ///This is the custom animation when the button is clicked
                        .setCustomAnimations(R.anim.animate_in_down,R.anim.animate_out_down,R.anim.animate_back_in_down,R.anim.animation_back_out_down)

                        .replace(R.id.content,new AndroidDeveloper()).addToBackStack(null).commit();
            }
            });

        Button button2=view.findViewById(R.id.fullStackButton); ///Android button
        button2.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        .setCustomAnimations(R.anim.animate_in_down,R.anim.animate_out_down,R.anim.animate_back_in_down,R.anim.animation_back_out_down)
                        .replace(R.id.content,new FullStackDeveloper()).addToBackStack(null).commit();
            }
        });

        Button button3=view.findViewById(R.id.softwareDevButtonn); ///Android button
        button3.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        .setCustomAnimations(R.anim.animate_in_down,R.anim.animate_out_down,R.anim.animate_back_in_down,R.anim.animate_out_down)
                        .replace(R.id.content,new SoftwareDeveloper()).addToBackStack(null).commit();
            }
        });

        Button button4=view.findViewById(R.id.videogamedevButton); ///Android button
        button4.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        .replace(R.id.content,new VideoGameDeveloper()).addToBackStack(null).commit();
            }
        });

        Button button5=view.findViewById(R.id.webdevButton); ///Android button
        button5.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        .replace(R.id.content,new WebDeveloper()).addToBackStack(null).commit();
            }
        });


        ///Return initalized view

        return view;

    }
}