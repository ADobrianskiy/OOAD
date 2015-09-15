package ua.aandryx.controllers;

import ua.aandryx.order.Order;
import ua.aandryx.user.address.BillingAddress;
import ua.aandryx.user.address.DeliveryAddress;
import ua.aandryx.user.phone.Phone;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class OrderController extends Controller{

    @Override
    public void drawView() {

    }

    public Order createOrder(DeliveryAddress deliveryAddress, BillingAddress billingAddress, Phone phone){
        return new Order(current_user, deliveryAddress, billingAddress, phone);
    }

    public void redirectToPaymentController(Order order){
        new PaymentController(order);
    }
}
