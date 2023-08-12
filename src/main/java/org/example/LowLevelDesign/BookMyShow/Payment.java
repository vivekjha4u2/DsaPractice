package org.example.LowLevelDesign.BookMyShow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    private String paymentId;
    private PaymentStatus paymentStatus;
}
