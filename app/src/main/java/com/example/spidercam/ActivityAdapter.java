package com.example.spidercam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class ActivityAdapter extends FirebaseRecyclerAdapter<ActivityModel,ActivityAdapter.myViewHolder> {
   public ActivityAdapter(@NonNull FirebaseRecyclerOptions<ActivityModel> options) {
      super(options);
   }

   @Override
   protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull ActivityModel model) {
      holder.date.setText(model.getDate());
      holder.message.setText(model.getMessage());
   }

   @NonNull
   @Override
   public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.log_single_row,parent,false);

      return new myViewHolder(view);
   }

   class myViewHolder extends RecyclerView.ViewHolder{
      TextView date,message;
      public myViewHolder(@NonNull View itemView) {
         super(itemView);
         date = itemView.findViewById(R.id.date);
         message = itemView.findViewById(R.id.message);
      }
   }
}
