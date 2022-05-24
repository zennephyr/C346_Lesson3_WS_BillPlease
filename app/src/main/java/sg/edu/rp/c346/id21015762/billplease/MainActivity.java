package sg.edu.rp.c346.id21015762.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText amt;
    EditText num;
    ToggleButton Serv;
    ToggleButton Gst;
    EditText disc;
    RadioGroup pmethod;
    Button split;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amt = findViewById(R.id.amt);
        num = findViewById(R.id.num);
        Serv = findViewById(R.id.Serv);
        Gst = findViewById(R.id.Gst);
        disc = findViewById(R.id.disc);
        pmethod = findViewById(R.id.pmethod);
        split = findViewById(R.id.split);
        reset = findViewById(R.id.reset);

        Serv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (Serv.isChecked()){
                    double discountAmt = 0.1;
                } else if (Gst.isChecked()){
                    double discountAmt = 0.07;
                }
            }
        });


    }


}