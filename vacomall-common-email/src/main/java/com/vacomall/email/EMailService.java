package com.vacomall.email;

/**
 * Created by Administrator on 2016/3/21.
 */
public interface EMailService {
    void threadSend(MailParam mailParam);

    /**
     * 发送邮件
     */
    void send(MailParam mailParam);
}
