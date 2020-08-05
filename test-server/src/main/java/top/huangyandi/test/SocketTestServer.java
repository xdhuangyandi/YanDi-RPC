package top.huangyandi.test;

import top.huangyandi.rpc.annotation.ServiceScan;
import top.huangyandi.rpc.serializer.CommonSerializer;
import top.huangyandi.rpc.transport.RpcServer;
import top.huangyandi.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author huangyandi
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
