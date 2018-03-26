package comand.sy_net;

import android.os.Bundle;
import android.view.View;
import example.comand.commonlib.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private static final String TAG_RETROFIT = "RETROFIT";

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle saveInstanceState) {
        findViewById(R.id.btn_retrofit).setOnClickListener(this);
//        retrofitFragment = new RetrofitFragment();
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_retrofit:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fr_container,retrofitFragment,TAG_RETROFIT).commit();
                break;
        }
    }
}
