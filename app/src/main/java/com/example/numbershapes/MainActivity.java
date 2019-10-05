package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    class Numbers
    {
        int number;
        public boolean isTriangular()
        {
            int x=1;
            int triangularNumber=1;
            while(triangularNumber<number)
            {
                x++;
                triangularNumber=triangularNumber+x;
            }
            if(triangularNumber==number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean isSquare()
        {
            int x=1;
            double squareNumber=1;
            while(squareNumber<number)
            {
                x++;
                squareNumber=x*x;

            }
            if(squareNumber==number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


    public void numberShapes(View view){
        Log.i("info", "Button pressed");
        Numbers Mynumber  =new Numbers();
        EditText editText = (EditText) findViewById(R.id.editText);
        Mynumber.number= Integer.parseInt( editText.getText().toString());
        if(isTriangular())

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
