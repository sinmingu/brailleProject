package com.example.sinmingu.brailleproject;

import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class brailletableActivity extends FragmentActivity {

    Spinner wordmenu;
    ImageView consonant_initial_one, consonant_initial_two, finalconsonant_initial_one,finalconsonant_initial_two,
    vowel_one, vowel_two,vowel_three;
    TextView viewmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brailletable);


        wordmenu=(Spinner)findViewById(R.id.wordmenu);

        consonant_initial_one=(ImageView)findViewById(R.id.consonant_initial_one);
        consonant_initial_two=(ImageView)findViewById(R.id.consonant_initial_two);
        finalconsonant_initial_one=(ImageView)findViewById(R.id.finalconsonant_ini_one);
        finalconsonant_initial_two=(ImageView)findViewById(R.id.finalconsonant_ini_two);
        vowel_one=(ImageView)findViewById(R.id.vowel_one);
        vowel_two=(ImageView)findViewById(R.id.vowel_two);
        vowel_three=(ImageView)findViewById(R.id.vowel_three);
        viewmenu=(TextView)findViewById(R.id.view_menu);

        final ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.word,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        wordmenu.setAdapter(adapter);

        wordmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?>  parent, View view, int position, long id) {

              //  Toast.makeText(brailletableActivity.this,
              //          adapter.getItem(position) + "을 선택 했습니다.", Toast.LENGTH_SHORT).show();

                if(adapter.getItem(position).equals("자음(초성)")){

                    consonant_initial_one.setVisibility(View.VISIBLE);
                    consonant_initial_two.setVisibility(View.VISIBLE);
                    finalconsonant_initial_one.setVisibility(View.GONE);
                    finalconsonant_initial_two.setVisibility(View.GONE);
                    vowel_one.setVisibility((View.GONE));
                    vowel_two.setVisibility((View.GONE));
                    vowel_three.setVisibility((View.GONE));

                    viewmenu.setText("자음(초성)");


                }
                else if(adapter.getItem(position).equals("자음(종성)")){

                    consonant_initial_one.setVisibility(View.GONE);
                    consonant_initial_two.setVisibility(View.GONE);
                    finalconsonant_initial_one.setVisibility(View.VISIBLE);
                    finalconsonant_initial_two.setVisibility(View.VISIBLE);
                    vowel_one.setVisibility((View.GONE));
                    vowel_two.setVisibility((View.GONE));
                    vowel_three.setVisibility((View.GONE));

                    viewmenu.setText("자음(종성)");

                }
                else if(adapter.getItem(position).equals("모음")){
                    consonant_initial_one.setVisibility(View.GONE);
                    consonant_initial_two.setVisibility(View.GONE);
                    finalconsonant_initial_one.setVisibility(View.GONE);
                    finalconsonant_initial_two.setVisibility(View.GONE);
                    vowel_one.setVisibility((View.VISIBLE));
                    vowel_two.setVisibility((View.VISIBLE));
                    vowel_three.setVisibility((View.VISIBLE));

                    viewmenu.setText("자음(모음)");

                }
                else if(adapter.getItem(position).equals("알파벳")){

                }
                else if(adapter.getItem(position).equals("숫자")){

                }
                else if(adapter.getItem(position).equals("약자")){

                }
            }
            public void onNothingSelected(AdapterView<?>  parent) {


            }
        });

    }
}

