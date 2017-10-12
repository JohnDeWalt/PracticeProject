/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

/**
 *
 * @author Jackie
 */
public class QtyFlatAmountDiscount implements Discount {
    private double packagePrice;
    private int qty;
    
    @Override
    public final double getDiscountAmt(double packagePrice, int qty){
        return packagePrice * qty;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        if(packagePrice <= 0){
            throw new IllegalArgumentException("This product has no package deal.");
        }
        this.packagePrice = packagePrice;
    }
             
}
