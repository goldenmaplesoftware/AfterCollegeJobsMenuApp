package com.example.comtoisjean0674826_lab123;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.comtoisjean0674826_lab123.fragment.MenuFragment;


/*
* You will be creating an informational app about future jobs
Pick 5 different jobs you would like to have when you graduate at St. Clair College.
Your app will consist of 1 activity and 6 Fragments (MainActivity,
* MenuFragment, 5 other fragments, 1 for each of the jobs)
Each fragment about the Job should have the following:
Occupation image
Job title
Job description
Job requirements
Link to a real posting (This link does not need to be functional)
* - We will be coving this later in the semester
Please theme your application with a background color
Background colors should be externalized and stored in colors.xml
The app should use two different dimensions for text size:
regular text (your choice) sp
title text 22sp
The title text should be used for the title of the job and the regular text should be used for all other job information
Create appropriate values inside of the dimens.xml and utilize them where it seems necessary.
Feel free to style the app with additional features (as long as it does not impede the app's performance or stop you from complete the task)
The MainActivity will host the MenuFragment and all other fragments
The MenuFragment will have:
5 buttons to navigate to all the other fragments
All text values should be stored inside strings.xml

*
*
*
*
* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content,new MenuFragment());
        fragmentTransaction.commit();

    }
}