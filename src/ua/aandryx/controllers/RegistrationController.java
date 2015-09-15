package ua.aandryx.controllers;

import ua.aandryx.user.User;
import ua.aandryx.user.UserInfo;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class RegistrationController extends Controller{
    @Override
    public void drawView() {

    }

    /**
     * method: signUp
     * params: UserInfo - general information about user
     * sign up new user if possible
     * returns new User or null
     */
    public User signUp(UserInfo userInfo){
        // create
        return new User(userInfo);
    }

}
