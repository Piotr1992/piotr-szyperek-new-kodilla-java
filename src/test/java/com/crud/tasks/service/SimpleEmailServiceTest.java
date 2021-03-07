package com.crud.tasks.service;

import com.crud.tasks.domain.Mail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Optional;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SimpleEmailServiceTest {

    @InjectMocks
    private SimpleEmailService simpleEmailService;

    @Mock
    private JavaMailSender javaMailSender;

    @Test
    public void shouldSendEmail() {
        //Given
        Mail mail = new Mail("test@test.com", "", "Test", "Test Message");
//        Mail mail = new Mail("test@test.com", "testCc@testCc.com", "Test", "Test Message");

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        Optional<Mail> optionalMail = Optional.of(mail)
                .filter(a->a.getToCc().isEmpty());

        if( optionalMail.isPresent() ) {
            System.out.println("IF");
            mailMessage.setTo(mail.getMailTo());
//            mailMessage.setCc(mail.getToCc());
            mailMessage.setSubject(mail.getSubject());
            mailMessage.setText(mail.getMessage());
        } else {
            System.out.println("ELSE");
            mailMessage.setTo(mail.getMailTo());
            mailMessage.setCc(mail.getToCc());
            mailMessage.setSubject(mail.getSubject());
            mailMessage.setText(mail.getMessage());
        }

/*        mailMessage.setTo(mail.getMailTo());
        mailMessage.setCc(mail.getToCc());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mail.getMessage());         */

        System.out.println("-> " + mail.getMailTo());
        System.out.println("-> " + mail.getToCc());
        System.out.println("-> " + mail.getSubject());
        System.out.println("-> " + mail.getMessage());

        //When
        simpleEmailService.send(mail);

        //Then
        verify(javaMailSender, times(1)).send(mailMessage);
    }
}