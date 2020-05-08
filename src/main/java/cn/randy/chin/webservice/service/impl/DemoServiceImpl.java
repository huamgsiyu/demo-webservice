package cn.randy.chin.webservice.service.impl;

import cn.randy.chin.webservice.service.DemoService;

import javax.jws.WebService;

@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://service.webservice.chin.randy.cn", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "cn.randy.chin.webservice.service.DemoService"// 接口地址
)
/**
 * DemoServiceImpl
 *
 * @author HSY
 * @since 2020/05/08 10:34
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String user) {
        System.out.println("hello");
        return "hello";
    }

}