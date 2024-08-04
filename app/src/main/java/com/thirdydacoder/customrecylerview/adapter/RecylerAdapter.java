package com.thirdydacoder.customrecylerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.thirdydacoder.customrecylerview.R;
import com.thirdydacoder.customrecylerview.model.RecylerModel;
import java.util.List;


public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.ViewHolder> {

    Context context;
    List<RecylerModel> recylerModels;

    public RecylerAdapter(Context context, List<RecylerModel> recylerModels) {
        this.context = context;
        this.recylerModels = recylerModels;
    }

    @NonNull
    @Override
    public RecylerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerAdapter.ViewHolder holder, int position) {
        holder.txtDate.setText(recylerModels.get(position).getDate());
        holder.txtTitle.setText(recylerModels.get(position).getTitle());
        holder.txtDescription.setText(recylerModels.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return recylerModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtDate, txtTitle, txtDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDate = itemView.findViewById(R.id.txt_date);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescription = itemView.findViewById(R.id.txt_description);
        }

    }

}
