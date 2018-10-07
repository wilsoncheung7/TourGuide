package com.wewsun.tourguide;

        import android.app.Activity;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {
    public TourAdapter(Activity context, ArrayList<Tour>Tour){
        super(context,0,Tour);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Tour currentTourAdapter = getItem(position);
        TextView cityView = listItemView.findViewById(R.id.city_text_view);
        cityView.setText(currentTourAdapter.getCity());
        TextView locationView = listItemView.findViewById(R.id.location_text_view);
        locationView.setText(currentTourAdapter.getLocation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTourAdapter.getImageResourceId());
        return listItemView;
    }
}
