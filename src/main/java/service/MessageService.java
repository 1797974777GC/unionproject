package service;

import pojo.Message;

import java.util.List;

public interface MessageService {
    Boolean addmessage(String mMessage, Integer uid);

    List<Message> showNews();
}
