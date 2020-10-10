package com.transample.controller;


import com.transample.core.common.RequestMappingConstant;
import com.transample.core.common.ResponseResult;
import com.transample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <p>用户接口请求处理器</p>
 *
 * */

@CrossOrigin
@RestController
@RequestMapping(value = RequestMappingConstant.ROOT_MAPPING_VALUE+"/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(RequestMappingConstant.QUERY_MAPPING_VALUE+"/{id}")
    public ResponseEntity query(@PathVariable("id") Long id) throws Exception{
        return ResponseEntity.ok(ResponseResult.ok(userService.query(id)));
    }
}
