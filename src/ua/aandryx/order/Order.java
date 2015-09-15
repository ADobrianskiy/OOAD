package ua.aandryx.order;

import ua.aandryx.user.User;
import ua.aandryx.user.address.BillingAddress;
import ua.aandryx.user.address.DeliveryAddress;
import ua.aandryx.user.phone.Phone;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class Order {
    private User user;
    private DeliveryAddress deliveryAddress;
    private BillingAddress billingAddress;
    private Phone phone;
    private OrderStatus status = OrderStatus.AwaitingPayment;

    public Order(User current_user, DeliveryAddress deliveryAddress, BillingAddress billingAddress, Phone phone) {
        this.user = current_user;
        this.deliveryAddress = deliveryAddress;
        this.billingAddress = billingAddress;
        this.phone = phone;
        //add to database
    }


    public boolean setStatus(OrderStatus completed) {
        return false;
    }
}
