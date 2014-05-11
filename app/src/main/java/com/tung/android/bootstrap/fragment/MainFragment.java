package com.tung.android.bootstrap.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.tung.android.bootstrap.R;
import com.tung.android.bootstrap.adapter.MainPagerAdapter;

import butterknife.InjectView;
import butterknife.Views;

//import com.viewpagerindicator.TitlePageIndicator;

/**
 * Fragment which houses the View pager.
 */
public class MainFragment extends Fragment {

    @InjectView(R.id.tpi_header)
    protected PagerSlidingTabStrip indicator;

    @InjectView(R.id.vp_pages)
    protected ViewPager pager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_carousel, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Views.inject(this, getView());
        pager.setAdapter(new MainPagerAdapter(getResources(), getChildFragmentManager()));
        indicator.setViewPager(pager);
        pager.setCurrentItem(0);

    }
}