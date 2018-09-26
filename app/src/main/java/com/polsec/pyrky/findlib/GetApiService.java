package com.polsec.pyrky.findlib;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface GetApiService {

    @POST("findParkingSlotsForAPI/")
    Call<Camera> getParkingSlots(@Body InputParams inputParams);
}
