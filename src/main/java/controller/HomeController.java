package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoryDAO;
import DAO.JobDAO;
import entity.Category;
import entity.Job;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/Home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			JobDAO jobDAO = new JobDAO();
			ArrayList<Job> jobs = jobDAO.getLatestJobs();
			ArrayList<Job> fullTimeJobs = jobDAO.getFullTimeJobs();
			ArrayList<Job> partTimeJobs = jobDAO.getPartTimeJobs();
			
			CategoryDAO categoryDAO = new CategoryDAO();
			ArrayList<Category> categories = categoryDAO.getAllCategories();
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			
			request.setAttribute("categories", categories);
			
			request.setAttribute("jobs", jobs);
			request.setAttribute("fullTimeJobs", fullTimeJobs);
			request.setAttribute("partTimeJobs", partTimeJobs);
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
