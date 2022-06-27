package com.luwei.system.domain.convert;

import com.luwei.system.domain.AppRole;
import com.luwei.system.domain.dto.AppRoleDTO;
import com.luwei.system.domain.vo.AppRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * 角色信息表 Convert
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Mapper(componentModel = "spring")
public interface AppRoleConvert {

    AppRoleConvert INSTANCE = Mappers.getMapper(AppRoleConvert.class);

    AppRoleDTO beanConvertDto(AppRole appRole);

    AppRoleVO beanConvertVo(AppRole appRole);

    AppRole dtoConvertBean(AppRoleDTO appRoleDTO);

    AppRole voConvertBean(AppRoleVO appRoleVO);

    List<AppRoleVO> beansConvertVos(List<AppRoleVO> appRoleList);

    List<AppRoleDTO> beansConvertDtos(List<AppRole> appRoleList);

    List<AppRole> dtosConvertBeans(List<AppRoleDTO> appRoleDTOList);

    List<AppRole> vosConvertBeans(List<AppRoleVO> appRoleVOList);
}