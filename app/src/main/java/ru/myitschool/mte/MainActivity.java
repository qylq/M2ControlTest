package ru.myitschool.mte;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.myitschool.mte.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private Button plus;
    private Button minus;
    private TextView result;

    private EditText first;
    private EditText second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        plus = findViewById(R.id.plus_sign);
        minus = findViewById(R.id.minus_sign);
        result = findViewById(R.id.result_text);

        first = findViewById(R.id.first_number);
        second = findViewById(R.id.second_number);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int firstNum = Integer.parseInt(first.getText().toString());
                    int secondNum = Integer.parseInt(second.getText().toString());

                    int methodResult = firstNum + secondNum;

                    result.setText(String.valueOf(methodResult));

                } catch (NumberFormatException e) {
                    return;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int firstNum = Integer.parseInt(first.getText().toString());
                    int secondNum = Integer.parseInt(second.getText().toString());

                    int methodResult = firstNum - secondNum;

                    result.setText(String.valueOf(methodResult));

                } catch (NumberFormatException e) {
                    return;
                }
            }
        });
    }
}
