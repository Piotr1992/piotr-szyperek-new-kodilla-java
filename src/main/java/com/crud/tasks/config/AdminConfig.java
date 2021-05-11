package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.crud.tasks.repository.TaskRepository;

@Component
@Getter
public class AdminConfig {

    private TaskRepository taskRepository;

    @Value("${admin.mail}")
    private String adminMail;

    @Value("Ustalenie terminu spotkania biznesowego.")
    private String previewMessage;

    @Value("${admin.name}")
    private String adminName;

    @Value("Jan Kowalski")
    private String recipient;

    @Value()
    private String message;

    @Value("Pozdrawiam Janek")
    private String goodbye;

    @Value("Wrażliwe dane firmy!")
    private String companyDetails;
}