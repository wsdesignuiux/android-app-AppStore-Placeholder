package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragments.TopAppsFragment;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class
CategoryRankAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public CategoryRankAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TopAppsFragment tab1 = new TopAppsFragment();
                return tab1;

            case 1:
                TopAppsFragment tab2 = new TopAppsFragment();
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