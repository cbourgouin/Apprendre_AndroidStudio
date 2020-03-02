package me.cbourgouin.topquiz.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import me.cbourgouin.topquiz.R;

public class GameActivity extends AppCompatActivity {

    private TextView TV1;
    private Button BT1;
    private Button BT2;
    private Button BT3;
    private Button BT4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TV1 = findViewById(R.id.activity_game_question_text);
        BT1 = findViewById(R.id.activity_game_answer1_btn);
        BT2 = findViewById(R.id.activity_game_answer2_btn);
        BT3 = findViewById(R.id.activity_game_answer3_btn);
        BT4 = findViewById(R.id.activity_game_answer4_btn);
    }
}
