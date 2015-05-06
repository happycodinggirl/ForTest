package com.example.huangxingli.fortest;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

/**
 * Created by huangxingli on 2015/4/30.
 */
public class IntruduceFragment extends BaseFragment  {

  //  private RecyclerView mRecycleView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.v("TAG", "---INTRUDUCEfRAGMENT CONTAINER IS---" + container);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void exeBackgroundTask() {
        Log.v("TAG", "----EXEBACKGROUNDTassk====");
       // new IntruduceAscTask().execute();
    }

    @Override
    public View inflateView(ViewGroup container) {
        Log.v("TAG", "----intruduceFragment inflateView Container is--" + container);
        view=View.inflate(getActivity(), R.layout.pageritem,container);
        return view;
    }

  /*  @Override
    public void initView() {
        Log.v("TAG","----VIEW IS---"+view);
        mRecycleView= (RecyclerView)view.findViewById(R.id.recyclerview);
        mRecycleView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecycleView.setLayoutManager(llm);
        Log.v("TAG","---INITVIEW FINISHED ---");
    }
*/
    @Override
    public <T> void setAdapter(ArrayList<T> result) {
        Log.v("TAG","---setAdapter---");
        //BaseAdapter adapter=new BaseAdapter(getActivity(),result);
       // mRecycleView.setAdapter(adapter);

    }


    /*@Override
    public <T> void onLoadFinished(ArrayList<T> result) {
        Log.v("TAG", "---IntruduceFragment---onLoadFinished---");
        if (result==null){
        Log.v("TAG","--RESULT IS NULL");
        }else {
            setAdapter(result);
        }
    }*/


}

