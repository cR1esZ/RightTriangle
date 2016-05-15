package com.epam.traine;


import org.junit.Assert;
import org.junit.Test;


/**
 * Created by andreyholovan on 5/15/16.
 */


public class ModelTest {
    @Test
    public void calculateHeightOfTriangle() throws Exception {
        Model model = new Model();
        model.setLegOne(10);
        model.setLegTwo(20);

        double expected = (model.getLegOne() * model.getLegTwo()) / (Math.sqrt((model.getLegOne() * model.getLegOne()) + (model.getLegTwo() * model.getLegTwo())));

        double actual = model.calculateHeightOfTriangle();

        Assert.assertEquals(actual,expected,0.01);
    }

    @Test
    public void calculateHypotenuse() throws Exception {
        Model model = new Model();
        model.setLegOne(5);
        model.setLegTwo(6);

        double expected = Math.sqrt((model.getLegOne() * model.getLegOne()) + (model.getLegTwo() * model.getLegTwo()));

        double actual = model.calculateHypotenuseOfTriangle(model.getLegOne(),model.getLegTwo());

        Assert.assertEquals(actual, expected ,0.01);



    }

}