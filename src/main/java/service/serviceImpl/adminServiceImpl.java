package service.serviceImpl;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
import pojo.AdminExample;
import service.adminService;

import java.util.List;
@Service
public class adminServiceImpl implements adminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin Login(String aName, String aPwd) {
        AdminExample example = new AdminExample();
        example.createCriteria().andAPwdEqualTo(aPwd).andAAccountEqualTo(aName);
        List<Admin> admins = adminMapper.selectByExample(example);
        return admins.get(0);
    }
}
