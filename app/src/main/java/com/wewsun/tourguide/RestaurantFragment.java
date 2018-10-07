package com.wewsun.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        final ArrayList<Tour> tour = new ArrayList<>();
        TourAdapter adapter = new TourAdapter(getActivity(), tour);
        tour.add(new Tour(R.string.hexa,R.string.hexa_address,R.drawable.hexa));
        tour.add(new Tour(R.string.kaifong,R.string.kaifong_address,R.drawable.cafe));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
