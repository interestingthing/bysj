package bysj.service;


import bysj.domain.po.SearchhistoryPO;
import bysj.domain.po.SearchhistoryPO;
import bysj.domain.vo.PageResult;

import java.util.List;

/**
 * 服务层接口
 */
public interface SearchhistoryService {

    /**
     * 返回全部列表
     *
     * @return
     */
    List<SearchhistoryPO> findAll();


    /**
     * 返回分页列表
     *
     * @return
     */
    PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    void add(SearchhistoryPO searchhistoryPO);


    /**
     * 修改
     */
    void update(SearchhistoryPO searchhistoryPO);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    SearchhistoryPO findOne(Long id);


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
    PageResult findPage(SearchhistoryPO searchhistoryPO, int pageNum, int pageSize);

    SearchhistoryPO findUserByUsernameAndPassword(SearchhistoryPO searchhistoryPO);
}
