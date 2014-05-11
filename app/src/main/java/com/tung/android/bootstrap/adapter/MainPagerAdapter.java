

package com.tung.android.bootstrap.adapter;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tung.android.bootstrap.fragment.ListCardFragment;
import com.tung.android.bootstrap.fragment.ListFragmentMain;
import com.tung.android.bootstrap.fragment.ListGridImageFragment;
/*
import com.nhtechip.andriod.myapp.fragment.BaseStaggeredGridFragment;
import com.nhtechip.andriod.myapp.fragment.ChangeValueCardFragment;
import com.nhtechip.andriod.myapp.fragment.CroutonFragment;
import com.nhtechip.andriod.myapp.fragment.GridGplayCABFragment;
import com.nhtechip.andriod.myapp.fragment.ListCardFragment;
import com.nhtechip.andriod.myapp.fragment.ListColorFragment;
import com.nhtechip.andriod.myapp.fragment.ListFragmentMain;
import com.nhtechip.andriod.myapp.fragment.ListGridImageFragment;
import com.nhtechip.andriod.myapp.fragment.ListNewFragment;
import com.nhtechip.andriod.myapp.fragment.ListTabFragment;
*/
/**
 * Pager adapter
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    private final Resources resources;

    /**
     * Create pager adapter
     *
     * @param resources
     * @param fragmentManager
     */
    public MainPagerAdapter(final Resources resources, final FragmentManager fragmentManager) {
        super(fragmentManager);
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(final int position) {
        final Fragment result;
        switch (position) {
            case 0:
                result = new ListCardFragment();
                break;
            case 1:
                result = new ListFragmentMain();
                break;
            case 2:
                result = new ListGridImageFragment();
                break;
            default:
                result = null;
                break;
        }
        if (result != null) {
            result.setArguments(new Bundle()); //TODO do we need this?
        }
        return result;
    }

    @Override
    public CharSequence getPageTitle(final int position) {
        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            case 2:
                return  "Tab 3";
            case 3:
                return  "Tab 4";
            case 4:
                return  "Tab 5";
            case 5:
                return  "Tab 6";
            case 6:
                return  "Tab 7";
            case 7:
                return  "Tab 8";
            case 8:
                return  "Tab 9";
            case 10:
                return  "Tab 10";
            default:
                return null;
        }
    }
}
