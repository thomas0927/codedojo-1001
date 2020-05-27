package com.agile1001.codedojo1001.bdd;


public class FizzBuzzNumber {
    private Integer number;

    public FizzBuzzNumber(Integer number) {
        this.number=number;
    }

    public String answer(){
        String fizzBuzzAnser="";
        fizzBuzzAnser+=givenFizzAnswer(3, "Fizz");
        fizzBuzzAnser+=givenFizzAnswer(5, "Buzz");
        if(fizzBuzzAnser.length()>0)return fizzBuzzAnser;
        return String.valueOf(number);
    }

    private String givenFizzAnswer(int i, String fizz) {
        if (isDivBy(i)) {
            return fizz;
        } else {
            return  "";
        }
    }

    private boolean isDivBy(int i) {
        return number % i == 0;
    }
}
