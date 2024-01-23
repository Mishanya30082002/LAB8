package com.example.myapplication.fragments;

import androidx.lifecycle.ViewModel;

import com.example.myapplication.Game;
import com.example.myapplication.GameAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ViewModelGame extends ViewModel {
    public List<Game> gameList = new ArrayList<>();

    public void setGame() {
        if (!gameList.isEmpty()) return;
        gameList.add(new Game("CSGO", 2015, R.drawable.csgo));

    }

    public ViewModelGame() {
        setGame();
    }
}