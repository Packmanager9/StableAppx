package ditzler.cole.stableapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Lottery extends AppCompatActivity{

    EditText inputBox;
    TextView outputBox;
    String outcome = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.lottery_layout);
        inputBox = (EditText) findViewById(R.id.editTextBox);
        outputBox = (TextView) findViewById(R.id.TextViewA);
        LotteryGame();
    }

    public void LotteryGame(){

        int WinNum = new Random().nextInt(900)+100;
        int guess = Integer.parseInt(String.valueOf(inputBox.getText()));
        int G1 = guess%10;
        int G2 = ((guess-G1)/10)%10;
        int G3 = ((guess-((G2*10)+G1)/100)%10);
        int W1 = WinNum%10;
        int W2 = ((WinNum-W1)/10)%10;
        int W3 = ((WinNum-((W2*10)+W1)/100)%10);
        int correctness = 0;
        
        if (G1 == W1){
            correctness++;
        }
        if (G2 == W2){
            correctness++;
        }
        if (G3 == W3){
            correctness++;
        }
        
        

        if (guess >= 1000 || guess < 100){
            return;
        }else {
            switch (correctness) {
                case 3:
                    outcome = "You guessed exactly, have $10,000";
                    break;
                case 2:
                    outcome = "You guessed two of three s, have $3,000";
                    break;
                case 1:
                    outcome = "You guessed one of three s, have $1,000";
                    break;
                case 0:
                    outcome = "You have failed";
                    break;
            }
            outputBox.setText(outcome);
        }
    }
}
