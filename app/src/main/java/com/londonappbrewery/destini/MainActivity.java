package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.left;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mB1,mB2;
    int mStoryIndex =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mB1 = (Button) findViewById(R.id.buttonTop);
        mB2 = (Button) findViewById(R.id.buttonBottom);

            mTextView.setText(R.string.T1_Story);
            mB1.setText(R.string.T1_Ans1);
            mB2.setText(R.string.T1_Ans2);

            mB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    update(0);
                }
            });

            mB2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   update(1);
                }
            });
        }

    void update(int l)
    {
        if(mStoryIndex==1 && l==1 )
        {
            mTextView.setText(R.string.T2_Story);
            mB1.setText(R.string.T2_Ans1);
            mB2.setText(R.string.T2_Ans2);
            mStoryIndex = 2;
        }
        else if(mStoryIndex==1 && l==0 )
        {
            mTextView.setText(R.string.T3_Story);
            mB1.setText(R.string.T3_Ans1);
            mB2.setText(R.string.T3_Ans2);
            mStoryIndex = 3;
        }
        else if(mStoryIndex == 3 && l == 0)
        {
            mTextView.setText(R.string.T6_End);
            mB1.setVisibility(View.GONE);
            mB2.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"THE END!",Toast.LENGTH_SHORT).show();
        }
        else if(mStoryIndex ==3 && l == 1)
        {
            mTextView.setText(R.string.T5_End);
            mB1.setVisibility(View.GONE);
            mB2.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"THE END!",Toast.LENGTH_SHORT).show();
        }
        else if(mStoryIndex == 2 && l == 1 )
        {
            mTextView.setText(R.string.T4_End);
            mB1.setVisibility(View.GONE);
            mB2.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"THE END!",Toast.LENGTH_SHORT).show();
        }
        else if(mStoryIndex == 2 && l == 0 )
        {
            mTextView.setText(R.string.T3_Story);
            mB1.setText(R.string.T3_Ans1);
            mB2.setText(R.string.T3_Ans2);
            mStoryIndex = 3;
        }
    }
}
