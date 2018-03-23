package comand.sy_net.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by huolala-sunyan on 2018/3/19.
 */

public class RetrofitUtil {
    private static final String BASE_URL = "http://192.168.3.66";

    public static Retrofit getRetrofit(){
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getApiService(){
        return getRetrofit().create(ApiService.class);
    }

    public static Call<WorkInfo> getWorkInfo(String params){
        return getApiService().getWorkInfo(params);
    }
}
