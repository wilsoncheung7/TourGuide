package com.wewsun.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        final ArrayList<Tour> tour = new ArrayList<>();
        tour.add(new Tour(R.string.shangri_la,R.string.shangri_la_address,R.drawable.shangri_la));
        tour.add(new Tour(R.string.hotel_icon,R.string.hotel_icon_address,R.drawable.hotel_icon));
        TourAdapter adapter = new TourAdapter(getActivity(), tour);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
