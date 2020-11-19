package com.example.androidSamples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class ToastFragment extends Fragment  {



    public ToastFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView=inflater.inflate(R.layout.fragment_toast,container, false);

        final RadioGroup radioGroup = rootView.findViewById(R.id.radioGroup);

        rootView.findViewById(R.id.btnShowToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int toastDuration;
                RadioButton rbShort =  (RadioButton)rootView.findViewById(R.id.rbShort);
                if (rbShort.isChecked())
                    toastDuration = Toast.LENGTH_SHORT;
                else
                    toastDuration = Toast.LENGTH_LONG;

                // Create and show the toast message
                Toast toast = Toast.makeText(rootView.getContext(), "This is a toast", toastDuration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        rootView.findViewById(R.id.btnShowCustomToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int toastDuration;
                RadioButton rbShort = rootView.findViewById(R.id.rbShort);
                if (rbShort.isChecked())
                    toastDuration = Toast.LENGTH_SHORT;
                else
                    toastDuration = Toast.LENGTH_LONG;


                LayoutInflater inflater1 = LayoutInflater.from(getActivity());


                View   layout = inflater1.inflate(R.layout.custom_toast_layout,
                        (ViewGroup)rootView.findViewById(R.id.customToastLayout));
                // Build a toast message that uses the custom layout
                TextView tv = (TextView)layout.findViewById(R.id.textContent);
                tv.setText("This is a custom toast");
                Toast toast = new Toast(getActivity().getApplicationContext());
                toast.setDuration(toastDuration);
                toast.setGravity(Gravity.BOTTOM | Gravity.START, 100, 100);
                toast.setView(layout);
                toast.show();
            }
        });


        return rootView;
    }


}