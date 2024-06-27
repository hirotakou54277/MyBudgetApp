package com.example.mybudgetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import java.util.Date;

public class SavingsActivity extends AppCompatActivity {
    private LinearLayout savingsLayout;
    private EditText goalAmountEditText;
    private DatePicker goalDatePicker;
    private TextView forecastTextView;
    private double dailySavingsRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);

        savingsLayout = findViewById(R.id.savingsLayout);
        goalAmountEditText = findViewById(R.id.goalAmountEditText);
        goalDatePicker = findViewById(R.id.goalDatePicker);
        forecastTextView = findViewById(R.id.forecastTextView);

        // AI予測から日割り平均の貯金額を取得（仮の値を使用）
        dailySavingsRate = getDailySavingsRateFromForecast();
    }

    public void saveGoal(View view) {
        String goalAmountStr = goalAmountEditText.getText().toString();
        if (goalAmountStr.isEmpty()) {
            Toast.makeText(this, "目標金額を入力してください", Toast.LENGTH_SHORT).show();
            return;
        }

        double goalAmount = Double.parseDouble(goalAmountStr);

        // 現在の日付と目標日を取得
        Calendar currentDate = Calendar.getInstance();
        Calendar goalDate = Calendar.getInstance();
        goalDate.set(goalDatePicker.getYear(), goalDatePicker.getMonth(), goalDatePicker.getDayOfMonth());

        // 目標日までの日数を計算
        long diffInMillis = goalDate.getTimeInMillis() - currentDate.getTimeInMillis();
        long daysUntilGoal = diffInMillis / (1000 * 60 * 60 * 24);

        // 日割り平均の貯金額で達成見込みを計算
        double totalSavingsNeeded = goalAmount - dailySavingsRate * daysUntilGoal;
        if (totalSavingsNeeded > 0) {
            forecastTextView.setText("AI予測: 達成見込みなし");
        } else {
            forecastTextView.setText("AI予測: " + goalDate.getTime().toString() + "までに達成見込み");
        }
    }

    private double getDailySavingsRateFromForecast() {
        // 仮の値を返す。実際にはAI予測モデルから取得する。
        return 5000;
    }
}


