package th.ac.kku.angwatananon.laksana.mycalculator;

import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener*/ {
//    EditText numX;
//    EditText numY;
//    TextView tvResult;
//    Button calculator;
//    RadioGroup operator;
//    Switch Switch1;
//    float value1 = 0 ;
//    float value2 = 0;
//    float result = 0;
//
//    Toast toast ;
//    Long start=null, stop=null ;
//    Double timeCurrent = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
//        calculator = (Button) findViewById(R.id.calculator);
//        numX = (EditText) findViewById(R.id.numberX);
//        numY = (EditText) findViewById(R.id.numberY);
//        tvResult = (TextView) findViewById(R.id.result);
//        operator = (RadioGroup) findViewById(R.id.rgOperator) ;
//        Switch1 = (Switch) findViewById(R.id.switch1);
//        calculator.setOnClickListener(this);
//        operator.setOnCheckedChangeListener(this);
//        Switch1.setOnCheckedChangeListener(this);
//        Switch1.setText("OFF");
//        getSize();



    }
//    public void acceptNumber(){
//        start = System.currentTimeMillis();
//        try{
//            value1 = Float.parseFloat("" + numX.getText());
//            value2 = Float.parseFloat("" + numY.getText());
//
//        }catch (Exception e){
//            showToast("Please enter only a number");
//        }
//    }
//
//
//    private void showToast(String msg){
//        toast = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.show();
//    }
//    @Override
//    public void onClick(View v) {
//        if(v == calculator){
//           calculate(operator.getCheckedRadioButtonId());
//
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId() == R.id.action_settings){
//            Toast.makeText(MainActivity.this,"Choose action setting",Toast.LENGTH_LONG).show();
//            return true;
//        }
//        return  super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onCheckedChanged(RadioGroup group, int checkedId) {
//        calculate(checkedId);
//
//
//    }
//    private void calculate(int id){
//        acceptNumber();
//        switch(id){
//            case R.id.rbPlus:
//                result = value1 + value2 ;
//                break;
//            case R.id.rbMinus:
//                result = value1 - value2 ;
//                break;
//            case R.id.rbProduct:
//                result = value1 * value2 ;
//                break;
//            case R.id.rbDivide:
//                result = value1 / value2 ;
//                if(value2 == 0){
//                    showToast("Please divide by a non-zero number");
//                }
//                break;
//        }
//        stop = System.currentTimeMillis();
//        timeCurrent = Double.valueOf( stop - start);
//        Log.d("Calculation", "computation time = " + timeCurrent);
//        Log.d("start", " time = " + start);
//        Log.d("stop", " stop = " + stop);
//        tvResult.setText(" = " + result);
//    }
//
//    public void getSize(){
//        WindowManager windowManager = this.getWindowManager();
//        Display display = windowManager.getDefaultDisplay();
//
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.JELLY_BEAN_MR1){
//            display.getRealMetrics(displayMetrics);
//        }
//
//        int hieght = displayMetrics.heightPixels;
//        int width = displayMetrics.widthPixels;
//
//        DisplayMetrics dispM = new DisplayMetrics();
//        display.getMetrics(dispM);
//
//        int disHeight = dispM.heightPixels;
//        int disWidth = dispM.widthPixels;
//
//        showToast("width = " + width + " hieght = " + hieght);
//    }
//
//    @Override
//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        if(Switch1.isChecked()){
//            Switch1.setText("ON");
//        }
//        else{
//            Switch1.setText("OFF");
//        }
//
//    }
}