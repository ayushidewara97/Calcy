package com.example.calcy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Badd,Bsub,Bmul,Bdiv,Bdot,Beql,Brst,Bneg;
	EditText edt1;
	 private double total1=0.0;
	    private double total2=0.0;
	    private char math_operator;
	    private void getOperator(String btnText)
	    {
	      math_operator=btnText.charAt(0);
	      total1=total1+Double.parseDouble(edt1.getText().toString());      
	      //edt1.setText(String.valueOf(total1)+math_operator);
	      edt1.setText("");
	    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B0 = (Button) findViewById(R.id.button15);
        B1 = (Button) findViewById(R.id.button7);
        B2 = (Button) findViewById(R.id.button8);
        B3 = (Button) findViewById(R.id.button9);
        B4 = (Button) findViewById(R.id.button4);
        B5 = (Button) findViewById(R.id.button5);
        B6 = (Button) findViewById(R.id.button6);
        B7 = (Button) findViewById(R.id.button1);
        B8 = (Button) findViewById(R.id.button2);
        B9 = (Button) findViewById(R.id.button3);
        Badd = (Button) findViewById(R.id.button10);
        Bsub = (Button) findViewById(R.id.button11);
        Bmul = (Button) findViewById(R.id.button12);
        Bdiv = (Button) findViewById(R.id.button13);
        Bdot = (Button) findViewById(R.id.button17);
        Beql = (Button) findViewById(R.id.button14);
        Brst = (Button) findViewById(R.id.button16);
        Bneg = (Button) findViewById(R.id.button18);
        edt1 = (EditText) findViewById(R.id.editText1);
        B0.setOnClickListener(this);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);
        Badd.setOnClickListener(this);
        Bsub.setOnClickListener(this);
        Bmul.setOnClickListener(this);
        Bdiv.setOnClickListener(this);
        Bdot.setOnClickListener(this);
        Beql.setOnClickListener(this);
        Brst.setOnClickListener(this);
        Bneg.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			edt1.setText(edt1.getText()+"7");
			break;
		case R.id.button2:
			edt1.setText(edt1.getText()+"8");
			break;
		case R.id.button3:
			edt1.setText(edt1.getText()+"9");
			break;
		case R.id.button4:
			edt1.setText(edt1.getText()+"4");
			break;
		case R.id.button5:
			edt1.setText(edt1.getText()+"5");
			break;
		case R.id.button6:
			edt1.setText(edt1.getText()+"6");
			break;
		case R.id.button7:
			edt1.setText(edt1.getText()+"1");
			break;
		case R.id.button8:
			edt1.setText(edt1.getText()+"2");
			break;
		case R.id.button9:
			edt1.setText(edt1.getText()+"3");
			break;
		case R.id.button10:
			String button_text=(String) Badd.getText();
		       getOperator(button_text);
			break;
		case R.id.button11:
			String button_text1=(String) Bsub.getText();
		       getOperator(button_text1);
			break;
		case R.id.button12:
			String button_text2=(String) Bmul.getText();
		       getOperator(button_text2);
			break;
		case R.id.button13:
			String button_text3=(String) Bdiv.getText();
		       getOperator(button_text3);
			break;
		case R.id.button14:
			 switch(math_operator)
		        {
		            case'+':
		             total2 =total1+Double.parseDouble(edt1.getText().toString());
		             break;
		            case'-':
		                total2=total1-Double.parseDouble(edt1.getText().toString());
		                break;
		            case'*':
		                 total2=total1*Double.parseDouble(edt1.getText().toString());
		                 break;
		            case'/':
		                 total2=total1/Double.parseDouble(edt1.getText().toString());
		                 break;
		        }        
		        edt1.setText(Double.toString(total2));
		        total1=0;
			break;
		case R.id.button15:
			edt1.setText(edt1.getText()+"0");
			break;
		case R.id.button16:
			 total2=0;
		        edt1.setText("");
			break;
		case R.id.button17:
			edt1.setText(edt1.getText()+".");
			break;
		case R.id.button18:
			 double ops = Double.parseDouble(String.valueOf(edt1.getText()));
		       ops = ops * (-1);
		       edt1.setText(String.valueOf(ops));
			break;
		default:
			break;
		}
		
	}
	
}
