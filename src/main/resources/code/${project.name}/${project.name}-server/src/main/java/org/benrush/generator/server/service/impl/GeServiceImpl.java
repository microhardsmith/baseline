package org.benrush.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.benrush.server.persistence.mapper.GeMapper;
import org.benrush.server.persistence.po.GePo;
import org.benrush.server.service.defination.GeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("geService")
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class GeServiceImpl extends ServiceImpl<GeMapper, GePo> implements GeService {

}
