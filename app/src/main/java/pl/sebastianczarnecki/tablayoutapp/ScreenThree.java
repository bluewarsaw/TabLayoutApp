package pl.sebastianczarnecki.tablayoutapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ScreenThree extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflanter, ViewGroup container, Bundle savedInstanceState){
        View view = inflanter.inflate(R.layout.screen_two, container, false);
        return view;
    }
}
