package ru.deltadelete.lab3.ui.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;

import ru.deltadelete.lab3.R;
import ru.deltadelete.lab3.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        initList(binding.list2);

        return root;
    }

    private void initList(ListView list2) {
        var ctx =  getContext();
        var items = ctx.getResources().getStringArray(R.array.first_list);
        // или
        // var items = new String[] {
        //      "1",
        //      "2",
        //      "3"
        // };
        var adapter = new ArrayAdapter(ctx, android.R.layout.simple_list_item_1, items);

        list2.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}