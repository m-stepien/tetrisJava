
import component.Figure;
import component.FigureType;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import java.util.*;

@RunWith(JUnitParamsRunner.class)
public class FigureTest {

    private static Collection testValues() {
        return Arrays.asList(
                new Object[][]{{1, new Boolean[][]{{false, false, false, false}, {true, true, true, true}}, new Boolean[][]{{true, false}, {true, false}, {true, false}, {true, false}}, FigureType.I},
                        {2, new Boolean[][]{{false, false, false, false}, {true, true, true, true}}, new Boolean[][]{{true, true, true, true}, {false, false, false, false}}, FigureType.I},
                        {3, new Boolean[][]{{false, false, false, false}, {true, true, true, true}}, new Boolean[][]{{false, true}, {false, true}, {false, true}, {false, true}}, FigureType.I},
                        {4, new Boolean[][]{{false, false, false, false}, {true, true, true, true}}, new Boolean[][]{{false, false, false, false}, {true, true, true, true}}, FigureType.I},
                        {1, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, new Boolean[][]{{false, false}, {true, true}, {true, true}, {false, false}}, FigureType.O},
                        {2, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, FigureType.O},
                        {3, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, new Boolean[][]{{false, false}, {true, true}, {true, true}, {false, false}}, FigureType.O},
                        {4, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, new Boolean[][]{{false, true, true, false}, {false, true, true, false}}, FigureType.O},
                        {1, new Boolean[][]{{false, false, false, true}, {true, true, true, true}}, new Boolean[][]{{true, false}, {true, false}, {true, false}, {true, true}}, FigureType.L},
                        {2, new Boolean[][]{{false, false, false, true}, {true, true, true, true}}, new Boolean[][]{{true, true, true, true}, {true, false, false, false}}, FigureType.L},
                        {3, new Boolean[][]{{false, false, false, true}, {true, true, true, true}}, new Boolean[][]{{true, true}, {false, true}, {false, true}, {false, true}}, FigureType.L},
                        {4, new Boolean[][]{{false, false, false, true}, {true, true, true, true}}, new Boolean[][]{{false, false, false, true}, {true, true, true, true}}, FigureType.L}});

    }

    @ParameterizedTest
    @MethodSource("testValues")
    public void rotateMethodTest(int numberOfRotation, Boolean[][] startPosition, Boolean[][] endPosition, FigureType figureType) {
        Figure f = new Figure(startPosition, figureType);
        for (int i = 0; i < numberOfRotation; i++) {
            f.rotate();
        }
        Assert.assertEquals(endPosition, f.getPositionArray());
    }

}
