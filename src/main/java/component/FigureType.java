package component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum FigureType {
    I,
    J,
    L,
    O,
    S,
    Z,
    T;
    public static List<FigureType> getAllType(){
        return Arrays.asList(FigureType.values());
    }
}