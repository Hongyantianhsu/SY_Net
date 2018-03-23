package example.comand.commonlib;

import android.view.View;

/**
 * Created by huolala-sunyan on 2018/3/19.
 */

public class UIUtils {
    public static <T>T bindView(View v, int id){
        return (T)v.findViewById(id);
    }
}
