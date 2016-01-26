package io.zipcoder.test;

/**
 * Created by roberthitchens3 on 1/25/16.
 */
import io.zipcoder.Wax;
import org.junit.Test;
import static org.junit.Assert.*;
public class SpecWax {
    Wax wax = new Wax();
    @Test
    public void testGetWaxGroup(){
        wax.setWaxGroup("Yellow");
        assertNotNull("returned wax group should not be null: ",wax.getWaxGroup());
    }
    @Test
    public void testGetSnowCondition() {
        wax.setSnowCondition("Special");
        assertNotNull("returned snow condition should not be null: ",wax.getSnowCondition() );
    }
}
