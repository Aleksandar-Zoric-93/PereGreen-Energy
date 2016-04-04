package peregreen.com.peregreenlightingsystem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by Hunter on 29-Mar-16.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                DevicesTab t1 = new DevicesTab();
                return t1;
            case 1:
                RoomsTab t2 = new RoomsTab();
                return t2;
            case 2:
                OptionsTab t3 = new OptionsTab();
                return t3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "DEVICES";
            case 1:

                return "ROOMS";
            case 2:

                return "OPTIONS";
        }
        return null;
    }



}