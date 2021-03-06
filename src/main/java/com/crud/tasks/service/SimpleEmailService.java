package com.crud.tasks.service;

import com.crud.tasks.domain.Mail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import com.crud.tasks.repository.TaskRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleEmailService {

    private final JavaMailSender javaMailSender;

    @Autowired
    private MailCreatorService mailCreatorService;

    private final TaskRepository taskRepository;

    public void send(final Mail mail) {
        log.info("Starting email preparation...");
        try {
            MimeMessagePreparator mailMessageOnceDay = createMimeMessageOnceDay(mail);
            javaMailSender.send(mailMessageOnceDay);
            log.info("Email has been sent.");
        } catch (MailException e) {
            log.error("Failed to process email sending: " + e.getMessage(), e);
        }
    }

    public void sendOnceDay(final Mail mail) {
        log.info("Starting email preparation...");
        try {
            long size = taskRepository.count();
            String messagetext = "Currently in database you got: " + size + ( (size == 1) ? " task" : " tasks");
            MimeMessagePreparator mailMessageOnceDay = createMimeMessageOnceDay(new Mail(mail.getMail(), mail.getCC(), mail.getSubject(), messagetext));
            javaMailSender.send(mailMessageOnceDay);
            log.info("Email has been sent.");
        } catch (MailException e) {
            log.error("Failed to process email sending: " + e.getMessage(), e);
        }
    }

    private MimeMessagePreparator createMimeMessageOnceDay(final Mail mail) {
        return mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setTo(mail.getMail());
            messageHelper.setSubject(mail.getSubject());
            messageHelper.setText(mailCreatorService.onceDayCountTasksEmail(mail.getMessage()), true);
        };
    }

    private SimpleMailMessage createMailMessageOnceDay(final Mail mail) {
        long size = taskRepository.count();
        String messagetext = "Currently in database you got: " + size + ( (size == 1) ? " task" : " tasks").toString();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(mail.getMail());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mailCreatorService.onceDayCountTasksEmail(messagetext));
        return mailMessage;
    }
}