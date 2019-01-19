package org.pursuit.notifications_app_hw_chong_pilin.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.notifications_app_hw_chong_pilin.R;

public class MyItemsAdapter extends RecyclerView.Adapter<MyItemsViewHolder> {
    private int[] images;
    private String[] itemNameArray;
    private String[] itemDescriptArray;
    private String[] itemPriceArray;

    public MyItemsAdapter(int[] images, String[] itemNameArray, String[] itemDescriptArray, String[] itemPriceArray) {
        this.images = images;
        this.itemNameArray = itemNameArray;
        this.itemDescriptArray = itemDescriptArray;
        this.itemPriceArray = itemPriceArray;
    }

    @NonNull
    @Override
    public MyItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_viewholder, viewGroup, false);
        return new MyItemsViewHolder(view, images, itemNameArray, itemDescriptArray, itemPriceArray);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyItemsViewHolder myItemsViewHolder, final int i) {
        int image_id = images[i];
        String itemName = itemNameArray[i];

        myItemsViewHolder.imageView.setImageResource(image_id);
        myItemsViewHolder.itemTitle.setText(itemName);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}