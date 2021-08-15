package com.example.android14;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private ArrayList<SongModel> list = new ArrayList<>();
    private OnSongClick onSongClick;

    public void setList(ArrayList<SongModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnSongClick(OnSongClick onSongClick) {
        this.onSongClick = onSongClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrecycler ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView flag;
        private TextView textAuthor;
        private TextView textSong;


        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onSongClick.onSong();
                }
            });
//            flag = itemView.findViewById(R.id.flag_rv);
            textAuthor = itemView.findViewById(R.id.textAuthor);
            textSong = itemView.findViewById(R.id.textSong);
        }

        public void onBind(SongModel songModel) {
//            flag.setImageResource(songModel.getImg());
            textAuthor.setText(songModel.getAuthorName());
            textSong.setText(songModel.getSongName());
        }
    }
}
