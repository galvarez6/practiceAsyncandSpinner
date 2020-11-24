package edu.utep.cs.cs4330.progressdialogpractice;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoadingDialog {

    private Activity activity;
    private AlertDialog dialog;
    private AnimationDrawable animation;
    private ImageView gif;

    LoadingDialog(Activity myActivity){
        activity = myActivity;
    }

    void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.spinner_dialog, (ViewGroup) activity.findViewById(R.id.layout_root));
        gif = layout.findViewById(R.id.imageView);
        Glide.with(layout).load(R.drawable.pokegif).into(gif);


        builder.setView(layout);
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();

    }

    void dismissDialog(){
        //animation.stop();
        dialog.dismiss();
    }
    
}
