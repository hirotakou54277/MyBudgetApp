package com.example.mybudgetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class LedgerActivity extends AppCompatActivity {

    private List<Transaction> transactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ledger);

        TableLayout ledgerTable = findViewById(R.id.ledgerTable);
        TextView totalSavingsTextView = findViewById(R.id.totalSavingsTextView);

        transactions = new ArrayList<>();
        // サンプルデータの追加
        transactions.add(new Transaction("2024/06/24", 300000, 0));
        transactions.add(new Transaction("2024/06/25", 0, 30000));

        double totalSavings = calculateTotalSavings();
        totalSavingsTextView.setText(getString(R.string.total_savings, totalSavings));
        displayTransactions(ledgerTable);
    }

    private double calculateTotalSavings() {
        double total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.income - transaction.expense;
        }
        return total;
    }

    private void displayTransactions(TableLayout ledgerTable) {
        for (Transaction transaction : transactions) {
            TableRow row = new TableRow(this);
            TextView dateTextView = new TextView(this);
            dateTextView.setText(transaction.date);
            row.addView(dateTextView);

            TextView incomeTextView = new TextView(this);
            incomeTextView.setText(transaction.income > 0 ? "¥" + transaction.income : "");
            row.addView(incomeTextView);

            TextView expenseTextView = new TextView(this);
            expenseTextView.setText(transaction.expense > 0 ? "¥" + transaction.expense : "");
            row.addView(expenseTextView);

            ledgerTable.addView(row);
        }
    }

    public void editTransaction(View view) {
        Toast.makeText(this, "編集ボタンが押されました", Toast.LENGTH_SHORT).show();
        // 編集ロジックを追加
    }

    public void deleteTransaction(View view) {
        Toast.makeText(this, "削除ボタンが押されました", Toast.LENGTH_SHORT).show();
        // 削除ロジックを追加
    }

    public void exportPdf(View view) {
        Toast.makeText(this, "PDF出力ボタンが押されました", Toast.LENGTH_SHORT).show();
        // PDF出力ロジックを追加
    }

    private static class Transaction {
        String date;
        double income;
        double expense;

        Transaction(String date, double income, double expense) {
            this.date = date;
            this.income = income;
            this.expense = expense;
        }
    }
}


