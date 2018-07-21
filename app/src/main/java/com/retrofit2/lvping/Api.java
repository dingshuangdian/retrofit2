package com.retrofit2.lvping;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {
    @GET("test/Login")
    Call<User> getLoginInfo(@Query("userAccount") String userAccount, @Query("userPass") String userPass);

    @GET("test/Login")
    Call<User> getLoginInfo1(@QueryMap Map<String, String> params);

    @GET("test/{Login}")
    Call<User> getLoginInfoWithPath(@Path("Login") String tag);

    @POST("test/Login")
    Call<BaseResult> getLoginInfoPost(@Body UserParam userParam);


}
