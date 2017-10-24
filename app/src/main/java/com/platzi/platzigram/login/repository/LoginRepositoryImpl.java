package com.platzi.platzigram.login.repository;

import com.platzi.platzigram.login.interactor.LoginInteractorImpl;
import com.platzi.platzigram.login.presenter.LoginPresenter;

/**
 * Created by Victor Ferrada on 23-10-2017.
 */

public class LoginRepositoryImpl implements LoginRepository {


    //private LoginInteractorImpl loginInteractor;

    LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void signIn(String username, String password) {
        boolean success = false;
        if(success){
            presenter.loginSuccess();
        }else{
            presenter.loginError("Ocurrio un Error");
        }

    }
}
