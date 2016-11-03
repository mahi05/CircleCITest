package com.mahii.circletest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.common.base.Strings;

public class SecondActivity extends AppCompatActivity {

    // The name of the extra data sent through an {@link Intent}.
    public final static String KEY_EXTRA_MESSAGE =
            "com.example.android.testing.espresso.basicsample.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the message from the Intent.
        Intent intent = getIntent();
        String message = Strings.nullToEmpty(intent.getStringExtra(KEY_EXTRA_MESSAGE));

        // Show message.
        ((TextView)findViewById(R.id.show_text_view)).setText(message);

    }

    /**
     * Creates an {@link Intent} for {@link SecondActivity} with the message to be displayed.
     * @param context the {@link Context} where the {@link Intent} will be used
     * @param message a {@link String} with text to be displayed
     * @return an {@link Intent} used to start {@link SecondActivity}
     */
    static protected Intent newStartIntent(Context context, String message) {
        Intent newIntent = new Intent(context, SecondActivity.class);
        newIntent.putExtra(KEY_EXTRA_MESSAGE, message);
        return newIntent;
    }

}
