package com.agile1001.codedojo1001.bdd;

public class FizzBuzzNumber {
    private Integer number;

    public FizzBuzzNumber(Integer number) {
        this.number=number;
    }

    public String answer(){
        if(number % 3==0) return "Fizz";
        return String.valueOf(number);
    }
}
