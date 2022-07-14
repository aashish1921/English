package com.example.sakshichauhan;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

public class CustomFilter  extends Filter {

    List<ModelClass> filterList;
    modelAdapter adapter;
    public CustomFilter(List<ModelClass> filterList, modelAdapter adapter) {
        this.filterList =  filterList;
        this.adapter = adapter;
    }


    @Override
    protected FilterResults performFiltering(CharSequence constraint) {

        FilterResults results = new FilterResults();
        if (constraint != null && constraint.length() >0){
            constraint = constraint.toString().toUpperCase();

            ArrayList<ModelClass> filterModels = new ArrayList<>();

            for (int i=0; i< filterList.size(); i++){
                if (filterList.get(i).getTitle().toUpperCase().contains(constraint)){

                    filterModels.add(filterList.get(i));

                }
            }

            results.count=filterModels.size();
            results.values = filterModels;

        }

        else  {
            results.count = filterList.size();
            results.values= filterList;

        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.itemlist =(ArrayList<ModelClass>)results.values;
        adapter.notifyDataSetChanged();

    }

}
