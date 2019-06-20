package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class WordAdapter extends ArrayAdapter<Word> {
    int colorId;
    public WordAdapter(Context context, ArrayList<Word> users,int colorId) {

        super(context, 0, users);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentItemView = getItem(position);

        TextView arabicWord = (TextView) listItemView.findViewById(R.id.arabic_text_view);
        arabicWord.setText(currentItemView.getArabic());

        TextView englishWord =(TextView) listItemView.findViewById(R.id.defualt_text_view);
        englishWord.setText(currentItemView.getEnglish());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.list);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        ImageView imageView = (ImageView)listItemView.findViewById(R.id.mImage);

        if(currentItemView.hasImage()){
            imageView.setImageResource(currentItemView.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }





        return listItemView;

    }
}
