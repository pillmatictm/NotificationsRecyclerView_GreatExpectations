package org.pursuit.notifications_app_hw_chong_pilin.recyclerview;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.notifications_app_hw_chong_pilin.DisplayActivity;
import org.pursuit.notifications_app_hw_chong_pilin.R;

public class MyItemsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
   ImageView imageView;
   TextView itemTitle;

    public MyItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_View);
        itemTitle = itemView.findViewById(R.id.title_textView);
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent(v.getContext(), DisplayActivity.class);
////        intent.putExtra("my_item", //WHAT AM I PUTTING EXTRA?? );
//        itemView.getContext().startActivity(intent);


    }
}
