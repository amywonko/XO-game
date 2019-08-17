package io.wonko.xo.controllers;

import io.wonko.xo.model.Field;
import io.wonko.xo.model.Figure;
import io.wonko.xo.model.exceptions.AlreadyOccupiedException;
import io.wonko.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException,
                                                        InvalidPointException {
        if(field.getFigure(point)!= null){
            throw new AlreadyOccupiedException();
        }

        field.setFigure(point, figure);
    }
}
