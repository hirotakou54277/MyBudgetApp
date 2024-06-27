package com.example.mybudgetapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mybudgetapp.utils.BackgroundUtils;

public class IncomeActivity extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    private LinearLayout incomeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        incomeLayout = findViewById(R.id.incomeLayout);
        setBackgroundImage();
    }

    private void setBackgroundImage() {
        Uri backgroundUri = BackgroundUtils.getBackgroundUri(this);
        if (backgroundUri != null) {
            incomeLayout.setBackground(Drawable.createFromPath(backgroundUri.getPath()));
        }
    }
}
