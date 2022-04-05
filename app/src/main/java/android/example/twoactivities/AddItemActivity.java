package android.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
    }

    public void addItem(View view) {
        Button btn = (Button) (view);
        String reply = btn.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}