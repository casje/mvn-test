package br.com.orbenet.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import br.com.orbenet.product.bo.ProductBO;
import br.com.orbenet.product.dto.Product;
import br.com.orbenet.product.helpers.HtmlUtil;

public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		ProductBO productBO = (ProductBO) context.getBean("productbo");
		Product product = productBO.findProduct(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		
		out.print(HtmlUtil.getStartHTML());
		out.print(HtmlUtil.getTitle("Details Product Created"));
		
		if (product == null) {
			out.print("Product not found!");
		} else {
			out.print(String.format("<span>Product: </span><b>%d</b><br> " +
		                            "<span>Name: </span>%s<br> " + 
					                "<span>Description: </span>%s<br> " +
		                            "<span>Price: </span>R$ %d <br>",
					product.getId(), 
					product.getName(), 
					product.getDescription(), 
					product.getPrice()));
		}
		
		out.print(HtmlUtil.getEndHTML());

	}

}
