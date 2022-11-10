package com.example.reachedapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.reachedapp.R;


public class TeacherAttendanceView extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};

        View view = inflater.inflate(R.layout.fragment_teacher_attendance_view, container, false);
        //Creating the instance of ArrayAdapter containing list of fruit names
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.drpdown_item, fruits);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView grades =  view.findViewById(R.id.gradesAutoComplete);
        grades.setThreshold(1);//will start working from first character
        grades.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView

        RecyclerView mRecyclerView = view.findViewById(R.id.daySelector);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));





        return view;
    }
}