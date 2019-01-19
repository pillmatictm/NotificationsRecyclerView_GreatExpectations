package org.pursuit.notifications_app_hw_chong_pilin;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    public static final String PRIMARY_CHANNEL_ID = "myNotifs_App";
    private static final int NOTIFICATION_ID = 0;

    private ImageView bigImage;
    private TextView itemTitle;
    private TextView itemDescript;
    private TextView itemPrice;
    private Button sendNotification;


    private NotificationManager notificationManager;
    private NotificationManagerCompat manager;
    private PendingIntent pendingIntent;

    private SharedPreferences sharedPreferences;
    private String sharedPrefs = "org.pursuit.notifications_app_hw_chong_pilin"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        findViews();

        bigImage.setImageResource(getIntent().getIntExtra("image_id", 0));
        itemTitle.setText(getIntent().getStringExtra("item_titles"));
        itemDescript.setText(getIntent().getStringExtra("item_descripts"));
        itemPrice.setText("Approx: $" + getIntent().getStringExtra("item_prices"));

        manager = NotificationManagerCompat.from(this);
        createNotificationChannel();

        Intent notificationIntent = new Intent(this, MainActivity.class);
        pendingIntent = PendingIntent.getActivity(this, NOTIFICATION_ID, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        sharedPreferences = getSharedPreferences(sharedPrefs, MODE_PRIVATE);

        sendNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotification();
            }
        });
    }

    private void findViews() {
        bigImage = findViewById(R.id.display_bigImage);
        itemTitle = findViewById(R.id.item_title);
        itemDescript = findViewById(R.id.item_description);
        itemPrice = findViewById(R.id.item_price);
        sendNotification = findViewById(R.id.notification_button);
    }

    private NotificationCompat.Builder getNotificationBuilder() {
        NotificationCompat.Builder build = new NotificationCompat.Builder(this, PRIMARY_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notification_icon)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setContentTitle("loreum ipsum")
                .setContentText("even more loreum ipsum")
                .setPriority(Notification.PRIORITY_HIGH);
        return build;

    }

    public void createNotificationChannel() {
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID,
                    "Buy_Me Notification", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.BLUE);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Schedule Purchase");
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationBuilder();
        notificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }
}
