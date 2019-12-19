package com.example.roomdatabase2;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CancelFragment extends DialogFragment {


    public CancelFragment() {
        // Required empty public constructor
    }

    DialogButtonListener2 dialogButtonListener2;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        dialogButtonListener2 = (DialogButtonListener2) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cancel, container, false);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
         super.onCreateDialog(savedInstanceState);


        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage("Are you sure you want to Cancel?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogButtonListener2.listenToDialogButton2("Yes");
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogButtonListener2.listenToDialogButton2("No");
            }
        });
        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }

    interface DialogButtonListener2{
        public void listenToDialogButton2(String str);
    }
}
