package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import java.util.ArrayList;

import Adapter.RecycleAdapter_ListHome;
import ModelClass.HomeListModelClass;
import design.ws.com.appstore.R;


public class SelectionFragment extends Fragment {



    private View view;


    private ArrayList<HomeListModelClass> homeListModelClasses;

    private RecyclerView recyclerView_list;
    private RecycleAdapter_ListHome mAdapter_list;

    private Integer image1[] = {R.drawable.square_img, R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,};
    private String title1[] = {"Facebook","Instagram","Racing","Music"};
    private String view1[] = {"23.3M","35.2M","12.5M","45.4M"};
    private String install[] = {"Installed 8.5m time(s)","Installed 7.5m time(s)","Installed 15m time(s)","Installed 5m time(s)"};





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_selection, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);




         /*Recyclerview Listview code is here*/


        recyclerView_list = (RecyclerView) view.findViewById(R.id.recyclerview);
        homeListModelClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            HomeListModelClass beanClassForRecyclerView_contacts = new HomeListModelClass(image1[i],title1[i],view1[i],install[i]);

            homeListModelClasses.add(beanClassForRecyclerView_contacts);
        }





        mAdapter_list = new RecycleAdapter_ListHome(getActivity(),homeListModelClasses);

        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getActivity());
        recyclerView_list.setLayoutManager(mLayoutManager1);
        recyclerView_list.setItemAnimator(new DefaultItemAnimator());
        recyclerView_list.setAdapter(mAdapter_list);

        return view;
    }




}


