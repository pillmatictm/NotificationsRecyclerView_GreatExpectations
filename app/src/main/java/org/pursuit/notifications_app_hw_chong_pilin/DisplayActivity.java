package org.pursuit.notifications_app_hw_chong_pilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private ImageView bigImage;
    private TextView itemTitle;
    private TextView itemDescript;
    private TextView itemPrice;
    private Button sendNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        findViews();

        bigImage.setImageResource(getIntent().getIntExtra("image_id", 0));
        itemTitle.setText(getIntent().getStringExtra("item_titles"));


        String[] itemDescription = getResources().getStringArray(R.array.itemNameArray);
        itemDescript.setText
                (itemDescription["the same index of the pic that is being inflated"]);

        String[] itemApproxPrice = getResources().getStringArray(R.array.itemPriceArray);
        itemPrice.setText
                (itemApproxPrice["the same index of the pic that is being inflated"]);




//        sendNotification.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                /*
//                - onClick of the "Schedule" button will send a Notification to user in Phones's toolbar
//                - SavedPreferences saves the click action, so if clicked again but notification was already received,
//                Toast "Already Scheduled"
//                 */
//
//            }
//        });
    }


    private void findViews() {
        bigImage = findViewById(R.id.display_bigImage);
        itemTitle = findViewById(R.id.item_title);
        itemDescript = findViewById(R.id.item_description);
        itemPrice = findViewById(R.id.item_price);
        sendNotification = findViewById(R.id.notification_button);
    }
}
