package com.example.navigate; // <-- use your actual package name

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.txtTitle.setText(movie.title);
        holder.txtYear.setText(movie.year);
        holder.txtDuration.setText(movie.duration);
        holder.txtGenre.setText(movie.genre);
        holder.txtLabel.setText(movie.label);
        holder.imgPoster.setImageResource(movie.imageResId);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtYear, txtDuration, txtGenre, txtLabel;
        ImageView imgPoster;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            txtGenre = itemView.findViewById(R.id.txtGenre);
            txtLabel = itemView.findViewById(R.id.txtLabel);
            imgPoster = itemView.findViewById(R.id.imgPoster);
        }
    }
}
