package com.zanelove.ZaneTextView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MyTextView textView = (MyTextView) this.findViewById(R.id.myTextView);
        textView.setText(getResources().getString(R.string.textview_src));
    }
}
