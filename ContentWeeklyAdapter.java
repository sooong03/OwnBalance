package kr.anima.xd.s.ownbalance;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alfo6-10 on 7/10/2017.
 */

public class ContentWeeklyAdapter extends RecyclerView.Adapter {

    Context context;

    public ContentWeeklyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.content_date_weekly, parent, false);
        ViewHolder holder=new ViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView week, date;

        public ViewHolder(View itemView) {
            super(itemView);
            week= (TextView) itemView.findViewById(R.id.txt_week);
            date= (TextView) itemView.findViewById(R.id.txt_date);
        }

    }


}
