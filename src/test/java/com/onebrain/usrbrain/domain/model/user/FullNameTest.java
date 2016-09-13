package com.onebrain.usrbrain.domain.model.user;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jota on 13/09/2016.
 */
public class FullNameTest {

    private FullName fullNameOne;
    private FullName fullNameTwo;

    @Before
    public void before(){
        this.fullNameOne = new FullName("Jorge", "Buendia");
        this.fullNameTwo = new FullName("Jorge", "Buendia");
    }

    @Test
    public void equalsSameFullNameValue(){
        assertEquals(fullNameOne, fullNameTwo);
    }
}
