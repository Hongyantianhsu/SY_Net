package comand.sy_net.retrofit;

import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import comand.sy_net.R;
import example.comand.commonlib.L;
import example.comand.commonlib.UIUtils;
import example.comand.commonlib.base.BaseFragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Retrofit测试Fragment
 * Created by huolala-sunyan on 2018/3/19.
 */

public class RetrofitFragment extends BaseFragment {

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_retrofit;
    }

    @Override
    public void initView() {
        TextView tv = UIUtils.bindView(parentView,R.id.tv_retrofit);

    }

    @Override
    public void initData() {
        Call<WorkInfo> call = RetrofitUtil.getWorkInfo("workInfo");
        call.enqueue(new Callback<WorkInfo>() {
            @Override
            public void onResponse(Call<WorkInfo> call, Response<WorkInfo> response) {
                WorkInfo workInfo = response.body();
                JsonObject jsonData = workInfo.getData();
                Sunyan sunyan = new Gson().fromJson(jsonData.toString(),Sunyan.class);
                L.e("-->"+sunyan.getName());
            }

            @Override
            public void onFailure(Call<WorkInfo> call, Throwable t) {
                L.e("-->"+t.getMessage());
            }
        });
    }
}
