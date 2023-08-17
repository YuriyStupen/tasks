package org.stupen.tasks.service;

import org.stupen.tasks.domain.MailType;
import org.stupen.tasks.domain.user.User;

import java.util.Properties;

public interface MailService {

    void sendEmail(User user, MailType type, Properties params);

}
