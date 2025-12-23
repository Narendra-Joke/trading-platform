package com.root.service;

import com.root.domain.VerificationType;
import com.root.model.ForgotPasswordToken;
import com.root.model.User;

public interface ForgotPasswordService {
    ForgotPasswordToken createToken(User user,
                                    String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken forgotPasswordToken);
}
