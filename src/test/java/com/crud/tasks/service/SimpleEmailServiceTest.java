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
        Mail mail = new Mail.MailBuilder()
                .toMail("test@test.com")
                .ccTo(null)
                .toSubject("Test")
                .toMessage("Test Message")
                .build();

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        Optional<SimpleMailMessage> optionalMail = Optional.ofNullable(mailMessage);

        if ( optionalMail.isPresent() ) {

            mailMessage.setTo(mail.getMail());
            mailMessage.setCc(mail.getCC());
            mailMessage.setSubject(mail.getSubject());
            mailMessage.setText(mail.getMessage());

        }

        //When
        simpleEmailService.send(mail);

        //Then
        verify(javaMailSender, times(1)).send(mailMessage);
    }

}