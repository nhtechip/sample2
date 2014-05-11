package com.tung.android.bootstrap.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tung.android.bootstrap.R;
import com.tung.android.bootstrap.adapter.LazyAdapter;
import com.tung.android.bootstrap.model.RowItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by tung1123 on 5/1/2014.
 */
public class ListFragmentMain extends Fragment {

    private List<RowItem> rowItems;
    private static Integer[] images = {
            R.drawable.red,
            R.drawable.red,
            R.drawable.red,
            R.drawable.red,
            R.drawable.red,
            R.drawable.red,
            R.drawable.red,
            R.drawable.red
    };

    @InjectView(R.id.myList)
    protected ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_card_manual, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Views.inject(this, getView());
        rowItems = new ArrayList<RowItem>();

        String[] titles = {"Movie1","Movie2","Movie3","Movie4","Movie5","Movie6","Movie7","Movie8"};
        String[] descriptions = {"First Movie","Second movie","Third Movie","Fourth Movie","Fifth Movie",
                "Sixth Movie","Seventh Movie","Eighth Movie"};
        //Populate the List
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        // Set the adapter on the ListView
        LazyAdapter adapter = new LazyAdapter(getActivity().getApplicationContext(), R.layout.list_row, rowItems);
        lv.setAdapter(adapter);

        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }

}