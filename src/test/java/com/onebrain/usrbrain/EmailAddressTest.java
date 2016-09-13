package com.onebrain.usrbrain;

import com.onebrain.usrbrain.domain.model.user.EmailAddress;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Jota on 12/09/2016.
 */
public class EmailAddressTest {

    EmailAddress emailOne;
    EmailAddress emailTwo;

    @Before
    public void beforeAll(){
        EmailAddress emailOne = new EmailAddress("emailaddress@emailaddress.com");
        EmailAddress emailTwo = new EmailAddress("emailaddress@emailaddress.com");
    }

    @Test
    public void equalsWithSameValueObjectTest(){
        assertEquals(emailOne, emailTwo);


    }

}
