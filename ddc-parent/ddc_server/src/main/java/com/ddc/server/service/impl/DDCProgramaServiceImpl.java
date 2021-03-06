package com.ddc.server.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ddc.server.entity.DdcPrograma;
import com.ddc.server.mapper.DDCProgramaMapper;
import com.ddc.server.service.IDDCProgramaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dingpengfei
 * @since 2019-05-09
 */
@Service
public class DDCProgramaServiceImpl extends ServiceImpl<DDCProgramaMapper, DdcPrograma> implements IDDCProgramaService {
@Resource private DDCProgramaMapper programaMapper;

}
