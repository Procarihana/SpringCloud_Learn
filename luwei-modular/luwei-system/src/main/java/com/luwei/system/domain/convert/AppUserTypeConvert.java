package com.luwei.system.domain.convert;

import com.luwei.system.domain.AppUserType;
import com.luwei.system.domain.dto.AppUserTypeDTO;
import com.luwei.system.domain.vo.AppUserTypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


/**
 * 用户类型 Convert
 *
 * @author jinhuaPeng
 * @since 2022-03-31
 */
@Mapper(componentModel = "spring")
public interface AppUserTypeConvert {

    AppUserTypeConvert INSTANCE = Mappers.getMapper(AppUserTypeConvert.class);

    AppUserTypeDTO beanConvertDto(AppUserType appUserType);

    AppUserTypeVO beanConvertVo(AppUserType appUserType);

    AppUserType dtoConvertBean(AppUserTypeDTO appUserTypeDTO);

    AppUserType voConvertBean(AppUserTypeVO appUserTypeVO);

    List<AppUserTypeVO> beansConvertVos(List<AppUserTypeVO> appUserTypeList);

    List<AppUserTypeDTO> beansConvertDtos(List<AppUserType> appUserTypeList);

    List<AppUserType> dtosConvertBeans(List<AppUserTypeDTO> appUserTypeDTOList);

    List<AppUserType> vosConvertBeans(List<AppUserTypeVO> appUserTypeVOList);
}