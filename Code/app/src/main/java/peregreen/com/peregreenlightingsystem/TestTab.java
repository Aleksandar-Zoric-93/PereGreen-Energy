package peregreen.com.peregreenlightingsystem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hunter on 15-Apr-16.
 */
public class TestTab extends Fragment {

    //Using this as a testing tab.  Will be deleted on completion.

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.add_device,container,false);





        return  view;
    }
}