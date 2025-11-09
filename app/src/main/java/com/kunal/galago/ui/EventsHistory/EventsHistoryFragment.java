package com.kunal.galago.ui.EventsHistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kunal.galago.databinding.FragmentEventsHistoryBinding;

public class EventsHistoryFragment extends Fragment {

private FragmentEventsHistoryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        EventsHistoryViewModel eventsHistoryViewModel =
                new ViewModelProvider(this).get(EventsHistoryViewModel.class);

    binding = FragmentEventsHistoryBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        eventsHistoryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}