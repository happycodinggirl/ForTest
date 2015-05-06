package com.example.huangxingli.fortest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;


/**
 * Created by huangxingli on 2015/4/30.
 */
public abstract class BaseFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //initView();
        Log.v("TAG","----CONTAINER IS--"+container);
       // view=inflateView(container);
        View  view=View.inflate(getActivity(), R.layout.pageritem,container);
        //initView();
      //  setOnLoadInfoCallback(this);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      //  exeBackgroundTask();
    }



    public abstract void exeBackgroundTask();

    public abstract View inflateView(ViewGroup container);

  //  public abstract void initView();

    public abstract <T> void setAdapter(ArrayList<T> result);

}
