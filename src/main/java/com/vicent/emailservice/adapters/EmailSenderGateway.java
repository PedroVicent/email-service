package com.vicent.emailservice.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
