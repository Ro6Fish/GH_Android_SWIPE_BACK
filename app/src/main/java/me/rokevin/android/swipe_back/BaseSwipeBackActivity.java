package me.rokevin.android.swipe_back;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.rokevin.android.lib.swipeback.SwipeBackLayout;
import me.rokevin.android.lib.swipeback.Utils;
import me.rokevin.android.lib.swipeback.app.SwipeBackActivityBase;
import me.rokevin.android.lib.swipeback.app.SwipeBackActivityHelper;

/**
 * Created by rokevin on 16/6/5.
 */
public class BaseSwipeBackActivity extends AppCompatActivity implements SwipeBackActivityBase {

    private SwipeBackActivityHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mHelper = new SwipeBackActivityHelper(this);
        mHelper.onActivityCreate();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mHelper.onPostCreate();
    }

    @Override
    public SwipeBackLayout getSwipeBackLayout() {
        return mHelper.getSwipeBackLayout();
    }

    @Override
    public void setSwipeBackEnable(boolean enable) {
        getSwipeBackLayout().setEnableGesture(enable);
    }

    @Override
    public void scrollToFinishActivity() {
        Utils.convertActivityToTranslucent(this);
        getSwipeBackLayout().scrollToFinishActivity();
    }
}
