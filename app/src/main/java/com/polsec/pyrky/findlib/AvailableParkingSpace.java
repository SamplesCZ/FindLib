package com.polsec.pyrky.findlib;

import android.support.annotation.NonNull;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AvailableParkingSpace {

    private OnImageProcessingListener mOnImageProcessingListener;


    //Method to get the available parking spaces from uploaded camera Image
    public void getAvailableParkingSpaces(final String cameraImageUrl, double cameraLat, double cameraLong, String cameraId){

        String cLat = String.valueOf(cameraLat);
        String cLong = String.valueOf(cameraLong);

        final InputParams inputParams = new InputParams(cameraImageUrl,cLat,cLong,cameraId);

        GetApiService service = RetrofitInstance.getRetrofitInstance().create(GetApiService.class);

        Call<Camera> call = service.getParkingSlots(inputParams);

        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<Camera>() {
            @Override
            public void onResponse(@NonNull Call<Camera> call, @NonNull Response<Camera> response) {

                Camera cameraResponse = response.body();
                mOnImageProcessingListener.onSuccess(cameraResponse);

            }

            @Override
            public void onFailure(@NonNull Call<Camera> call, @NonNull Throwable t) {

                mOnImageProcessingListener.onFailure(t.getMessage());

            }
        });

    }


    //Event listener, it triggers when the API gets response from the server
    public void setOnImageProcessingListener(OnImageProcessingListener eventListener)
    {
        mOnImageProcessingListener = eventListener;
    }


}
