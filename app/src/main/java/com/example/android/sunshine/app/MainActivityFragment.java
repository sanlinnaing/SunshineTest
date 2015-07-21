package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecast = {
                "Today-Sunny-88/63",
                "Tomorrow-Cloudy-88/55",
                "Wed-Rainy-88/54",
                "Thu-Huminity-65/54",
                "Fri-Sunny-77/77"};
        ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(forecast));
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );
        ListView forecastListView = (ListView) rootView.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(mForecastAdapter);
        return rootView;
    }
}
