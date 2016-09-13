package com.onebrain.usrbrain.domain.model.user;

import com.onebrain.usrbrain.domain.model.user.EmailAddress;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Jota on 12/09/2016.
 */
public class EmailAddressTest {

    EmailAddress emailOne;
    EmailAddress emailTwo;

    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {1,2,3},{2,2,2}
        });
    }

    @Before
    public void before(){
        EmailAddress emailOne = new EmailAddress("emailaddress@emailaddress.com");
        EmailAddress emailTwo = new EmailAddress("emailaddress@emailaddress.com");
    }

    @Test
    public void equalsWithSameAddressValue(){
        assertEquals(emailOne, emailTwo);


    }

}
