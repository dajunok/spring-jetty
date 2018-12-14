package liu.jetty.embed.cast;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class ExampleServer {
	public static void main(String[] args) throws Exception {
		//设置服务器连接
		Server server=new Server();
		ServerConnector connector=new ServerConnector(server);
		connector.setPort(8080);
		server.setConnectors(new Connector[] {connector} );
		
		//创建Handler
		ServletContextHandler context=new ServletContextHandler();
		context.setContextPath("/");
		context.addServlet(HelloServlet.class,"/hello");
		context.addServlet(AsyncEchoServlet.class, "/echo/*");
		HandlerCollection handlers=new HandlerCollection(); //一个包含多个处理器的集合，按照顺序依次处理。这在响应请求的同时进行统计和日志记录特别有用。
		handlers.setHandlers(new Handler[] {context,new DefaultHandler()});
		
		//服务器添加Handler并启动
		server.setHandler(handlers);
		server.start();
		server.join();
		
	}

}
