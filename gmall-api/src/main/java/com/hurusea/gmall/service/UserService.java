package com.hurusea.gmall.service;

import com.hurusea.gmall.bean.UmsMemberReceiveAddress;
import com.hurusea.gmall.bean.UmsMember;
import com.hurusea.gmall.bean.UmsMemberName;

import java.util.List;

/**
 * @hurusea
 * @create2020-03-19 16:02
 */
public interface UserService {
    List<UmsMember> getAllUsers();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    List<UmsMemberName> getAllUserName();

    void insertUser();

    void deleteUser();
}
