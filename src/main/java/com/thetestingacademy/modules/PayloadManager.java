package com.thetestingacademy.modules;

import com.google.gson.Gson;
import com.thetestingacademy.pojos.Booking;
import com.thetestingacademy.pojos.BookingDates;
import com.thetestingacademy.pojos.BookingResponse;

public class PayloadManager {

    Gson gson;

    public String createPayloadBookingAsString() {
        Booking booking = new Booking();
        booking.setFirstname("Raviteja");
        booking.setLastname("BJ");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        gson = new Gson();
        String jsonPayload = gson.toJson(booking);
        return jsonPayload;
    }

    public String fullUpdatePayloadBookingAsString(){
        Booking booking = new Booking();
        booking.setFirstname("Kiran");
        booking.setLastname("RD");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        return  gson.toJson(booking);
    }

    public BookingResponse bookingResponseJava(String responsString){
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responsString,BookingResponse.class);
        return bookingResponse;
    }
}

