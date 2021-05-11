package com.crud.tasks.scheduler;

import com.crud.tasks.config.AdminConfig;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.service.SimpleEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailScheduler {

    private final SimpleEmailService simpleEmailService;
    private final TaskRepository taskRepository;
    private final AdminConfig adminConfig;

    //    private static final String SUBJECT = "Tasks: Once a day email";
    private static final String SUBJECT = "";



    //    @Scheduled(fixedDelay = 1000)
    public void sendInformationEmail() {
        long size = taskRepository.count();
        simpleEmailService.send(
                new Mail(
                        adminConfig.getAdminMail(),
                        "abcd",
                        SUBJECT,
                        "Currently in database you got: " + size + ( (size == 1) ? " task" : " tasks" )
                )
        );
    }

    @Scheduled(fixedDelay = 1000)
    public void sendInformationEmailOnceDay() {
        long size = taskRepository.count();
        simpleEmailService.sendOnceDay(
                new Mail(
                        adminConfig.getAdminMail(),
                        adminConfig.getRecipient(),
                        adminConfig.getPreviewMessage(),
                        "Currently in database you got: " + size + ( (size == 1) ? " task" : " tasks"
                        )
                )
        );
    }

}