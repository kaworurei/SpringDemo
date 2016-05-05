package com.j2eedemo.auth;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/5/5.
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AuthPassport {
    boolean validate() default true;
}
