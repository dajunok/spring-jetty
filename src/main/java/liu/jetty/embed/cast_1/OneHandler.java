package liu.jetty.embed.cast_1;

import org.eclipse.jetty.server.Server;

public class OneHandler {
	public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloHandler());

      //启动应用服务并等待请求
        server.start();
        server.join();
    }
}
