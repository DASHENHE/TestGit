package com.hopu.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;



public class OutJson {
	private static PrintWriter out;
	/**
	 * 返回json
	 * @param response
	 * @param json
	 */
	public static void outJson(HttpServletResponse response,String json) {
		// 设置servlet返回的值为utf-8
		response.setCharacterEncoding("utf-8");
		// 设置返回类型为json
		response.setContentType("application/json; charset=utf-8");
		try {
			out = response.getWriter();
			out.write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 关闭
			out.flush();
			out.close();
		}	
	}

}
