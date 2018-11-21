package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragments.SelectionFragment;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class
CategoryAppsAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public CategoryAppsAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                SelectionFragment tab1 = new SelectionFragment();
                return tab1;

            case 1:
                SelectionFragment tab2 = new SelectionFragment();
                return tab2;

                default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}