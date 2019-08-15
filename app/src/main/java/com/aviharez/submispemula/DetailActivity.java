package com.aviharez.submispemula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    private Laptop laptop;

    private ImageView iv_laptop;
    private Button bt_kembali;
    private TextView tv_name, tv_price, tv_processor, tv_gpu, tv_ram, tv_type_mem, tv_type_save, tv_capacity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_laptop = findViewById(R.id.iv_laptop);

        bt_kembali = findViewById(R.id.bt_back);

        tv_name = findViewById(R.id.tv_name);
        tv_price = findViewById(R.id.tv_price);
        tv_processor = findViewById(R.id.tv_processor);
        tv_gpu = findViewById(R.id.tv_gpu);
        tv_ram = findViewById(R.id.tv_ram);
        tv_type_mem = findViewById(R.id.tv_type_mem);
        tv_type_save = findViewById(R.id.tv_type_save);
        tv_capacity = findViewById(R.id.tv_capacity);

        laptop = getIntent().getParcelableExtra("pos");

        Glide.with(this)
                .load(laptop.getPhoto())
                .apply(new RequestOptions().override(350))
                .into(iv_laptop);

        tv_name.setText(laptop.getName());
        tv_price.setText(laptop.getPrice());
        tv_processor.setText(laptop.getProcessor());
        tv_gpu.setText(laptop.getGpu());
        tv_ram.setText(laptop.getRam());
        tv_type_mem.setText(laptop.getMemori());
        tv_type_save.setText(laptop.getTipe());
        tv_capacity.setText(laptop.getHdd());

        bt_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
