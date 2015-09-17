package be.vdab.fanpagina.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import be.vdab.fanpagina.R;

public class FanAdapter extends RecyclerView.Adapter<FanAdapter.ViewHolder> {
    private String[] dataset;

    public FanAdapter(String [] strings) {
        dataset = strings;
    }

    @Override
    public FanAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout, viewGroup, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(FanAdapter.ViewHolder viewHolder, int i) {
        viewHolder.TextView.setText(dataset[i]);
//        int random1 = (int) (Math.random() * 256);
//        int random2 = (int) (Math.random() * 256);
//        int random3 = (int) (Math.random() * 256);
//        viewHolder.TextView.setTextColor(Color.rgb(random1, random2, random3));

    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView TextView;
        public ViewHolder(View v) {
            super(v);
            TextView = (TextView)v.findViewById(R.id.items);
        }

    }


}
