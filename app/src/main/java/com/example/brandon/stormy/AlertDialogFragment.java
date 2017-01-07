package com.example.brandon.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment{

    /* This method will be called when we create the dialog from the desired activity.
    Similar to the onCreate method for activities.
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        // Configuring the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_button_text, null);

        // Creating the AlertDialog using the builder's create() method, then return it
        AlertDialog dialog = builder.create();
            return dialog;
    }
}