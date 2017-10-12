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
public class PercentOffDiscount implements Discount {
    private double percentOff;
    private double unitCost;
    private int qty;

  
    @Override
    public final double getDiscountAmt(double unitCost, int qty){
        return unitCost * qty * percentOff;
    }

    public final void PercentOffDiscount(double percentOff) {
        this.percentOff = percentOff;
    }

    public double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        if(percentOff < 0){
            throw new IllegalArgumentException("...");
        }
        this.percentOff = percentOff;
    }
}
