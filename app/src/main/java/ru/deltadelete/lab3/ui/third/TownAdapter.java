package ru.deltadelete.lab3.ui.third;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import java.util.List;

import ru.deltadelete.lab3.R;
import ru.deltadelete.lab3.Town;
import ru.deltadelete.lab3.databinding.TownItemBinding;

public class TownAdapter extends ArrayAdapter<Town> {

    private LayoutInflater inflater;
    @LayoutRes
    private int layout;
    private List<Town> items;

    public TownAdapter(Context context, List<Town> items) {
        super(context, R.layout.town_item, items);
        this.items = items;
        this.layout = R.layout.town_item;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if (convertView == null)
            view = inflater.inflate(this.layout, parent, false);
        else
            view = convertView;

        TextView townName = view.findViewById(R.id.townName);
        TextView townCountry = view.findViewById(R.id.townCountry);

        var town = items.get(position);

        townName.setText(town.getName());
        townCountry.setText(town.getCountry());

        return view;
    }
}
