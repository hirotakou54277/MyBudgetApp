package com.example.mybudgetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ExpenseActivity extends AppCompatActivity {

    private EditText expenseDescription;
    private EditText expenseAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);

        expenseDescription = findViewById(R.id.expense_description);
        expenseAmount = findViewById(R.id.expense_amount);
    }

    public void addExpense(View view) {
        String description = expenseDescription.getText().toString();
        String amount = expenseAmount.getText().toString();

        if (description.isEmpty() || amount.isEmpty()) {
            Toast.makeText(this, "Please enter both description and amount", Toast.LENGTH_SHORT).show();
            return;
        }

        // ここに支出を追加するロジックを実装
        Toast.makeText(this, "Expense added: " + description + ", Amount: " + amount, Toast.LENGTH_SHORT).show();

        // 入力フィールドをクリア
        expenseDescription.setText("");
        expenseAmount.setText("");
    }
}
