package ua.aandryx.controllers;

import ua.aandryx.order.Order;

/**
 * Created by adobrianskiy on 15.09.15.
 */
public class CancelOrderController extends Controller{

    @Override
    public void drawView() {

    }

    public boolean cancelOrder(Order order){
        return true;
    }
}
