package com.crud.tasks.domain;

public class Mail {

    private final String mailTo;
    private final String toCc;
    private final String subject;
    private final String message;
//    private final String sentDate;

    public static class MailBuilder {

        private String mailTo;
        private String toCc;
        private String subject;
        private String message;
//        private String sentDate;

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

/*        public MailBuilder toSentDate(String sentDate) {
            this.sentDate = sentDate;
            return this;
        }           */

        public Mail build() {
            return new Mail(mailTo, toCc, subject, message); //     , sentDate);
        }
    }

    public Mail(final String mailTo, final String toCc, final String subject, final String message) {   //  , final String sentDate) {
        this.mailTo = mailTo;
        this.toCc = toCc;
        this.subject = subject;
        this.message = message;
//        this.sentDate = sentDate;
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

/*    public Date getSentDate() {
        return sentDate;
    }       */

    @Override
    public String toString() {
        return "Mail{" +
                "mailTo='" + mailTo + '\'' +
                ", toCc='" + toCc + '\'' +
                ", subject=" + subject + '\'' +
                ", message=" + message + '\'' +
//                ", sent date=" + sentDate + '\'' +
                '}';
    }
}