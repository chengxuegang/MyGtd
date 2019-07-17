package com.cxg.gtd.service.impl;

import com.cxg.gtd.dao.CollectionThingsMapper;
import com.cxg.gtd.entity.CollectionThings;
import com.cxg.gtd.entity.CollectionThingsExample;
import com.cxg.gtd.entity.User;
import com.cxg.gtd.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollectionsServiceImpl implements CollectionsService {
    @Autowired
    CollectionThingsMapper collectionsMapper;


    @Override
    public List<CollectionThings> getCollectionThings(User user) {
        System.out.println("=========================");
        CollectionThingsExample example = new CollectionThingsExample();
        example.or().andOwnerEqualTo(user.getUserId());
        List<CollectionThings> things = collectionsMapper.selectByExample(example);
        return things;
    }
}
