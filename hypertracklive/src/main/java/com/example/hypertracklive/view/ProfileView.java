package com.example.hypertracklive.view;

/**
 * Created by suhas on 24/02/16.
 */
public interface ProfileView {
    void showProfilePicUploadError();

    void showProfilePicUploadSuccess();

    void navigateToHomeScreen();

    void showErrorMessage();



    void updateViews(String name, String phone, String ISOCode, String profileURL);

    void registrationFailed();

    void registrationSuccessful();



}
