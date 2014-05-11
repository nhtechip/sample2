package com.tung.android.bootstrap.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tung.android.bootstrap.R;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by tung1123 on 5/7/2014.
 */
public class PlaceSlideFragment extends Fragment {

    int imageResourceId;
    @InjectView(R.id.introsrc)
    protected ImageView imgView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_image_intro, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle args = getArguments();
        if (args  != null && args.containsKey("imageResourceId"))
            imageResourceId= args.getInt("imageResourceId");
        Views.inject(this, getView());

        imgView.setImageResource(imageResourceId);
       // imgView.setMinimumWidth(100);
    }

}