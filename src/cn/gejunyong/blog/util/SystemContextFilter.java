package cn.gejunyong.blog.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import cn.gejunyong.blog.model.SystemContext;

public class SystemContextFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		int offset = 0;
		try {
			offset = Integer.parseInt(req.getParameter("pager.offset"));
		} catch (NumberFormatException e) {
		}
		try {
			SystemContext.setPageOffset(offset);
			SystemContext.setPageSize(15);
			chain.doFilter(req, resp);
		}finally {
			SystemContext.removePageOffset();
			SystemContext.removePageSize();
			SystemContext.removeLoginUser();
			SystemContext.removeRealPath();
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
