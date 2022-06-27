package com.luwei.system.domain.convert;

import com.luwei.system.api.domain.AppUserOpenIdDTO;
import com.luwei.system.domain.AppUserOpenId;
import com.luwei.system.domain.vo.AppUserOpenIdVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * 用户与openId关系表  Convert
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Mapper(componentModel = "spring")
public interface AppUserOpenIdConvert {

    AppUserOpenIdConvert INSTANCE = Mappers.getMapper(AppUserOpenIdConvert.class);

    AppUserOpenIdDTO beanConvertDto(AppUserOpenId appUserOpenId);

    AppUserOpenIdVO beanConvertVo(AppUserOpenId appUserOpenId);

    AppUserOpenId dtoConvertBean(AppUserOpenIdDTO appUserOpenIdDTO);

    AppUserOpenId voConvertBean(AppUserOpenIdVO appUserOpenIdVO);

    List<AppUserOpenIdVO> beansConvertVos(List<AppUserOpenIdVO> appUserOpenIdList);

    List<AppUserOpenIdDTO> beansConvertDtos(List<AppUserOpenId> appUserOpenIdList);

    List<AppUserOpenId> dtosConvertBeans(List<AppUserOpenIdDTO> appUserOpenIdDTOList);

    List<AppUserOpenId> vosConvertBeans(List<AppUserOpenIdVO> appUserOpenIdVOList);
}