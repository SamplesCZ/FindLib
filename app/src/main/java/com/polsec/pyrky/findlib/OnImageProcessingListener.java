package com.polsec.pyrky.findlib;

public interface OnImageProcessingListener {

    void onSuccess(Camera cameraResponse);

    void onFailure(String error);
}
