package org.spring.springboot.controller;

import org.spring.springboot.domain.Person;
import org.spring.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

/**
 * 人员PersonController 实现 HTTP服务
 *
 * @author WJ
 * @date 2018/04/22
 */

@RestController
public class TestController {

    @RequestMapping(value = "/test/{num}" ,method = RequestMethod.GET)
    public String test(@PathVariable("num") String num){
        return num;
    }


}
