package com.luwei.system.domain.convert;

import com.luwei.system.domain.AppUserRole;
import com.luwei.system.domain.dto.AppUserRoleDTO;
import com.luwei.system.domain.vo.AppUserRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * app用户角色关联表 Convert
 *
 * @author jinhuaPeng
 * @since 2022-04-01
 */
@Mapper(componentModel = "spring")
public interface AppUserRoleConvert {

    AppUserRoleConvert INSTANCE = Mappers.getMapper(AppUserRoleConvert.class);

    AppUserRoleDTO beanConvertDto(AppUserRole appUserRole);

    AppUserRoleVO beanConvertVo(AppUserRole appUserRole);

    AppUserRole dtoConvertBean(AppUserRoleDTO appUserRoleDTO);

    AppUserRole voConvertBean(AppUserRoleVO appUserRoleVO);

    List<AppUserRoleVO> beansConvertVos(List<AppUserRoleVO> appUserRoleList);

    List<AppUserRoleDTO> beansConvertDtos(List<AppUserRole> appUserRoleList);

    List<AppUserRole> dtosConvertBeans(List<AppUserRoleDTO> appUserRoleDTOList);

    List<AppUserRole> vosConvertBeans(List<AppUserRoleVO> appUserRoleVOList);
}