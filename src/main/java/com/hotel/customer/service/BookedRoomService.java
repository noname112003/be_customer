package com.hotel.customer.service;


import com.hotel.customer.model.dto.response.HistoryBooking;
import com.hotel.customer.model.entity.Booked_room;
import jakarta.mail.MessagingException;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

public interface BookedRoomService {
    Booked_room bookRoom(Long roomId, Long customerId, Date checkinDate, Date checkoutDate) throws MessagingException, UnsupportedEncodingException;
    List<HistoryBooking> getHistoryByUserId(Long userId);
}
