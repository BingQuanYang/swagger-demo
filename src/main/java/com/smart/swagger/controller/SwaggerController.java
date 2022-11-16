package com.smart.swagger.controller;


import com.smart.swagger.vo.SwaggerRequestVO;
import com.smart.swagger.vo.SwaggerResponseVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger")
@Api(value = "用户接口", tags = {"用户接口"})
public class SwaggerController {
    @ApiOperation("新增用户")
    @PostMapping("/save")
    public String save(@RequestBody SwaggerRequestVO swaggerRequestVO) {
        return "success";
    }

    @ApiOperation("根据Id查找用户")
    @GetMapping("/getById")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true),
            @ApiImplicitParam(name = "name", value = "用户姓名", required = false),
    })

    public SwaggerResponseVO getById(@RequestParam Long id) {
        return new SwaggerResponseVO(1L, "张三", 1, "哈哈");
    }
}
