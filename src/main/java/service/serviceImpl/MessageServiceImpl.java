package service.serviceImpl;

import mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Message;
import service.MessageService;

import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public Boolean addmessage(String mMessage, Integer uid) {
        Message message = new Message();
        message.setmMessage(mMessage);
        message.setmDate(new Date());
        message.setmFlag(1);
        message.setuId(uid);
        int i = messageMapper.insertSelective(message);
        return i>0;
    }

    @Override
    public List<Message> showNews() {
        List<Message> list= messageMapper.selectNews();
        return list;
    }
}
