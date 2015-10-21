package com.example.david.spotify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by David on 10/20/15.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return 4;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            //imageView.setLayoutParams(new GridView.LayoutParams(120,120));
            //imageView.setLayoutParams(mImageViewLayoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_START);

            //imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        //imageView.setImageResource(mThumbIds[position]);

        Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.with(mContext).load("http://i.imgur.com/DvpvklR.png").into(imageView);

        return imageView;
    }

/*
    public void setNumColumns(int numColumns) {
        this.mNumColumns = numColumns;
    }

    public void setItemHeight(int itemHeight) {
        if (itemHeight == this.mItemHeight) {
            return;
        }
        this.mItemHeight = itemHeight;
        mImageViewLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, mItemHeight);
        notifyDataSetChanged();

    }

    public int getNumColums() {
        return this.mNumColumns;
    }

    */
}
