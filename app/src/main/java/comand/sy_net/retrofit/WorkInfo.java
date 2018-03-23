package comand.sy_net.retrofit;

import com.google.gson.JsonObject;

/**
 * Created by huolala-Sunyan on 2018/3/19.
 */

public class WorkInfo {
    String ret;
    String msg;
    JsonObject data;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }
}
