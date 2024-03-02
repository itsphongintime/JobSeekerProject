package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoryDAO;
import DAO.CompanyDAO;
import DAO.UserDAO;
import entity.Category;
import entity.Company;
import entity.Job;
import entity.Qualification;
import entity.User;

/**
 * Servlet implementation class JobRegisterController
 */
@WebServlet("/JobRegister")
public class JobRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobRegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			CompanyDAO companyDAO = new CompanyDAO();
			CategoryDAO categoryDAO = new CategoryDAO();
			
			ArrayList<Company> company = companyDAO.getAllCompanies();
			ArrayList<Category> category = categoryDAO.getAllCategories();
			
			request.setAttribute("company", company);
			request.setAttribute("category", category);
			
			RequestDispatcher rd = request.getRequestDispatcher("/job-register.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserDAO userDAO = new UserDAO();
			
			
			String title = request.getParameter("Title");
			String type = request.getParameter("type");
			String salary = request.getParameter("Salary");
			String location = request.getParameter("location");
			String vacancy = request.getParameter("vacancy");
			String Description = request.getParameter("Description");
			String BriefQualification = request.getParameter("BriefQualification");
			String[] qualifications = request.getParameterValues("qualification[]");
			String BriefResponsibility = request.getParameter("BriefResponsibility");
			String[] responsibilities = request.getParameterValues("responsibilities[]");
			String company = request.getParameter("company");
			String category = request.getParameter("category");
			
			int companyId = Integer.parseInt(company);
			int categoryId = Integer.parseInt(category);
			
			LocalDate today = LocalDate.now();
			String formattedDate = today.format(DateTimeFormatter.ISO_DATE); // "YYYY-MM-DD"
			
			Job job = new Job(title, type, salary, location, vacancy, formattedDate, Description, BriefResponsibility, BriefQualification, "com-logo-2.jpg", companyId, categoryId);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
