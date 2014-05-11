package com.tung.android.bootstrap.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tung.android.bootstrap.R;
import com.tung.android.bootstrap.adapter.PlaceSlidesFragmentAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by tung1123 on 5/1/2014.
 */
public class ListCardFragment extends Fragment {

    PlaceSlidesFragmentAdapter mAdapter;
   // TestFragmentAdapter mAdapter;

    @InjectView(R.id.indicatorImage)
    protected CirclePageIndicator indicator;

    @InjectView(R.id.pagerimage)
    protected ViewPager pager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_card, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Views.inject(this, getView());
        mAdapter = new PlaceSlidesFragmentAdapter(getActivity().getSupportFragmentManager());
        pager.setAdapter(mAdapter);
        indicator.setViewPager(pager);
        pager.setCurrentItem(1);

    }

}