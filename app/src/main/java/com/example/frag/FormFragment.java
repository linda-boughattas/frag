package com.example.frag;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FormFragment} factory method to
 * create an instance of this fragment.
 */
public class FormFragment extends Fragment {
    private EditText editText1, editText2;
    private FormFragmentListener listener;

    public interface FormFragmentListener {
        void onEquals(double value1, double value2);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            listener = (FormFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement FormFragmentListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the fragment layout
        View view = inflater.inflate(R.layout.fragment_form, container, false);

        editText1 = view.findViewById(R.id.editText1);
        editText2 = view.findViewById(R.id.editText2);
        Button button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double value1 = Double.parseDouble(editText1.getText().toString());
                    double value2 = Double.parseDouble(editText2.getText().toString());
                    listener.onEquals(value1, value2);
                } catch (NumberFormatException e) {
                    editText1.setError("Invalid number");
                    editText2.setError("Invalid number");
                }
            }
        });

        return view;
    }
}
