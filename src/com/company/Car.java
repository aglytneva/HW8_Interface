package com.company;

import com.company.Beeper.Beeper;
import com.company.Colour.Colour;
import com.company.Engine.Engine;
import com.company.Possibility.Possibility;

public abstract class Car {
    Beeper beeper;
    Colour colour;
    Engine engine;
    Possibility possibility;

    public Car (Beeper beeper, Colour colour, Engine engine, Possibility possibility ) {
        this.beeper = beeper;
        this.colour = colour;
        this.engine = engine;
        this.possibility = possibility;
    }
}
