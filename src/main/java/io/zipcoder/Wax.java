package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Wax {
    private String waxGroup;
    private String snowCondition;

    public void setWaxGroup(String color){waxGroup = color;}
    public void setSnowCondition(String snow){
        snowCondition = snow;
    }
    public String getWaxGroup(){return waxGroup;}
    public String getSnowCondition(){return snowCondition;}
}
