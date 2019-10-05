package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        EditText editText = (EditText) findViewById(R.id.editText);
        String message;
        if(editText.getText().toString().isEmpty()){
            message ="Please Enter a number";
        }else {
            Numbers Mynumber = new Numbers();
            Mynumber.number = Integer.parseInt(editText.getText().toString());
            message = editText.getText().toString();
            if (Mynumber.isTriangular() && Mynumber.isSquare()) {
                message += "is square and triangular";
            } else if (Mynumber.isSquare()) {
                message += "is square but not  triangular";
            } else if (Mynumber.isTriangular()) {
                message += "is triangular but not square";
            }else{
                message+="is neither triangular nor square";
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
