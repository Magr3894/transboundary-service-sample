package com.transample.core.annotation;/*
 * @Author: panc
 * @Date:2020/10/11 9:40*/


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface MApiQuality {

}
