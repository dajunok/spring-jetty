package liu.jetty.embed.cast_0;

import org.eclipse.jetty.server.Server;

/**
 * 一个最简单的jetty嵌入式服务器配置
 * @author LIU
 *
 */
public class SimplestServer {
	public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
        server.start();
        server.dumpStdErr();  //输出标准错误：HTTP ERROR 404
        server.join();
    }
}
