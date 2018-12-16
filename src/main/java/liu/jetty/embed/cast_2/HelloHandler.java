package liu.jetty.embed.cast_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloHandler extends AbstractHandler {
	final String greeting;
    final String body;
    
    public HelloHandler() {
		this("Hello World! My HelloHandler."); //调用构造器：HelloHandler( String greeting )
	}
    
    public HelloHandler( String greeting )
    {
        this(greeting, null);  //调用构造器：HelloHandler( String greeting, String body )
    }

    public HelloHandler( String greeting, String body )
    {
        this.greeting = greeting;
        this.body = body;
    }

	public void handle(String target,  //目标请求，可以是一个URI或者是一个转发到这的处理器的名字
					   Request baseRequest,  //Jetty自己的没有被包装的请求，一个可变的Jetty请求对象
					   HttpServletRequest request,  //被filter或者servlet包装的请求，一个不可变的Jetty请求对象
					   HttpServletResponse response)  //响应，可能被filter或者servlet包装过
			throws IOException, ServletException {
		// 声明response的编码和文件类型
		response.setContentType("text/html; charset=utf-8");		
		// 声明返回状态码
        response.setStatus(HttpServletResponse.SC_OK);

        PrintWriter out = response.getWriter();

        out.println("<h1>" + greeting + "</h1>");
        if (body != null)
        {
            out.println(body);
        }

        baseRequest.setHandled(true);
    }

}
