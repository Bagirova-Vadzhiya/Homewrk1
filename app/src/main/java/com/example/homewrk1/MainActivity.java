package com.example.homewrk1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        float coat = 70;
        byte coatDiscount = 77;
        float hat = 25;
        byte hatDiscount = 37;
        float suit = 53;
        byte suitDiscount = 44;
        float shirt = 19;
        float shoes = 41;
        byte shoesDiscount = 32;
        float account = 312;
        private float calculation () {
            float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount) + suit * (100 - suitDiscount)
                    + shirt + shoes * (100 - shoesDiscount)) / 100;
            return count;
        }
        private boolean possibility() {
            if (calculation() <= account) {
                return true;
            } else {
                return false;
            }
        }
        private float balance() {
            if(possibility()) {
                return account - calculation();
            } else {
                return -1;
            }
        }
        private TextView possibilityOut;
        private TextView balanceOut;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);  
            possibilityOut = findViewById(R.id.possibilityOut);
            balanceOut = findViewById(R.id.balanceOut);
            if (possibility()) {
                possibilityOut.setText("Имеется достаточно средств для покупки делового гардероба");
                balanceOut.setText("Остаток от покупки " + balance() + " серебрянных монет");
            } else {
                possibilityOut.setText("Недостаточно средств для покупки делового гардероба");
                balanceOut.setText(" - ");
            }
        }
    }

