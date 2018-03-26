package example.comand.commonlib.net;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Retrofit+Okhttp封装类
 * Created by huolala-sunyan on 2018/3/26.
 */

public class RetrofitHelper {

    private static OkHttpClient mOkHttpClient;
    static {
        initOkHttp();
    }

    /**
     * DLC双检查法初始化OkHttp
     */
    private static void initOkHttp() {
        if (mOkHttpClient == null){
            synchronized (RetrofitHelper.class){
                if (mOkHttpClient == null){
                    mOkHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(5, TimeUnit.SECONDS)//设置连接超时时间5s
                    .readTimeout(10, TimeUnit.SECONDS) //设置读取超时时间10s
                    .writeTimeout(10, TimeUnit.SECONDS)//设置写超时时间10s
                    .build();
                }
            }
        }
    }

    /**
     * 根据传入的baseUrl，和api创建retrofit
     * @param cls
     * @param baseurl
     * @param <T>
     * @return
     */
    public static <T>T createApi(Class<T> cls,String baseurl) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(cls);

    }

}
