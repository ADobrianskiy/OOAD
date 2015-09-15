package ua.aandryx.controllers;

import ua.aandryx.order.Cart;
import ua.aandryx.order.Goods;
import ua.aandryx.user.User;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public abstract class Controller {
    /**
     * Dependency injections
     * Current user -> current_user
     * User cart -> cart
     */
    protected User current_user; // null is possible
    protected Cart cart; // null is possible

    /**
     * method: drawView
     * params: none
     * drawing UI
     */
    public abstract void drawView();

    /**
     * method: logOut
     * params: none
     * clear session
     */
    public void logOut(){

    }

    /**
     * method: signIn
     * params: none
     * sign in user into system
     */
    public void signIn(String login, String password){

    }

    /**
     * method: logInRedirection
     * params: none
     * redirect to log in controller
     */
    public void logInRedirection(){

    }

    /**
     * method: addGoods
     * params: Goods - goods to add
     * add goods to cart
     */
    public boolean addToCart(Goods goods){
        return cart.addGoods(goods);
    }

    /**
     * method: removeGoods
     * params: Goods - goods to remove
     * remove goods from cart
     */
    public boolean removeFromCart(Goods goods){
        return cart.removeGoods(goods);
    }

    /**
     * method: redirectToMainController
     * params: none
     * redirect to Main Controller
     */
    public void redirectToMainController(){

    }
}
