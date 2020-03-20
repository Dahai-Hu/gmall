package com.hurusea.gmall.user.mapper;

import com.hurusea.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @hurusea
 * @create2020-03-19 16:02
 */

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUsers();
}
