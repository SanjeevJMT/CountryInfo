package org.sanjeev.country.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sanjeev.country.service.CountryService;
import org.sanjeev.country.service.CountryServiceImpl;

/**
 * Servlet implementation class CountryInfo
 */
public class CountryInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CountryService service =new CountryServiceImpl();
		service.fetchAllCountryInfo();
	}


}
