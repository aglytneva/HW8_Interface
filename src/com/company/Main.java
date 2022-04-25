package com.company;

import com.company.Beeper.Beeper;
import com.company.Beeper.BreakBeeper;
import com.company.Beeper.LoudBeeper;
import com.company.Capasity.Capasity;
import com.company.Capasity.Huge;
import com.company.Capasity.Mini;
import com.company.Colour.Blue;
import com.company.Colour.Colour;
import com.company.Colour.Green;
import com.company.Colour.Red;
import com.company.Engine.Engine;
import com.company.Engine.Power123;
import com.company.Engine.Power200;
import com.company.Possibility.Fly;
import com.company.Possibility.Possibility;
import com.company.Possibility.Ride;

public class Main {

    public static void main(String[] args) {
        printSeparator();
        System.out.println("Моя первая машина");
	// создание моей первой машины
        Beeper breakBeeper = new BreakBeeper();
        Colour green = new Green();
        Engine power123 = new Power123();
        Possibility ride = new Ride();
        FirstCar firstCar = new FirstCar(breakBeeper,green, power123, ride);
        System.out.println((firstCar.beeper.makeSound()));
        System.out.println((firstCar.colour.getColour()));
        System.out.println((firstCar.engine.getPower()));
        System.out.println((firstCar.possibility.getPossibility()));


        printSeparator();
        System.out.println("Машина, которую хочу");
        // создание моей будущей машины
        Beeper loudBeeper = new LoudBeeper();
        Colour red = new Red();
        Engine power200 = new Power200();
        Possibility ride1 = new Ride();
        FutureCar futureCar = new FutureCar(loudBeeper, red, power200, ride1);
        System.out.println((futureCar.beeper.makeSound()));
        System.out.println((futureCar.colour.getColour()));
        System.out.println((futureCar.engine.getPower()));
        System.out.println((futureCar.possibility.getPossibility()));

        printSeparator();
        System.out.println("Частный самолет 1");
        // создание частного самолета
        Capasity mini = new Mini();
        Colour blue = new Blue();
        Possibility fly = new Fly();
        PrivateJet privateJet1 = new PrivateJet(mini, blue,fly);
        System.out.println(privateJet1.capasity.getCapasity());
        System.out.println(privateJet1.colour.getColour());
        System.out.println(privateJet1.possibility.getPossibility());

        printSeparator();
        System.out.println("Боинг 1");
        // создание боинга
        Capasity huge = new Huge();
        Colour red2 = new Red();
        Possibility fly2 = new Fly();
        Boeing boeingng1 = new Boeing(huge,red2,fly2);
        System.out.println(boeingng1.capasity.getCapasity());
        System.out.println(boeingng1.colour.getColour());
        System.out.println(boeingng1.possibility.getPossibility());
    }

    public static void printSeparator() {
        System.out.println("=======================");

    }
}
