package bysj.service;


import bysj.domain.po.RestaurantPO;
import bysj.domain.vo.PageResult;

import java.util.List;

/**
 * 服务层接口
 */
public interface RestaurantService {

    /**
     * 返回全部列表
     *
     * @return
     */
    List<RestaurantPO> findAll();


    /**
     * 返回分页列表
     *
     * @return
     */
    PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    void add(RestaurantPO restaurantPO);


    /**
     * 修改
     */
    void update(RestaurantPO restaurantPO);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    RestaurantPO findOne(Long id);


    /**
     * 批量删除
     *
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页码
     * @param pageSize 每页记录数
     * @return
     */
    PageResult findPage(RestaurantPO restaurantPO, int pageNum, int pageSize);

    RestaurantPO findUserByUsernameAndPassword(RestaurantPO restaurantPO);

    List<RestaurantPO> findUserByRestaurantName(String restaurantName);
}
