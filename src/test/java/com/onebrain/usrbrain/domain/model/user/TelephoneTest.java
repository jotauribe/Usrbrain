package com.onebrain.usrbrain.domain.model.user;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jota on 13/09/2016.
 */
public class TelephoneTest {

    private Telephone telephoneOne;
    private Telephone telephoneTwo;

    @Before
    public void before(){
        this.telephoneOne = new Telephone("000653456");
        this.telephoneTwo = new Telephone("000653456");
    }

    @Test
    public void equalsSameNumberValue(){
        assertEquals(telephoneOne, telephoneTwo);
    }
}
