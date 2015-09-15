package ua.aandryx.user;

import ua.aandryx.user.address.BillingAddress;
import ua.aandryx.user.address.DeliveryAddress;
import ua.aandryx.user.phone.Phone;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class User {
    private UserInfo userInfo;
    private Phone[] phones;
    private BillingAddress[] billingAddresses;
    private DeliveryAddress[] deliveryAddresses;

    public User(UserInfo userInfo) {
        this.userInfo = userInfo ;
    }
}
