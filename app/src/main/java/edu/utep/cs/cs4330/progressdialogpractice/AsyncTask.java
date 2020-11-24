package edu.utep.cs.cs4330.progressdialogpractice;

import android.app.Activity;

public class AsyncTask  extends android.os.AsyncTask<Void,Void,Void> {

    private Activity activity;
    private LoadingDialog loadingDialog;

    public AsyncTask(Activity a){
        this.activity = a;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        loadingDialog = new LoadingDialog(activity);
        loadingDialog.startLoadingDialog();
    }


    @Override
    protected Void doInBackground(Void... voids) {
        try
        {
            Thread.sleep( 5 * 1000 );
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        loadingDialog.dismissDialog();
    }



}
