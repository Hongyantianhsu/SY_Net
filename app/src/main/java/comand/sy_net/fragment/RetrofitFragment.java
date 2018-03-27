package comand.sy_net.fragment;

import android.widget.TextView;

import comand.sy_net.R;
import example.comand.commonlib.UIUtils;
import example.comand.commonlib.base.BaseFragment;

/**
 * Created by huolala-sunyan on 2018/3/27.
 */

public class RetrofitFragment extends BaseFragment {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_retrofit;
    }

    @Override
    public void initView() {
        TextView tvContent = UIUtils.bindView(parentView,R.id.tv_content);
    }

    @Override
    public void initData() {

    }
}
