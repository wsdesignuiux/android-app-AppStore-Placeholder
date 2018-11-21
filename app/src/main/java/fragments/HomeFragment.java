package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

import Adapter.RecycleAdapter_GridHome;
import Adapter.RecycleAdapter_ListHome;
import ModelClass.HomeGridModelClass;
import ModelClass.HomeListModelClass;
import design.ws.com.appstore.R;


public class HomeFragment extends Fragment {



    private View view;

    private LinearLayout linearLayout;

    private ArrayList<HomeGridModelClass> homeGridModelClasses;

    private RecyclerView recyclerView;
    private RecycleAdapter_GridHome mAdapter;

    private Integer image[] = {R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,
            R.drawable.square_img, R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,};
    private String name[] = {"Instagram","Entertainment","Racing","Music Player","Whatsapp","Candy Crush","Subway Surfer","Facebook"};



    private ArrayList<HomeListModelClass> homeListModelClasses;

    private RecyclerView recyclerView_list;
    private RecycleAdapter_ListHome mAdapter_list;

    private Integer image1[] = {R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,R.drawable.square_img,};
    private String title1[] = {"Facebook","Instagram","Racing","Music"};
    private String view1[] = {"23.3M","35.5M","12.5M","45.4M"};
    private String install[] = {"Installed 8.5m time(s)","Installed 7.5m time(s)","Installed 15m time(s)","Installed 5m time(s)"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        linearLayout = (LinearLayout)view.findViewById(R.id.main);

        /*Recyclerview GridLayoutmanager code is here*/


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        homeGridModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            HomeGridModelClass beanClassForRecyclerView_contacts = new HomeGridModelClass(image[i],name[i]);

            homeGridModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapter_GridHome(getActivity(),homeGridModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),4);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


         /*Recyclerview Listview code is here*/


        recyclerView_list = (RecyclerView) view.findViewById(R.id.recyclerview_list);
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
