package com.crud.tasks.domain;

public class Mail {

    private final String mailTo;
    private final String toCc;
    private final String subject;
    private final String message;

    public static class MailBuilder {

        private String mailTo;
        private String toCc;
        private String subject;
        private String message;

        public MailBuilder toMail(String mailTo) {
            this.mailTo = mailTo;
            return this;
        }

        public MailBuilder ccTo(String toCc) {
            this.toCc = toCc;
            return this;
        }

        public MailBuilder toSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public MailBuilder toMessage(String message) {
            this.message = message;
            return this;
        }

        public Mail build() {
            return new Mail(mailTo, toCc, subject, message);
        }
    }

    public Mail(final String mailTo, final String toCc, final String subject, final String message) {
        this.mailTo = mailTo;
        this.toCc = toCc;
        this.subject = subject;
        this.message = message;
    }

    public String getMail() {
        return mailTo;
    }

    public String getCC() {
        return toCc;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailTo='" + mailTo + '\'' +
                ", toCc='" + toCc + '\'' +
                ", subject=" + subject + '\'' +
                ", message=" + message + '\'' +
                '}';
    }
}