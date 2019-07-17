package com.cxg.gtd.dao;

import com.cxg.gtd.entity.CollectionThings;
import com.cxg.gtd.entity.CollectionThingsExample;
import java.util.List;

public interface CollectionThingsMapper {
    int insert(CollectionThings record);

    int insertSelective(CollectionThings record);

    List<CollectionThings> selectByExample(CollectionThingsExample example);
}