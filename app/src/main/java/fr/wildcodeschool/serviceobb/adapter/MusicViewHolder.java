package fr.wildcodeschool.serviceobb.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fr.wildcodeschool.serviceobb.R;

public class MusicViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;

    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tvName = itemView.findViewById(R.id.music_item_name);
    }

    public String getName() {
        return tvName.getText().toString();
    }

    public void setName(String name) {
        tvName.setText(name);
    }
}
