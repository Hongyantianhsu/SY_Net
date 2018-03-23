package comand.sy_net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import comand.sy_net.retrofit.RetrofitFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG_RETROFIT = "RETROFIT";
    private RetrofitFragment retrofitFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_retrofit).setOnClickListener(this);
        retrofitFragment = new RetrofitFragment();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_retrofit:
                getSupportFragmentManager().beginTransaction().replace(R.id.fr_container,retrofitFragment,TAG_RETROFIT).commit();
                break;
        }
    }
}
