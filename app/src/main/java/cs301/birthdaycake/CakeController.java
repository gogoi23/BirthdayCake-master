package cs301.birthdaycake;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
CompoundButton.OnCheckedChangeListener,
SeekBar.OnSeekBarChangeListener, View.OnTouchListener

{
    private CakeView cakeV;
    private CakeModel cakeC;


    public CakeController(CakeView cake){
        this.cakeV = cake;
        this.cakeC = this.cakeV.getCake();

    }

   public void onClick(View v){

       if(cakeC.lit){
           cakeC.lit = false;
       }
       else {
           cakeC.lit = true;
       }
       cakeV.invalidate();
    }

    public void onCheckedChanged (CompoundButton buttonView,boolean isChecked){
        if(cakeC.candles == true){
            cakeC.candles = false;
        }
        else{
            cakeC.candles = true;
        }
        cakeV.invalidate();

    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
        cakeC.numCandles = progress;
        cakeV.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekBar){}

    public void 	onStopTrackingTouch(SeekBar seekBar){}

    public boolean onTouch(View v, MotionEvent event) {
        cakeV.getCake().isBalloon = true;
        cakeV.getCake().balloonx = event.getX();
        cakeV.getCake().balloony = event.getY();
        cakeV.getCake().showCord = true;
        cakeV.getCake().xtouch = event.getX();
        cakeV.getCake().ytouch = event.getY();
        cakeV.invalidate();


        return true;
    }


}
