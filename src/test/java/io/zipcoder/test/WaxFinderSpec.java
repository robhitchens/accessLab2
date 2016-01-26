package io.zipcoder.test;

import io.zipcoder.WaxFinder;
import io.zipcoder.Wax;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class WaxFinderSpec {
    @Test
    public void getWaxTypeReturnNotNull(){
        WaxFinder finderTest = new WaxFinder(24, "firm"); // constructor calls createWax to find specified wax type
        Wax returnedWax = finderTest.getWaxType();
        assertNotNull("returnedWax should not be equal to null: ", returnedWax);

    }
}
