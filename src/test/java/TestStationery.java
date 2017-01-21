import org.junit.Test;
import stationary.JuniorSet;
import stationary.MiddleSet;
import stationary.SeniorSet;
import stationary.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Lisica on 17.01.2017.
 */
public class TestStationery {

    @Test
    public void testJunior() {
        Set juniorSet = new JuniorSet();
        WorkPlace employeeOne = new WorkPlace(juniorSet);

        assertEquals(160, employeeOne.sumOfStationery());
    }

    @Test
    public void testMiddle() {

        Set middleSet = new MiddleSet();
        WorkPlace employeeTwo = new WorkPlace(middleSet);

        assertEquals(930, employeeTwo.sumOfStationery());
    }

    @Test
    public void testSenior() {
        Set seniorSet = new SeniorSet();
        WorkPlace employeeThree = new WorkPlace(seniorSet);

        assertEquals(1510, employeeThree.sumOfStationery());
    }
    }

