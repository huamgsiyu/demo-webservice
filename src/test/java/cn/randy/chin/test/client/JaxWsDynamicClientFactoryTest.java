package cn.randy.chin.test.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.junit.Test;

/**
 * JaxWsDynamicClientFactory
 *
 * @author HSY
 * @since 2020/05/08 10:40
 */
public class JaxWsDynamicClientFactoryTest {
    @Test
    public void sayHelloTest() {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/demo/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        try {
            Object[] params = new Object[]{"RandolphChin"};

            // 设置调用服务超时时间，默认大概70秒
            HTTPConduit conduit = (HTTPConduit) client.getConduit();
            HTTPClientPolicy policy = new HTTPClientPolicy();
            long timeout = 5 * 60 * 1000;
            policy.setConnectionTimeout(timeout);
            policy.setReceiveTimeout(timeout);
            conduit.setClient(policy);

            // invoke("方法名",参数1,参数2,参数3....);
            Object[] objects = client.invoke("sayHello", params);
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
