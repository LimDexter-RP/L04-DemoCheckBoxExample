package sg.edu.rp.c346.id20039529.l04_democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbEnabled;
        Button btnCheck;
        TextView tvShow;

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this,"Button Click", Toast.LENGTH_LONG).show();
            if (cbEnabled.isChecked()){
                double pay = calcPay(100, 20);
                tvShow.setText("The discount is given. You will pay " + pay);
            }else{
                double pay = calcPay(100, 0);
                tvShow.setText("There is NO discount given. You will pay " + pay);
            }



            }
        });



    }


    private double calcPay(double price, double discount){
        double pay=price*(1-discount/100);
        return pay;
    }
}
