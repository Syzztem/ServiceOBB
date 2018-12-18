package fr.wildcodeschool.serviceobb.fragment;


import android.os.Bundle;
import android.os.storage.OnObbStateChangeListener;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.wildcodeschool.serviceobb.OBBManager;
import fr.wildcodeschool.serviceobb.R;

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

        OBBManager manager = new OBBManager(container.getContext(), new OnObbStateChangeListener() {
            @Override
            public void onObbStateChange(String path, int state) {
                super.onObbStateChange(path, state);
            }
        });
        manager.mount();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music_list, container, false);
    }

}
