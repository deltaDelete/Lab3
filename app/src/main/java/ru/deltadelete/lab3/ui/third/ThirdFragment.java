package ru.deltadelete.lab3.ui.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Locale;

import ru.deltadelete.lab3.Town;
import ru.deltadelete.lab3.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        initList(binding.list3);

        return root;
    }

    private void initList(ListView list) {
        Faker faker = new Faker(new Locale("ru"));
        Town[] towns = new Town[50];
        for (int i = 0; i < towns.length; i++) {
            towns[i] = Town.fromFaker(faker);
        }
        var adapter = new TownAdapter(getContext(), List.of(towns));
        list.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}