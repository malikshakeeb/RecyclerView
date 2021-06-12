package com.shakeeb.recyclerview_191094;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdopter extends RecyclerView.Adapter<RecyclerAdopter.ViewHolder>{

    String data[];
    Context context;

    public RecyclerAdopter(Context context,String[] data){
        this.data=data;
        this.context=context;

    }

    @NonNull
    @Override
    public RecyclerAdopter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.custome_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdopter.ViewHolder holder, int position) {

         holder.textView.setText(data[position]);
         holder.textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(context,"You touch on "+data[position],Toast.LENGTH_SHORT).show();
             }
         });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView)
        {

            super(itemView);
            textView=itemView.findViewById(R.id.textname);
        }
    }
}
