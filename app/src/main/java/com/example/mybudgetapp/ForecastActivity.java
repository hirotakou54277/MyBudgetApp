package com.example.mybudgetapp;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.tensorflow.lite.Interpreter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class ForecastActivity extends AppCompatActivity {

    private double dailySavingsRate;
    private TextView monthlySavingsTextView;
    private TextView weeklySavingsTextView;
    private TextView dailySavingsTextView;
    private TextView adjustedSavingsTextView;
    private TextView adjustedMonthlySavingsTextView;
    private TextView adjustedWeeklySavingsTextView;
    private TextView adjustedDailySavingsTextView;
    private Interpreter tflite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        monthlySavingsTextView = findViewById(R.id.monthlySavings);
        weeklySavingsTextView = findViewById(R.id.weeklySavings);
        dailySavingsTextView = findViewById(R.id.dailySavings);
        adjustedSavingsTextView = findViewById(R.id.adjustedSavings);
        adjustedMonthlySavingsTextView = findViewById(R.id.adjustedMonthlySavings);
        adjustedWeeklySavingsTextView = findViewById(R.id.adjustedWeeklySavings);
        adjustedDailySavingsTextView = findViewById(R.id.adjustedDailySavings);

        try {
            tflite = new Interpreter(loadModelFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // AI予測の計算ロジック
        double[] input = {300000, 50000, 100000, 100000}; // 給料、副収入、ボーナス、仮の支出合計
        float[] output = new float[1];
        tflite.run(input, output);

        double monthlySavings = output[0];
        double weeklySavings = monthlySavings / 4;
        dailySavingsRate = monthlySavings / 30;

        monthlySavingsTextView.setText("毎月使える金額: ¥" + String.format("%.2f", monthlySavings));
        weeklySavingsTextView.setText("毎週使える金額: ¥" + String.format("%.2f", weeklySavings));
        dailySavingsTextView.setText("毎日使える金額: ¥" + String.format("%.2f", dailySavingsRate));

        // 調整後の使える金額の計算
        double totalIncome = 300000 + 50000 + 100000; // 仮の収入合計
        double totalExpense = 100000; // 仮の支出合計
        double totalBalance = 100000; // 仮の残金
        double operationalAmount = totalIncome - (totalExpense + totalBalance);
        double operationalPercentage = (monthlySavings / totalBalance) * 100;

        adjustedSavingsTextView.setText("運用額: ¥" + String.format("%.2f", operationalAmount) + " (" + String.format("%.2f", operationalPercentage) + "%)");
        adjustedMonthlySavingsTextView.setText("毎月使える金額: ¥" + String.format("%.2f", monthlySavings));
        adjustedWeeklySavingsTextView.setText("毎週使える金額: ¥" + String.format("%.2f", weeklySavings));
        adjustedDailySavingsTextView.setText("毎日使える金額: ¥" + String.format("%.2f", dailySavingsRate));
    }

    private MappedByteBuffer loadModelFile() throws IOException {
        AssetFileDescriptor fileDescriptor = this.getAssets().openFd("ai_model.tflite");
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    public double getDailySavingsRate() {
        return dailySavingsRate;
    }
}



