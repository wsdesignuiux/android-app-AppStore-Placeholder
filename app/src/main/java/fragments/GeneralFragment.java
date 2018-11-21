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

import Adapter.RecycleAdapter_General;
import ModelClass.GeneralModelClass;
import design.ws.com.appstore.R;


public class GeneralFragment extends Fragment {



    private View view;


    private ArrayList<GeneralModelClass> generalModelClasses;

    private RecyclerView recyclerView;
    private RecycleAdapter_General mAdapter;

    private Integer image[] = {R.drawable.ic_update,R.drawable.ic_download,R.drawable.ic_delete,R.drawable.ic_help,R.drawable.ic_setting};
    private String title[] = {"Application Update","Download Managment","Uninstall app","Help and Feedbak","Settings"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_general, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);



        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        generalModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            GeneralModelClass beanClassForRecyclerView_contacts = new GeneralModelClass(image[i],title[i]);

            generalModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapter_General(getActivity(),generalModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        return view;



    }

}





