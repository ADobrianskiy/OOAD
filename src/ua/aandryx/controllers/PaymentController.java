package ua.aandryx.controllers;

import ua.aandryx.order.Order;
import ua.aandryx.order.OrderStatus;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class PaymentController extends Controller{
    private Order order;

    public PaymentController(Order order) {
        this.order = order;
    }

    /**
     * method: confirmPayment
     * params: none
     * changing status of Order to Completed
     * return true - if successful, false - otherwise.
     */
    public boolean confirmPayment(){
        return order.setStatus(OrderStatus.Completed);
    }

    @Override
    public void drawView() {

    }
}
