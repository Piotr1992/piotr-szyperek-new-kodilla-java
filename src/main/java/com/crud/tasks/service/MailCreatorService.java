package com.crud.tasks.service;

import com.crud.tasks.config.AdminConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailCreatorService {

    @Autowired
    private AdminConfig adminConfig;

    @Autowired
    @Qualifier("templateEngine")
    private TemplateEngine templateEngine;

    public String buildTrelloCardEmail(String message) {
        Context context = new Context();
        context.setVariable("message", adminConfig.getMessage());
        context.setVariable("tasks_url", "https://piotr1992.github.io/");
        context.setVariable("button", "Visit website");
        context.setVariable("preview_message", adminConfig.getPreviewMessage());
        context.setVariable("admin_name", adminConfig.getAdminName());
        context.setVariable("show_button", false);
        context.setVariable("is_friend", false);
        context.setVariable("recipient", adminConfig.getRecipient());
        context.setVariable("goodbye", adminConfig.getGoodbye());
        context.setVariable("companyDetails", adminConfig.getCompanyDetails());
        return templateEngine.process("mail/created-trello-card-mail", context);
    }

}