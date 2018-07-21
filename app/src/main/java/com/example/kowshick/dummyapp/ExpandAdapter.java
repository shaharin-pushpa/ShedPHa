package com.example.kowshick.dummyapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpandAdapter extends BaseExpandableListAdapter {
    Context contex;
    String[] groupNanes={"English"};
    //,"বাংলা"
    String[][] childNames={{"About Us","Product List","Contact Us"}};
    //,{"পন্য তালিকা","যোগাযোগ","অফিস"}

    public ExpandAdapter(Context contex) {
        this.contex = contex;
    }

    @Override
    public int getGroupCount() {
        return groupNanes.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childNames[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupNanes[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childNames[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView textView=new TextView(contex);
        textView.setText(groupNanes[groupPosition]);
        textView.setPadding(100,0,0,0);
        textView.setTextSize(20);
        textView.setTextColor(Color.BLUE);
        return textView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final TextView textView=new TextView(contex);
        textView.setText(childNames[groupPosition][childPosition]);
        textView.setPadding(100,0,0,0);
        textView.setTextSize(20);
        textView.setTextColor(Color.BLACK);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=textView.getText().toString();
                if(text.equals("Product List")){
                    Intent intent=new Intent(contex,MainActivity.class);
                    contex.startActivity(intent);
                }
                else if(text.equals("Contact Us")){
                    showDialog();
                }
                else if(text.equals("About Us")){
                    Intent intent=new Intent(contex,AboutusActivity.class);
                    contex.startActivity(intent);
                }
            }
        });
        return textView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    private void showDialog(){
        LayoutInflater li = LayoutInflater.from(contex);
        View promptsView = li.inflate(R.layout.contact_row, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                contex);

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
