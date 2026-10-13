package com.example.navigate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment_second.xml layout
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewMovies);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Bones and All", "2022", "131 Minutes", "Drama, Horror", "Premium", R.drawable.boneandall));
        movies.add(new Movie("Bottoms", "2023", "102 Minutes", "Comedy", "Free", R.drawable.bottoms));
        movies.add(new Movie("Hunger Games", "2012", "142 Minutes", "Action, Adventure", "Premium", R.drawable.katniss));
        movies.add(new Movie("Pen15", "2019", "30 Minutes", "Comedy, TV Show", "Free", R.drawable.pen15));

        MovieAdapter adapter = new MovieAdapter(movies);
        recyclerView.setAdapter(adapter);
    }
}
