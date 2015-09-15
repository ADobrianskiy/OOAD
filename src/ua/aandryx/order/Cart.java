package ua.aandryx.order;

import java.util.Set;

/**
 * Created by adobrianskiy on 14.09.15.
 */
public class Cart {

    private Set<Goods> goods;
    /**
     * method: addGoods
     * params: Goods - goods to add
     * add goods to cart
     */
    public boolean addGoods(Goods goods) {
        //add Goods to the cart
        return true;
    }

    /**
     * method: removeGoods
     * params: Goods - goods to remove
     * remove goods from cart
     */
    public boolean removeGoods(Goods goods) {
        //add Goods to the cart
        return true;
    }
    /**
     * method: getGoods
     * params: none
     * remove goods from cart
     */
    public Goods[] getGoods() {
        return (Goods[]) goods.toArray();
    }

    /**
     * method: clear
     * params: none
     * remove all goods from cart
     */
    public void clear(){
        goods.clear();
    }
}
