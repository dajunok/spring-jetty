 package liu.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpittrWebAppInitializer  //创建前端控制器
			 extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {  //返回的带有@ Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的bean(这些bean通常是驱动应用后端的中间层和数据层组件)。
		return new Class<?>[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {//返回的带有@ Configuration注解的	类将会用来定义DispatcherServlet应用上下文中的bean(加载包含Web组件的bean， 如控制器、 视图解析器以及处理器映射)
		return new Class<?>[] {WebConfig.class};
	}

}
