package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AdminConfig {
    @Value("${admin.mail}")
    private String adminMail;

    @Value("Ustalenie terminu spotkania biznesowego.")
    private String previewMessage;

    @Value("Ewa Nowak")
    private String adminName;

    @Value("Jan Kowalski")
    private String recipient;

    @Value("Wiadomość .... !")
    private String message;

    @Value("Pozdrawiam Janek")
    private String goodbye;

    @Value("Wrażliwe dane firmy!")
    private String companyDetails;
}