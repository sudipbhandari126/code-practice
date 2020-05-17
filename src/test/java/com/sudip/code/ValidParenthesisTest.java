package com.sudip.code;

import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisTest {
    private ValidParenthesis validParenthesis;

    @Before
    public void init(){
        validParenthesis=new ValidParenthesis();
    }


    @Test
    public void testSinglePairReturnsTrue(){
        assert validParenthesis.isValid("()")==true;
    }


    @Test
    public void testSingleBracket(){
        assert validParenthesis.isValid(")")==false;
    }

}