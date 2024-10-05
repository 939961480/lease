package com.atguigu.lease.web.admin.custom.converter;

import com.atguigu.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * lease
 *
 * @author ChenWei
 * &#064;date 2024-09-11 7:44
 * description:
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum> {
    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new Converter<String, T>() {
            @Override
            public T convert(String source) {
                T[] typeEnumConstants = targetType.getEnumConstants();
                for (T typeEnumConstant : typeEnumConstants) {
                    if (typeEnumConstant.getCode().equals(Integer.valueOf(source))){
                        return typeEnumConstant;
                    }
                }
                throw new IllegalArgumentException("code"+source+"非法！");
            }
        };
    }
}
