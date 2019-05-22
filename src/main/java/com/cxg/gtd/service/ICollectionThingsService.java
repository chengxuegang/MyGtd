package com.cxg.gtd.service;

import com.cxg.gtd.entity.CollectionThings;
import com.cxg.gtd.entity.User;

import java.util.List;

public interface ICollectionThingsService {
    /*获得人员的收集列表*/
    List<CollectionThings> getCollectionThings(User user);
}
