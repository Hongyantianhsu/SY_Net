package example.comand.commonlib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by huolala-sunyan on 2018/3/26.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        initView(savedInstanceState);
        initToolBar();
    }

    public abstract int getLayoutId();

    public abstract void initView(Bundle saveInstanceState);

    public abstract void initToolBar();
}
