package com.example.mybudgetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BalanceActivity extends AppCompatActivity {

    private EditText currentBalanceInput;
    private TextView dailyBalance, weeklyBalance, monthlyBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        currentBalanceInput = findViewById(R.id.currentBalanceInput);
        dailyBalance = findViewById(R.id.dailyBalance);
        weeklyBalance = findViewById(R.id.weeklyBalance);
        monthlyBalance = findViewById(R.id.monthlyBalance);
    }

    public void updateBalance(View view) {
        String balanceString = currentBalanceInput.getText().toString();

        if (balanceString.isEmpty()) {
            Toast.makeText(this, "Please enter the current balance", Toast.LENGTH_SHORT).show();
            return;
        }

        double currentBalance = Double.parseDouble(balanceString);

        // AI予測を使用して毎日、毎週、毎月の使える金額を計算
        double dailyAmount = currentBalance / 30;
        double weeklyAmount = currentBalance / 4;
        double monthlyAmount = currentBalance;

        dailyBalance.setText(String.format("日: ¥%.2f", dailyAmount));
        weeklyBalance.setText(String.format("週: ¥%.2f", weeklyAmount));
        monthlyBalance.setText(String.format("月: ¥%.2f", monthlyAmount));

        Toast.makeText(this, "Balance updated", Toast.LENGTH_SHORT).show();
    }
}

