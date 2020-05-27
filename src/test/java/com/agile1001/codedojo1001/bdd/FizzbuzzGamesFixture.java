package com.agile1001.codedojo1001.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class FizzbuzzGamesFixture extends BaseFixture {


    public FizzBuzzNumber given(Integer number) {
        return  new FizzBuzzNumber(number);
    }
}
