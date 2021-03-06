package com.example.peethr.pogoda;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.Title_error)
                .setMessage(R.string.Title_message)
                .setPositiveButton(R.string.Error_ok, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
