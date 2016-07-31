package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double overallScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public double answerForQ1() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.other_check_box);
        if (checkBox.isChecked()) {
            overallScore += 1;
        }
        return overallScore;
    }
    public double answerForQ2() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.saira_kaylee_radio_button);
        if (radioButton.isSelected()) {
            overallScore += 1;
        }
        return overallScore;
    }
    public double answerForQ3() {
        EditText editText = (EditText) findViewById(R.id.names_field_edit_text);
        if (editText.getText().toString().equals("Ayaka, Irina")) {
            overallScore += 1;
        }
        return overallScore;
    }
    public double answerForQ4() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.chinese_check_box);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.pinyin_check_box);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.other_two_check_box);
        if (checkBox.isChecked()) {
            overallScore += 1;
        }
        if(checkBox2.isChecked()) {
            overallScore += 1;
        }
        return overallScore;
    }
    public double answerForQ5() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.five_radio_button);
        if (radioButton.isSelected()) {
            overallScore += 1;
        }
        return overallScore;
    }
    public void submitTest(View view) {
        double score = (answerForQ1() + answerForQ2() + answerForQ3() + answerForQ4() + answerForQ5())/2;
        String toastMessage = "You got " + score + "/6.0";
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}