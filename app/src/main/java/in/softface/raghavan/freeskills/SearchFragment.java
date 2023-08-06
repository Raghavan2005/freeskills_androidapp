package in.softface.raghavan.freeskills;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.dateset.jobromdata;
import in.softface.raghavan.freeskills.recycleviews.searchapdater;

public class SearchFragment extends Fragment {
    MaterialSearchBar searchBar;
    searchapdater Searchapdater;
    RecyclerView ev;
    LinearLayout nofound;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_search, container, false);
        searchBar = (MaterialSearchBar) rootView.findViewById(R.id.searchBar);
        searchBar.clearSuggestions();
        searchBar.setSpeechMode(true);

        ev = rootView.findViewById(R.id.ray);
        ev.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        nofound = rootView.findViewById(R.id.nofound);
        nofound.setVisibility(View.VISIBLE);
        ev.setVisibility(View.GONE);
        searchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {
                // Handle search state changes
                Log.d("Search", "onSearchConfirmed: " + enabled);
                ev.setVisibility(View.VISIBLE);
                nofound.setVisibility(View.GONE);
            }


            @Override
            public void onSearchConfirmed(CharSequence text) {
                if (!text.toString().trim().isEmpty()) {
                    List<String> matchingSuggestions = Onsearchdata(text);
                    if (!matchingSuggestions.isEmpty()) {
                        Searchapdater = new searchapdater((Activity) getActivity(), getContext(), matchingSuggestions);
                        ev.setAdapter(Searchapdater);
                    } else {
                        Log.d("Search", "onSearchConfirmed:no suggestions");
                        nofound.setVisibility(View.VISIBLE);
                        ev.setVisibility(View.GONE);
                    }
                } else {
                    Log.d("Search", "onSearchConfirmed:invalid input");
                }

            }

            @Override
            public void onButtonClicked(int buttonCode) {
                // Handle search bar button clicks (e.g., speech button)

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
        ArrayList l1, l2, l3;

        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        jobromdata jd = new jobromdata();
        l1 = jd.data("Frontend Developer");
        l2 = jd.data("Backend Developer");
        l3 = new ArrayList<>(l1);
        l3.addAll(l2);
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
