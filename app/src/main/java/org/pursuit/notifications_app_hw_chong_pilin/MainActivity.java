package org.pursuit.notifications_app_hw_chong_pilin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.pursuit.notifications_app_hw_chong_pilin.recyclerview.MyItemsAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private int[] images = { R.drawable.iphone_xs, R.drawable.diamond_rolex, R.drawable.cartier_shades, R.drawable.black_balenciagas, R.drawable.bape_hoodie,  R.drawable.brows, R.drawable.pic_veneers,
            R.drawable.custom11_blue, R.drawable.ferret, R.drawable.canadagoose_camo, R.drawable.apple_watch, R.drawable.mydream_mercedes, R.drawable.ipad_pro, R.drawable.applewatch_lvband, R.drawable.lashes,
            R.drawable.gold_platforms, R.drawable.louisvuitton_bag, R.drawable.nails, R.drawable.senheiser_headphones, R.drawable.snakie, R.drawable.canadagoose_blue,};

    private String[] itemName = getResources().getStringArray(R.array.itemNameArray);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MyItemsAdapter(images, itemName));
    }
}
