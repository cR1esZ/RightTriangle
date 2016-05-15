package com.epam.traine;

import java.util.Scanner;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Work methods
     */
    public void processUser() {
        view.printMessage(view.HELLO_PLAYER);

        Scanner scanner = new Scanner(System.in);



        while (inputTwoIntValueForLegsTriangleWithScanner(scanner)) {
            view.printMessageAndDouble(View.HEIGHT_TRIANGLE, model.calculateHeightOfTriangle());
            view.printMessageAndDouble(View.HYPOTENUSE_TRIANLE, model.calculateHypotenuseOfTriangle(model.getLegOne(),model.getLegTwo()));
        }

    }


    public boolean inputTwoIntValueForLegsTriangleWithScanner(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            scanner.next();
        }
        int legOne = scanner.nextInt();
        int legTwo = scanner.nextInt();


        if (!model.checkLegs(legOne,legTwo)) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            inputTwoIntValueForLegsTriangleWithScanner(scanner);
        } else {
            model.setLegOne(legOne);
            model.setLegTwo(legTwo);
        }
        return true;
    }
}
