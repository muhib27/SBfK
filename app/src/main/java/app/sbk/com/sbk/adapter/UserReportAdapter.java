package app.sbk.com.sbk.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.sbk.com.sbk.R;
import app.sbk.com.sbk.model.UserTask;

/**
 * Created by RR on 22-Jan-18.
 */

public class UserReportAdapter extends RecyclerView.Adapter<UserReportAdapter.MyViewHolder>{

    private List<UserTask> dataSet;

    public UserReportAdapter(List<UserTask> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_work, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TextView dateText = holder.dateText;
        TextView taskName = holder.taskName;

        dateText.setText(dataSet.get(position).getDate());
        taskName.setText(dataSet.get(position).getTask());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView dateText;
        TextView taskName;

        public MyViewHolder(View itemView) {
            super(itemView);
            dateText = (TextView)itemView.findViewById(R.id.dateText);
            taskName = (TextView)itemView.findViewById(R.id.taskName);

        }
    }
}
