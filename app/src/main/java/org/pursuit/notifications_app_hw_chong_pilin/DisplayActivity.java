package org.pursuit.notifications_app_hw_chong_pilin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        bigImage = findViewById(R.id.display_bigImage);
        itemTitle = findViewById(R.id.item_title);
        itemDescript = findViewById(R.id.item_description);
        itemPrice = findViewById(R.id.item_price);

        sendNotification = findViewById(R.id.notification_button);
    }
}
