package fr.wildcodeschool.serviceobb.fragment;


import android.os.Bundle;
import android.os.storage.OnObbStateChangeListener;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.wildcodeschool.serviceobb.OBBManager;
import fr.wildcodeschool.serviceobb.R;
import fr.wildcodeschool.serviceobb.adapter.MusicAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicListFragment extends Fragment {

    public MusicListFragment() {
        // Required empty public constructor
    }

    public static MusicListFragment newInstance() {

        Bundle args = new Bundle();

        MusicListFragment fragment = new MusicListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.fragment_music_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        MusicAdapter adapter = new MusicAdapter();
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

}
