package ua.aandryx.user.phone;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class Phone {
    public String phoneNumber;
    public PhoneType phoneType;

    public Phone(String phoneNumber,PhoneType phoneType){
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }
}
