package ua.aandryx.controllers;

import ua.aandryx.user.address.BillingAddress;
import ua.aandryx.user.address.DeliveryAddress;
import ua.aandryx.user.phone.Phone;
import ua.aandryx.user.phone.PhoneType;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class UserInfoController extends Controller {
    @Override
    public void drawView() {

    }
    /**
     * method: addPhone
     * params: phoneNumber - new phone number, phoneType - new phone type
     * add new phone
     * return true - if successful, false - otherwise.
     */
    public boolean addPhone(String phoneNumber, PhoneType phoneType){
        return true;
    }

    /**
     * method: removePhone
     * params: phoneNumber - new phone number, phoneType - new phone type
     * remove phone
     * return true - if successful, false - otherwise.
     */
    public boolean removePhone(String phoneNumber, PhoneType phoneType){
        return true;
    }

    /**
     * method: addDelliveryAddress
     * params: billingAddress - new billing address
     * add new delivery address
     * return true - if successful, false - otherwise.
     */
    public boolean addBillingAddress(BillingAddress billingAddress){
        return true;
    }

    /**
     * method: removeDelliveryAddress
     * params: billingAddress - billing address to remove
     * remove delivery address
     * return true - if successful, false - otherwise.
     */
    public boolean removeBillingAddress(BillingAddress billingAddress){
        return true;
    }

    /**
     * method: addDelliveryAddress
     * params: deliveryAddress - new delivery address
     * add new delivery address
     * return true - if successful, false - otherwise.
     */
    public boolean addDelliveryAddress(DeliveryAddress deliveryAddress){
        return true;
    }

    /**
     * method: removeDelliveryAddress
     * params: deliveryAddress - delivery address to remove
     * remove delivery address
     * return true - if successful, false - otherwise.
     */
    public boolean removeDelliveryAddress(DeliveryAddress deliveryAddress){
        return true;
    }

    /**
     * method: changePassword
     * params: oldPassword - user current password, newPassword - new password
     * change user password
     * return true - if successful, false - otherwise.
     */
    public boolean changePassword(String oldPassword, String newPassword){
        return true;
    }
}
