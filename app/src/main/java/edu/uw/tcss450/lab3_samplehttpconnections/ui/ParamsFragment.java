package edu.uw.tcss450.lab3_samplehttpconnections.ui;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.lab3_samplehttpconnections.R;
import edu.uw.tcss450.lab3_samplehttpconnections.databinding.ParamsFragmentBinding;

public class ParamsFragment extends Fragment {

    private ParamsFragmentBinding binding;

    private ParamsViewModel mViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(getActivity()).get(ParamsViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ParamsFragmentBinding.inflate(inflater);
        return binding.getRoot();
    }

}
