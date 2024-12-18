package com.hotel.customer.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRoomRequest {
    private Long roomId;
    private String email;
    private Date checkinDate;
    private Date checkoutDate;
}