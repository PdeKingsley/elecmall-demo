package com.example.elecsecurity.service;

import com.example.elecsecurity.entity.UserAccount;

import java.util.List;

/**
 * user_account表服务接口
 *
 * @author wd
 */
public interface UserAccountService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAccount queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAccount> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userAccount 实例对象
     * @return 实例对象
     */
    UserAccount insert(UserAccount userAccount);

    /**
     * 修改数据
     *
     * @param userAccount 实例对象
     * @return 实例对象
     */
    UserAccount update(UserAccount userAccount);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    UserAccount selectByName(String userName);
}
