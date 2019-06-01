package com.ssm.realm;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class Realm extends AuthorizingRealm {
    @Autowired
     private UserService userService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String account = (String) authenticationToken.getPrincipal();
        User user = userService.queryUserByaccount(account);
        if(user==null){
            throw new UnknownAccountException("没有该用户");
        }
        ByteSource bytes = ByteSource.Util.bytes("1231~!@##%$RT!@#@/.%#$@");

        return new SimpleAuthenticationInfo(user.getuAccount(),user.getuPwd(),bytes,this.getName());
    }
}
