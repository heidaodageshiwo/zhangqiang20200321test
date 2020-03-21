package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: demo
 * @Package: com.example.demo.test
 * @ClassName: a
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-03-21 17:49
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-03-21 17:49
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */
@RestController
public class a {

  @RequestMapping("/zq")
  public String get(){
    return "2020年测试提交代码";
  }
}
