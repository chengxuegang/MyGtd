package com.cxg.gtd.service;

import com.cxg.gtd.entity.CollectionThings;
import com.cxg.gtd.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CollectionsService {

    List<CollectionThings> getCollectionThings(User user);
}
