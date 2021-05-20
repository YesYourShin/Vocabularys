package com.example.vocabularynote3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VNoteAdapter extends RecyclerView.Adapter<VNoteAdapter.CustomViewHolder> {

    // 메인 화면 리스트
    private ArrayList<VNoteData> arrayList;

    public VNoteAdapter(ArrayList<VNoteData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public VNoteAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vnote_item_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VNoteAdapter.CustomViewHolder holder, int position) {
        holder.list_title.setText(arrayList.get(position).getList_title());


        holder.itemView.setTag(position);
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(v.getContext(), EditItem.class);
//                v.getContext().startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView list_title;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.list_title = (TextView) itemView.findViewById(R.id.list_title);
        }
    }
}
