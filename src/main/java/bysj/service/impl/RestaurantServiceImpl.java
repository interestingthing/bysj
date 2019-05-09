package bysj.service.impl;


import bysj.dao.mapper.RestaurantPOMapper;
import bysj.domain.po.RestaurantPO;
import bysj.domain.po.RestaurantPOExample;
import bysj.domain.vo.PageResult;
import bysj.service.RestaurantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务实现层
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RestaurantServiceImpl implements RestaurantService {

    @Resource
    private RestaurantPOMapper restaurantPOMapper;

    @Override
    public List<RestaurantPO> findAll() {
        return null;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public void add(RestaurantPO restaurantPO) {

    }

    @Override
    public void update(RestaurantPO restaurantPO) {

    }

    @Override
    public RestaurantPO findOne(Long id) {
        return restaurantPOMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public PageResult findPage(RestaurantPO restaurantPO, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public RestaurantPO findUserByUsernameAndPassword(RestaurantPO restaurantPO) {
        return null;
    }

    @Override
    public List<RestaurantPO> findUserByRestaurantName(String restaurantName) {
        RestaurantPOExample restaurantPOExample = new RestaurantPOExample();
        RestaurantPOExample.Criteria criteria = restaurantPOExample.createCriteria();
        criteria.andNameLike("%" + restaurantName + "%");
        return restaurantPOMapper.selectByExample(restaurantPOExample);
    }
}
