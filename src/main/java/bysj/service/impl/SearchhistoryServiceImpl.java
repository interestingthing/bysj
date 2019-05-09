package bysj.service.impl;

import bysj.dao.mapper.SearchhistoryPOMapper;
import bysj.domain.po.SearchhistoryPO;
import bysj.domain.vo.PageResult;
import bysj.service.SearchhistoryService;

import javax.annotation.Resource;
import java.util.List;

public class SearchhistoryServiceImpl implements SearchhistoryService {

    @Resource
    SearchhistoryPOMapper searchhistoryPOMapper;

    @Override
    public List<SearchhistoryPO> findAll() {
        return null;
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public void add(SearchhistoryPO searchhistoryPO) {

    }

    @Override
    public void update(SearchhistoryPO searchhistoryPO) {

    }

    @Override
    public SearchhistoryPO findOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long[] ids) {

    }

    @Override
    public PageResult findPage(SearchhistoryPO searchhistoryPO, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public SearchhistoryPO findUserByUsernameAndPassword(SearchhistoryPO searchhistoryPO) {
        return null;
    }
}
