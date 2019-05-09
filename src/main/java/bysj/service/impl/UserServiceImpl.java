package bysj.service.impl;


import bysj.dao.mapper.UserPOMapper;
import bysj.domain.po.UserPO;
import bysj.domain.po.UserPOExample;
import bysj.domain.vo.PageResult;
import bysj.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserPOMapper userPOMapper;

    /**
     * 增加
     */
    @Override
    public void add(UserPO user) {
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));//密码加密

        userPOMapper.insert(user);
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public UserPO findUserByUsernameAndPassword(UserPO user) {
        UserPOExample userPOExample = new UserPOExample();
        UserPOExample.Criteria criteria = userPOExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername())
                .andPasswordEqualTo(DigestUtils.md5Hex(user.getPassword()));
        List<UserPO> userPOS = userPOMapper.selectByExample(userPOExample);
        if (userPOS != null && !userPOS.isEmpty())
            return userPOS.get(0);
        return null;
    }

    /**
     * 查询全部
     */
    @Override
    public List<UserPO> findAll() {
        return userPOMapper.selectByExample(null);

    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<UserPO> page = (Page<UserPO>) userPOMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }


    /**
     * 修改
     */
    @Override
    public void update(UserPO user) {
        userPOMapper.updateByPrimaryKey(user);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public UserPO findOne(Long id) {
        return userPOMapper.selectByPrimaryKey(id.intValue());
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            userPOMapper.deleteByPrimaryKey(id.intValue());
        }
    }


    @Override
    public PageResult findPage(UserPO user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        UserPOExample example = new UserPOExample();
        UserPOExample.Criteria criteria = example.createCriteria();

        if (user != null) {
            if (user.getUsername() != null && user.getUsername().length() > 0) {
                criteria.andUsernameLike("%" + user.getUsername() + "%");
            }
            if (user.getPassword() != null && user.getPassword().length() > 0) {
                criteria.andPasswordLike("%" + user.getPassword() + "%");
            }


        }

        Page<UserPO> page = (Page<UserPO>) userPOMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }


}
