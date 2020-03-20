package com.hurusea.gmall.user.service.impl;

import com.hurusea.gmall.bean.UmsMember;
import com.hurusea.gmall.bean.UmsMemberName;
import com.hurusea.gmall.bean.UmsMemberReceiveAddress;
import com.hurusea.gmall.user.mapper.UmsMemberNameMapper;
import com.hurusea.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.hurusea.gmall.user.mapper.UserMapper;
import com.hurusea.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @hurusea
 * @create2020-03-19 16:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Autowired
    UmsMemberNameMapper umsMemberNameMapper;

    @Override
    public List<UmsMember> getAllUsers() {
        List<UmsMember> umsMemberList =userMapper.selectAll();//userMapper.selectAllUsers();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =
                umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }

    @Override
    public List<UmsMemberName> getAllUserName() {

        List<UmsMemberName> umsMemberName =umsMemberNameMapper.selectAll();
        return umsMemberName;
    }

    @Override
    public void insertUser() {
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("hurusea");
        userMapper.insert(umsMember);
    }

    @Override
    public void deleteUser() {
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername("hurusea");
        userMapper.delete(umsMember);
    }
}
