package com.crud.tasks.service;

import com.crud.tasks.config.AdminConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.ArrayList;
import java.util.List;

@Service
public class MailCreatorService {

    @Autowired
    private AdminConfig adminConfig;

    @Autowired
    @Qualifier("templateEngine")
    private TemplateEngine templateEngine;

    public String buildTrelloCardEmail(String message) {
        List<String> functionality = new ArrayList<>();
        functionality.add("You can manage your tasks");
        functionality.add("Provides connection with Trello Account");
        functionality.add("Application allows sending tasks to Trello");

        Context context = new Context();
        context.setVariable("message", adminConfig.getMessage());
        context.setVariable("tasks_url", "https://piotr1992.github.io/");
        context.setVariable("button", "Visit website");
        context.setVariable("preview_message", adminConfig.getPreviewMessage());
        context.setVariable("admin_name", adminConfig.getAdminName());
        context.setVariable("show_button", false);
        context.setVariable("is_friend", true);
        context.setVariable("admin_config", adminConfig);
        context.setVariable("recipient", adminConfig.getRecipient());
        context.setVariable("goodbye", adminConfig.getGoodbye());
        context.setVariable("companyDetails", adminConfig.getCompanyDetails());
        context.setVariable("application_functionality", functionality);
        return templateEngine.process("mail/created-trello-card-mail", context);
    }

    public String onceDayCountTasksEmail(String message) {
        List<String> functionality = new ArrayList<>();
        functionality.add("to prepare template fo email");
        functionality.add("sending an e-mail at a specified time");
        functionality.add("e-mail display count tasks in database");

        Context context = new Context();
        context.setVariable("message", message);
        context.setVariable("tasks_url", "https://piotr1992.github.io/");
        context.setVariable("button", "Visit website");
        context.setVariable("preview_message", adminConfig.getPreviewMessage());
        context.setVariable("admin_name", adminConfig.getAdminName());
        context.setVariable("show_button", false);
        context.setVariable("is_friend", true);
        context.setVariable("admin_config", adminConfig);
        context.setVariable("recipient", adminConfig.getRecipient());
        context.setVariable("goodbye", adminConfig.getGoodbye());
        context.setVariable("companyDetails", adminConfig.getCompanyDetails());
        context.setVariable("application_functionality", functionality);
        return templateEngine.process("mail/once-day-mail", context);
    }

}