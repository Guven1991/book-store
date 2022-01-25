package com.guven.bookstore.service;

import com.guven.bookstore.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
