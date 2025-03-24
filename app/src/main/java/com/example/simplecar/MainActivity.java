package com.example.simplecar;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import com.example.simplecar.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Shivam commit

    }


    void shivamfun(){
       String num="jayesh";
       String last="parmar";

       String s1="parmar";
       String s2="parmar";
       String s3="parmar";
       String s4="parmar";
    }
}