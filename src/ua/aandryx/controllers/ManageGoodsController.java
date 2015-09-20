package ua.aandryx.controllers;

import ua.aandryx.order.Goods;

/**
 * Created by adobrianskiy on 21.09.15.
 */
public class ManageGoodsController {
    /**
     * @return true - if user is ExtendedUser, false - otherwise
     */
    private boolean hasAccess() {
        return false;
    }

    /**
     * @param goods
     * @return true - if success, false - otherwise
     */
    public boolean addGoods(Goods goods) {
        return false;
    }

    /**
     * @param goods
     * @return true - if success, false - otherwise
     */
    public boolean removeGoods(Goods goods) {
        return false;
    }
}
