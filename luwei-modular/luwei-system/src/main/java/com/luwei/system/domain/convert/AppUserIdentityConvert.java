package com.luwei.system.domain.convert;

import com.luwei.system.domain.AppUserIdentity;
import com.luwei.system.domain.dto.AppUserIdentityDTO;
import com.luwei.system.domain.vo.AppUserIdentityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * APP用户身份验证表 Convert
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Mapper(componentModel = "spring")
public interface AppUserIdentityConvert {

    AppUserIdentityConvert INSTANCE = Mappers.getMapper(AppUserIdentityConvert.class);

    AppUserIdentityDTO beanConvertDto(AppUserIdentity appUserIdentity);

    AppUserIdentityVO beanConvertVo(AppUserIdentity appUserIdentity);

    AppUserIdentity dtoConvertBean(AppUserIdentityDTO appUserIdentityDTO);

    AppUserIdentity voConvertBean(AppUserIdentityVO appUserIdentityVO);

    List<AppUserIdentityVO> beansConvertVos(List<AppUserIdentityVO> appUserIdentityList);

    List<AppUserIdentityDTO> beansConvertDtos(List<AppUserIdentity> appUserIdentityList);

    List<AppUserIdentity> dtosConvertBeans(List<AppUserIdentityDTO> appUserIdentityDTOList);

    List<AppUserIdentity> vosConvertBeans(List<AppUserIdentityVO> appUserIdentityVOList);
}