package com.example.makwanamitesh.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pranav on 2/24/2018.
 */

public class adapter extends RecyclerView.Adapter<adapter.programmviewholder> {

    private String [] data;
    public adapter(String [] data){
        this.data=data;
    }
    @Override
    public programmviewholder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout,parent, false);
        return new programmviewholder(v);
    }

    @Override
    public void onBindViewHolder(programmviewholder holder, int position) {
        String title = data [position];
        holder.text.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public class  programmviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
        public programmviewholder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            text=itemView.findViewById(R.id.text);
        }
    }

}
