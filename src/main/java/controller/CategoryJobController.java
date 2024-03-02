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
 * Servlet implementation class CategoryJobController
 */
@WebServlet("/CategoryJob")
public class CategoryJobController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryJobController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JobDAO jobDAO = new JobDAO();
		CategoryDAO categoryDAO = new CategoryDAO();
		
		String categoryId = request.getParameter("categoryId");
		
		Category category = new Category();
		ArrayList<Job> jobs = new ArrayList<Job>();

		try {
			int intCategoryId = 0;
			if (categoryId != null) {
				intCategoryId = Integer.parseInt(categoryId);
			}
			category = categoryDAO.getChosenCategories(intCategoryId);
			jobs = jobDAO.getChosenJobByCategory(intCategoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("jobs", jobs);
		request.setAttribute("category", category);
		
		RequestDispatcher rd = request.getRequestDispatcher("/category-jobs.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
