package app.sbk.com.sbk.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.sbk.com.sbk.R;
import app.sbk.com.sbk.adapter.UserReportAdapter;
import app.sbk.com.sbk.model.UserTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserReportFragment extends Fragment {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    UserReportAdapter userReportAdapter;


    public UserReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_report, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        //getListData();
        //progressView = (CircularProgressView)view.findViewById(R.id.progressView);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //txtMessage = (TextView)view.findViewById(R.id.txtMessage);
        userReportAdapter = new UserReportAdapter(getWorkList());
        recyclerView.setAdapter(userReportAdapter);

    }

    public List<UserTask> getWorkList() {
        List<UserTask> list = new ArrayList<>();
        UserTask userTask;
        userTask = new UserTask("12", "aa");
        list.add(userTask);
        userTask = new UserTask("12", "aa");
        list.add(userTask);
        return list;

    }
}
