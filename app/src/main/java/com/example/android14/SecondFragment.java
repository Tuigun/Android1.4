package com.example.android14;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android14.databinding.ActivitySecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnSongClick {

    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<SongModel> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list = new ArrayList<>();
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));
        list.add(new SongModel("Mirbek", "Kara"));

        adapter = new RecyclerAdapter();
        adapter.setOnSongClick(this);

        adapter.setList(list);
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onSong() {
        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        requireActivity().startActivity(intent);
    }
}