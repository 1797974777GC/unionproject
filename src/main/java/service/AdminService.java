package service;

import pojo.Admin;
import pojo.Message;

import java.util.List;

public interface AdminService {
    Admin Login(String aName, String aPwd);

    List<Message> showMessage();

    int addMessage(String message);
}
