package com.platzi.platzigram.login.view;

/**
 * Created by Victor Ferrada on 22-10-2017.
 */

public interface LoginView {

    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);

    void goCreateAccount();
    void goHome();

}
