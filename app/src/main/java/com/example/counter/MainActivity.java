package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.add.setOnClickListener(v -> add());
        binding.minus.setOnClickListener(v -> minus());
    }
    private void add(){
        count++;
        updateCount();
    }
    private void minus(){
        count--;
        if (count<0){
            count=0;
        }
        updateCount();
    }
    private void updateCount(){
        binding.number.setText(Integer.toString(count));
    }
}