package fr.wildcodeschool.serviceobb.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import fr.wildcodeschool.serviceobb.R;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {

    List<String> list = Arrays.asList("Tata", "TuTu");

    public MusicAdapter() {
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MusicViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.music_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, int i) {
        String item = list.get(i);
        musicViewHolder.setName(item);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
