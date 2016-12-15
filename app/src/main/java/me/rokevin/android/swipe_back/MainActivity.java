package me.rokevin.android.swipe_back;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 主页面
 */
public class MainActivity extends BaseSwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }
}
