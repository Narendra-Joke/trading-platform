package com.root.service;

import com.root.model.PaymentDetails;
import com.root.model.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(
            String accountNumber,
            String accountHolderName,
            String ifscCode,
            String bankName,
            User user);

    public PaymentDetails getUserPaymentDetails(User user);
}
