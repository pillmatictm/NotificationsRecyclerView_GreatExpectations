package org.pursuit.notifications_app_hw_chong_pilin.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.notifications_app_hw_chong_pilin.DisplayActivity;
import org.pursuit.notifications_app_hw_chong_pilin.R;

public class MyItemsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
   ImageView imageView;
   TextView itemTitle;
   int[] images;
   String[] itemNames;
   String[] itemDescripts;
   String[] itemPrices;

    public MyItemsViewHolder(@NonNull View itemView, int[] images, String[] itemNames, String[] itemDescripts, String[] itemPrices) {
        super(itemView);
        this.images = images;
        this.itemNames = itemNames;
        this.itemDescripts = itemDescripts;
        this.itemPrices =  itemPrices;

        imageView = itemView.findViewById(R.id.image_View);
        itemTitle = itemView.findViewById(R.id.title_textView);

       itemView.findViewById(R.id.recyclerView_tiles).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), DisplayActivity.class);
        intent.putExtra("image_id", images[getAdapterPosition()]);
        intent.putExtra("item_titles", itemNames[getAdapterPosition()]);
        intent.putExtra("item_descripts" , itemDescripts[getAdapterPosition()]);
        intent.putExtra("item_prices", itemPrices[getAdapterPosition()]);
        v.getContext().startActivity(intent);
    }

}
