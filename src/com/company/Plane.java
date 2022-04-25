package com.company;

import com.company.Capasity.Capasity;
import com.company.Colour.Colour;
import com.company.Possibility.Possibility;

public abstract class Plane {
    Capasity capasity;
    Colour colour;
    Possibility possibility;

    public Plane (Capasity capasity, Colour colour, Possibility possibility) {
        this.capasity = capasity;
        this.colour = colour;
        this.possibility = possibility;
    }
}
