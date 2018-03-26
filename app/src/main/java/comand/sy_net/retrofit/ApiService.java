package comand.sy_net.retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by huolala-sunyan on 2018/3/16.
 * apiservice
 */

public interface ApiService {
    @GET("{file}")
    Call<WorkInfo> getWorkInfo(@Path("file") String file);
}
