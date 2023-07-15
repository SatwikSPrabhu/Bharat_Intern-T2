package com.satwiksprabhu.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    RadioButton one,two,three,four,five,q1option1,q1option2,q1option3,q1option4,q2option1,q2option2,q2option3,q2option4,q3option1,q3option2,q3option3,q3option4,q4option1,q4option2,q4option3,q4option4,q5option1,q5option2,q5option3,q5option4;
    RadioGroup qlist,optionsq1,optionsq2,optionsq3,optionsq4,optionsq5;
    View l1,l2,l3,l4,l5;
    ScrollView scrollView;
    Button submit;
    int marks=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (RadioButton) findViewById(R.id.One);
        two = (RadioButton) findViewById(R.id.Two);
        three = (RadioButton) findViewById(R.id.Three);
        four = (RadioButton) findViewById(R.id.Four);
        five = (RadioButton) findViewById(R.id.Five);

        submit = (Button) findViewById(R.id.Submit);

        q1option1 = (RadioButton) findViewById(R.id.Option1Q1);
        q1option2 = (RadioButton) findViewById(R.id.Option2Q1);
        q1option3 = (RadioButton) findViewById(R.id.Option3Q1);
        q1option4 = (RadioButton) findViewById(R.id.Option4Q1);

        q2option1 = (RadioButton) findViewById(R.id.Option1Q2);
        q2option2 = (RadioButton) findViewById(R.id.Option2Q2);
        q2option3 = (RadioButton) findViewById(R.id.Option3Q2);
        q2option4 = (RadioButton) findViewById(R.id.Option4Q2);

        q3option1 = (RadioButton) findViewById(R.id.Option1Q3);
        q3option2 = (RadioButton) findViewById(R.id.Option2Q3);
        q3option3 = (RadioButton) findViewById(R.id.Option3Q3);
        q3option4 = (RadioButton) findViewById(R.id.Option4Q3);

        q4option1 = (RadioButton) findViewById(R.id.Option1Q4);
        q4option2 = (RadioButton) findViewById(R.id.Option2Q4);
        q4option3 = (RadioButton) findViewById(R.id.Option3Q4);
        q4option4 = (RadioButton) findViewById(R.id.Option4Q4);

        q5option1 = (RadioButton) findViewById(R.id.Option1Q5);
        q5option2 = (RadioButton) findViewById(R.id.Option2Q5);
        q5option3 = (RadioButton) findViewById(R.id.Option3Q5);
        q5option4 = (RadioButton) findViewById(R.id.Option4Q5);

        qlist = (RadioGroup) findViewById(R.id.QList);

        optionsq1 = (RadioGroup) findViewById(R.id.OptionsQ1);
        optionsq2 = (RadioGroup) findViewById(R.id.OptionsQ2);
        optionsq3 = (RadioGroup) findViewById(R.id.OptionsQ3);
        optionsq4 = (RadioGroup) findViewById(R.id.OptionsQ4);
        optionsq5 = (RadioGroup) findViewById(R.id.OptionsQ5);

        scrollView = (ScrollView) findViewById(R.id.ScrollView);

        l1 = (LinearLayout) findViewById(R.id.L1);
        l2 = (LinearLayout) findViewById(R.id.L2);
        l3 = (LinearLayout) findViewById(R.id.L3);
        l4 = (LinearLayout) findViewById(R.id.L4);
        l5 = (LinearLayout) findViewById(R.id.L5);

        one.setChecked(true);

        qlist.setOnCheckedChangeListener(null);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.smoothScrollTo(0, l1.getTop());
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.smoothScrollTo(0, l2.getTop());
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.smoothScrollTo(0, l3.getTop());
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.smoothScrollTo(0, l4.getTop());
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.smoothScrollTo(0, l5.getTop());
            }
        });

        scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                int scrollViewHeight = scrollView.getHeight();
                int scrollY = scrollView.getScrollY();
                int l1Top = l1.getTop();
                int l2Top = l2.getTop();
                int l3Top = l3.getTop();
                int l4Top = l4.getTop();
                int l5Top = l5.getTop();

                if (scrollY >= l1Top && scrollY < l2Top) {
                    one.setChecked(true);
                } else if (scrollY >= l2Top && scrollY < l3Top) {
                    two.setChecked(true);
                } else if (scrollY >= l3Top && scrollY < l4Top) {
                    three.setChecked(true);
                } else if (scrollY >= l4Top && scrollY < l5Top) {
                    four.setChecked(true);
                } else if (scrollY >= l5Top) {
                    five.setChecked(true);
                }
            }
        });

        optionsq1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == q1option1.getId()) {
                    marks += 0;
                } else if (checkedId == q1option2.getId()) {
                    marks += 0;
                } else if (checkedId == q1option3.getId()) {
                    marks += 1;
                } else if (checkedId == q1option4.getId()) {
                    marks += 0;
                }
            }
        });

        optionsq2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == q2option1.getId()) {
                    marks += 0;
                } else if (checkedId == q2option2.getId()) {
                    marks += 0;
                } else if (checkedId == q2option3.getId()) {
                    marks += 1;
                } else if (checkedId == q2option4.getId()) {
                    marks += 0;
                }
            }
        });

        optionsq3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == q3option1.getId()) {
                    marks += 0;
                } else if (checkedId == q3option2.getId()) {
                    marks += 1;
                } else if (checkedId == q3option3.getId()) {
                    marks += 0;
                } else if (checkedId == q3option4.getId()) {
                    marks += 0;
                }
            }
        });

        optionsq4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == q4option1.getId()) {
                    marks += 0;
                } else if (checkedId == q4option2.getId()) {
                    marks += 1;
                } else if (checkedId == q4option3.getId()) {
                    marks += 0;
                } else if (checkedId == q4option4.getId()) {
                    marks += 0;
                }
            }
        });

        optionsq5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == q5option1.getId()) {
                    marks += 0;
                } else if (checkedId == q5option2.getId()) {
                    marks += 0;
                } else if (checkedId == q5option3.getId()) {
                    marks += 0;
                } else if (checkedId == q5option4.getId()) {
                    marks += 1;
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("marks",marks);
                startActivity(i);
            }
        });
    }
}