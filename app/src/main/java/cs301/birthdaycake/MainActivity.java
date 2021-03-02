package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView mainCakeV = (CakeView)findViewById(R.id.cakeview);

        CakeController mainCakeC = new CakeController(mainCakeV);

        Button blowout = (Button)findViewById(R.id.blowout);
        blowout.setOnClickListener(mainCakeC);

        Switch candles = (Switch)findViewById(R.id.candles);
        candles.setOnCheckedChangeListener(mainCakeC);

        SeekBar numCandles = (SeekBar)findViewById(R.id.NumCandles);
        numCandles.setOnSeekBarChangeListener(mainCakeC);

        mainCakeV.setOnTouchListener(mainCakeC);
    }

    public void goodbye(View button) {
        Log.i("goodbuy","Goodbuy !") ;
    }

}
