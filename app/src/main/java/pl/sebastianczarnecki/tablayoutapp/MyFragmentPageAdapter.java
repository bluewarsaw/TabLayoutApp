package pl.sebastianczarnecki.tablayoutapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    private Context context;

    public MyFragmentPageAdapter(Context context, FragmentManager fm){
        super(fm);
        this.context = context;
    }

@Override
    public Fragment getItem(int position){
        if (position == 0){
            return new ScreenOne();
        } else if (position == 1){
            return new ScreenTwo();
        } else {
            return new ScreenThree();
        }
}

@Override
    public int getCount(){
        return 3;
}

@Override
    public CharSequence getPageTitle(int position){
    if (position == 0){
        return context.getString(R.string.screenOneName);
    } else if (position == 1){
        return context.getString(R.string.screenTwoName);
    } else {
        return context.getString(R.string.screenThreeName);
    }
}

}
