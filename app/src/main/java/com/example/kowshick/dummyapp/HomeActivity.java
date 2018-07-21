package com.example.kowshick.dummyapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView product,contact,regional;
    private ExpandableListView exList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       /* exList=(ExpandableListView) findViewById(R.id.expandList);
        ExpandAdapter adapter=new ExpandAdapter(HomeActivity.this);
        exList.setAdapter(adapter);*/
    }

    public void gotosite(View view) {
        switch (view.getId()){
            case R.id.facebook:
                String furl="https://www.facebook.com/Shed-Pharmaceuticals-Ltd-111660852977578/";
                openWebURL(furl);
                break;
            case R.id.tweet:
                String turl="https://twitter.com/sbjoy79";
                openWebURL(turl);
                break;
            case R.id.google:
                String gurl="https://plus.google.com/communities/101686027947348579279";
                openWebURL(gurl);
                break;
            case R.id.youtube:
                String yurl="https://www.youtube.com/watch?v=3gKSxA8kNMo";
                openWebURL(yurl);
                break;

        }
    }
    public void openWebURL( String inURL ) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(inURL));
        startActivity(intent);
    }

    public void changepage(View view) {
        switch (view.getId()){
            case R.id.about:
                startActivity(new Intent(HomeActivity.this,AboutusActivity.class));
                break;
            case R.id.productlist:
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
                break;
            case R.id.contactus:
                showDialog();
                break;
        }
    }
    private void showDialog(){
        LayoutInflater li = LayoutInflater.from(HomeActivity.this);
        View promptsView = li.inflate(R.layout.contact_row, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                HomeActivity.this);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);
        alertDialogBuilder.setTitle("Contact Us");

        alertDialogBuilder
                .setCancelable(false)
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}
