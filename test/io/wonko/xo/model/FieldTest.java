package io.wonko.xo.model;

import io.wonko.xo.model.exceptions.AlreadyOccupiedException;
import io.wonko.xo.model.exceptions.InvalidPointException;
import org.junit.Test;
import org.omg.PortableServer.POA;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() {
        final Field field = new Field();

        assertEquals(3, field.getSize());
    }

    @Test
    public void setFigure() throws AlreadyOccupiedException, InvalidPointException {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);

}

    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(null, actualFigure);

    }

    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        }catch (final InvalidPointException e){

        }
    }

}