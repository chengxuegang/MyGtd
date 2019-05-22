package com.cxg.gtd.controller;

import com.cxg.gtd.entity.CollectionThings;
import com.cxg.gtd.service.ICollectionThingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Index {
    @Autowired
    ICollectionThingsService collectionService ;
    public List<CollectionThings> getCollectionThings(){
        return null;
    }

}
