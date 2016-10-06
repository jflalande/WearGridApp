package jf.andro.weargridapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;

import java.util.List;

/**
 * Created by jf on 31/01/16.
 */
public class MyFragmentGridPagerAdapter extends FragmentGridPagerAdapter {

    private final Context mContext;
    private List mRows;

    public MyFragmentGridPagerAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        mContext = ctx;
    }

    @Override
    public Fragment getFragment(int i, int j) {

        CardFragment fragment = CardFragment.create("Page " + i + " " + j, "Page", R.drawable.common_google_signin_btn_icon_light);
        return fragment;
    }

    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount(int i) {
        return 5;
    }
}
