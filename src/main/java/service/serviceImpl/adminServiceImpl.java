package service.serviceImpl;

import mapper.AdminMapper;
import mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
import pojo.AdminExample;
import pojo.Message;
import pojo.MessageExample;
import service.AdminService;

import java.util.List;
@Service
public class adminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
   private MessageMapper messageMapper;
    @Override
    public Admin Login(String aName, String aPwd) {
        AdminExample example = new AdminExample();
        example.createCriteria().andAPwdEqualTo(aPwd).andAAccountEqualTo(aName);
        List<Admin> admins = adminMapper.selectByExample(example);
        return admins.get(0);
    }

    @Override
    public List<Message>  showMessage() {
        MessageExample example = new MessageExample();
        example.createCriteria().andMFlagEqualTo(2);
        List<Message> messages = messageMapper.selectByExample(example);
        for (Message m:messages){
            messageMapper.deleteByPrimaryKey(m.getmId());
        }
        return messages;
    }

    @Override
    public int addMessage(String message) {
        Message message1 = new Message();
        message1.setmMessage(message);
        message1.setmFlag(2);
        int insert = messageMapper.insert(message1);
        return insert;
    }
}
