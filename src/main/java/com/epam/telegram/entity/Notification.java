package com.epam.telegram.entity;

//import com.vdurmont.emoji.EmojiParser;

import java.util.Objects;

public class Notification {

    private long notificationId;
    private String name;
    private String author;
    private int complexity;
    private String description;
    private boolean isSend;
   private int allowableAttempts = 5;

    public Notification(Builder builder) {

        this.notificationId = builder.notificationId;
        this.name = builder.name;
        this.author = builder.author;
        this.complexity = builder.complexity;
        this.description = builder.description;
        this.allowableAttempts = builder.allowableAttempts;
    }

    public long getNotificationId() {
        return notificationId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getComplexity() {
        return complexity;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }

    public int getAllowableAttempts() {
        return allowableAttempts;
    }

    @Override
    public String toString() { //todo: is it ok to format notification in toString()? and add emojis here??
    //    String smile_emoji = EmojiParser.parseToUnicode(":fire: ");
        final StringBuilder sb = new StringBuilder("->");
        sb.append(author);
        sb.append(" создал курс ").append(name);
        sb.append(" со сложностью ").append(complexity).append("\n");
        sb.append(description == null ? "" : description);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return notificationId == that.notificationId
                && complexity == that.complexity
                && isSend == that.isSend
                && allowableAttempts == that.allowableAttempts
                && name.equals(that.name)
                && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, name, complexity, description, isSend, allowableAttempts);
    }

    public static class Builder {
        private long notificationId;
        private String name;
        private String author;
        private int complexity;
        private String description;
        private int allowableAttempts;


        public Builder setNotificationId(long notificationId) {
            this.notificationId = notificationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setComplexity(int complexity) {
            this.complexity = complexity;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAllowableAttempts(int allowableAttempts) {
            this.allowableAttempts = allowableAttempts;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }
}
