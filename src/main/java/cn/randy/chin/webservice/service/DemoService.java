package cn.randy.chin.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * DemoService
 *
 * @author HSY
 * @since 2020/05/08 10:31
 */
@WebService
        (// name = "DemoService", // 暴露服务名称
                targetNamespace = "http://service.webservice.chin.randy.cn"// 命名空间,一般是接口的包名倒序
        )
public interface DemoService {
    // @WebMethod
    public String sayHello(String user);

}
