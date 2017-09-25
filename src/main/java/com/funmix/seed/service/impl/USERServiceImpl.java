package com.funmix.seed.service.impl;

import com.funmix.seed.dao.USERMapper;
import com.funmix.seed.model.USER;
import com.funmix.seed.service.USERService;
import com.funmix.seed.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/25.
 */
@Service
@Transactional
public class USERServiceImpl extends AbstractService<USER> implements USERService {
    @Resource
    private USERMapper tuserMapper;

}
