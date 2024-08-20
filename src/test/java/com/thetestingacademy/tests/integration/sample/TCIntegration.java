package com.thetestingacademy.tests.integration;

import com.thetestingacademy.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class TCIntegrationFlow extends BaseTest {

    // Create A Booking, Create a Token
    // Get booking
    // Update the Booking
    // Delete the Booking

    @Test(groups = "integration", priority = 1)
    @Owner("Raviteja")
    @Description("TC#INT1 - Step 1: Verify that the Booking can be Created")
    public void testCreateBooking(){


    }

    @Test(groups = "integration", priority = 2)
    @Owner("Raviteja")
    @Description("TC#INT1 - Step 2: Verify that the Booking By ID")
    public void testVerifyBookingId(){

    }

    @Test(groups = "integration", priority = 3)
    @Owner("Raviteja")
    @Description("TC#INT1 - Step 3. Verify Updated Booking by ID")
    public void testUpdateBookingById(){

    }

    @Test(groups = "integration", priority = 4)
    @Owner("Raviteja")
    @Description("TC#INT1 - Step 4. Delete the Booking by ID")
    public void testDeleteBookingById(){

    }

}
