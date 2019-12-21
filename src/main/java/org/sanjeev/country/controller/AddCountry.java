package org.sanjeev.country.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.sanjeev.country.bean.City;
import org.sanjeev.country.bean.Country;
import org.sanjeev.country.bean.Language;
import org.sanjeev.country.bean.Sports;
import org.sanjeev.country.service.CountryService;
import org.sanjeev.country.service.CountryServiceImpl;

@WebServlet 
public class AddCountry extends HttpServlet {
       
   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setting the content type
				response.setContentType("text/html");
				HttpSession session = request.getSession(true);
				PrintWriter pr = response.getWriter();
				
				
				
					String countryName = request.getParameter("country");
					String capital = request.getParameter("capital");
					String language = request.getParameter("language");
					String[] sports = request.getParameterValues("sports");
	
					 Set<Sports> sportset = new HashSet<Sports>();
					
					 
					for(int i=0;i<sports.length; i++)
					{
						Sports sport = new Sports();
						sport.setSportName(sports[i]);
						sportset.add(sport);
					}
					
					
					
					City city =new City();
					city.setCityName(capital);
					Language lang =new Language();
					lang.setLanguageName(language);
					
					
					Country country = new Country();
					country.setCountryName(countryName);
					country.setSports(sportset);
					country.setCity(city);
					country.setLanguage(lang);
					
					
					CountryService c = new CountryServiceImpl();
					
					int countryId =c.insertCountry(country);
					
					if (countryId>0)
					
					{
						request.setAttribute("countryId", countryId);
						RequestDispatcher requestDispatcher = request.getRequestDispatcher("country_addition_success.jsp");
						requestDispatcher.forward(request, response);
					}
					else
					{
						request.setAttribute("value", "Country info addition");
						RequestDispatcher requestDispatcher = request.getRequestDispatcher("country_addition_success.jsp");
						requestDispatcher.forward(request, response);
						
					}
					
	}

	
	

}
