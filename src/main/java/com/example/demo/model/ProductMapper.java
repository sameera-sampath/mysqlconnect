package com.example.demo.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM PRODUCT WHERE id = #{id}")
    Product getProduct(@Param("id") Long id);
}
