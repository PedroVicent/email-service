package com.vicent.emailservice.application;

import com.vicent.emailservice.adapters.EmailSenderGateway;
import com.vicent.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
}
