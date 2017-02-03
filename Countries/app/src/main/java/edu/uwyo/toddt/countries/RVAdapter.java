package edu.uwyo.toddt.countries;

/**
 * Created by toddm on 2/2/2017.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private List<String> cList;
    private int rowLayout;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView countryName;
        public ViewHolder(View itemView){
            super(itemView);
            countryName = (TextView) itemView.findViewById(R.id.count_name);
        }
    }

    // Constructor
    public RVAdapter(List<String> cList, int rowLayout, Context context){
        this.cList = cList;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    // Create new views
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        String entry = cList.get(i);
        viewHolder.countryName.setText(entry);
        viewHolder.countryName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tv = (TextView)v;
                Toast.makeText(mContext, tv.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Return the size of your dataset
    @Override
    public int getItemCount() {
        return cList == null ? 0 : cList.size();
    }
}
