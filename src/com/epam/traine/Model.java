package com.epam.traine;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class Model {

    private int legOne;
    private int legTwo;

    public double calculateHeightOfTriangle(){
        return (legOne * legTwo) / calculateHypotenuseOfTriangle(legOne,legTwo);
    }

    public double calculateHypotenuseOfTriangle(int legOne, int legTwo){
        return Math.sqrt((Math.pow(legOne,2) + Math.pow(legTwo,2)));
    }

    public boolean checkLegs(int legOne, int legTwo){
        return (legOne > 0) && (legTwo > 0);
    }



    public void setLegOne(int legOne) {
        this.legOne = legOne;
    }

    public void setLegTwo(int legTwo) {
        this.legTwo = legTwo;
    }

    public int getLegOne() {
        return legOne;
    }

    public int getLegTwo() {
        return legTwo;
    }


}
