package com.muthu.weekdays;

public enum Weekdays {
    Monday("spaghetti"),
    Tuesday("tacos"),
    Wednesday("chicken"),
    Thursday("meatloaf"),
    Friday("hamburgers"),
    Saturday("pizza"),
    Sunday("pot roast");

    private String meal;
    Weekdays(String meal){
        this.meal = meal;
    }

    public String getMeal(){
        return this.meal;
    }

}
