package com.platzi.platzigram.login.presenter;

/**
 * Created by Victor Ferrada on 23-10-2017.
 */

public interface LoginPresenter {

    void signIn(String username, String password); // Interactor
    void loginSuccess();
    void loginError(String error);

}
