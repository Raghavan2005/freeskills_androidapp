/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 06/08/23, 11:28 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.dateset.jobromdata;
import in.softface.raghavan.freeskills.recycleviews.searchapdater;

public class SearchFragment extends Fragment {
    SearchView searchBar;
    searchapdater Searchapdater;
    RecyclerView ev;
    LinearLayout nofound;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_search, container, false);
        searchBar = rootView.findViewById(R.id.searchBar);


        ev = rootView.findViewById(R.id.ray);
        ev.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        nofound = rootView.findViewById(R.id.nofound);
        nofound.setVisibility(View.VISIBLE);
        ev.setVisibility(View.GONE);
        searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (!newText.trim().isEmpty()) {
                    List<String> matchingSuggestions = Onsearchdata(newText);
                    if (!matchingSuggestions.isEmpty()) {
                        Searchapdater = new searchapdater((Activity) getActivity(), getContext(), matchingSuggestions);
                        ev.setAdapter(Searchapdater);
                        nofound.setVisibility(View.GONE);
                        ev.setVisibility(View.VISIBLE);
                    } else {
                        Log.d("Search", "onQueryTextChange: no suggestions");
                        nofound.setVisibility(View.VISIBLE);
                        ev.setVisibility(View.GONE);
                    }
                } else {
                    Log.d("Search", "onQueryTextChange: invalid input");
                    nofound.setVisibility(View.GONE);
                    ev.setVisibility(View.GONE);
                }
                return true;
            }
        });
        return rootView;
    }

    private List<String> Onsearchdata(CharSequence data) {
        List<String> allList = getalllist();
        ArrayList<String> temp = new ArrayList<>();
        conditiondataset cs = new conditiondataset();
        String normalizedData = normalizeString(data.toString());

        List<String> matchingSuggestions = new ArrayList<>(); // Create a list to store matching suggestions

        for (String i : allList) {
            temp = cs.data(i);
            String normalizedTemp = normalizeString(temp.get(0));

            if (normalizedTemp.contains(normalizedData)) {
                matchingSuggestions.add(temp.get(7)); // Add the matching suggestion to the list
            }
        }
        Log.d("search", "Onsearchdata:word " + matchingSuggestions);
        return matchingSuggestions; // Return the list of matching suggestions
    }


    private ArrayList<String> getalllist() {
        ArrayList l1, l2, l3, l4;

        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        l4 = new ArrayList<>();
        jobromdata jd = new jobromdata();
        l1 = jd.data("Frontend Developer");
        l2 = jd.data("Backend Developer");
        l4 = jd.data("Android Developer");
        l3 = new ArrayList<>(l1);
        l3.addAll(l2);
        l3.addAll(l4);
        Set<String> uniqueSet = new HashSet<>(l3);
        List<String> finalList = new ArrayList<>(uniqueSet);
        return new ArrayList<>(finalList);

    }

    private String normalizeString(String input) {
        // Remove spaces, convert to lowercase, remove symbols, and certain extensions
        String normalized = input.replaceAll("\\s", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        normalized = normalized.replaceAll("\\.(?!(mp4|avi|mkv|mov))", ""); // Remove non-allowed extensions

        return normalized;
    }
}
