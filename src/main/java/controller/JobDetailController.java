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

import DAO.CompanyDAO;
import DAO.JobDAO;
import DAO.QualificationDAO;
import DAO.ResponsibilityDAO;
import entity.Company;
import entity.Job;
import entity.Qualification;
import entity.Responsibility;

/**
 * Servlet implementation class JobDetailController
 */
@WebServlet("/JobDetail")
public class JobDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JobDAO jobDAO = new JobDAO();
		CompanyDAO companyDAO = new CompanyDAO();
		QualificationDAO qualificationDAO = new QualificationDAO();
		ResponsibilityDAO responsibilityDAO = new ResponsibilityDAO();
		
		String jobId = request.getParameter("jobId");
		
		Job job = new Job();
		Company company = new Company();
		ArrayList<Qualification> qualification = new ArrayList<Qualification>();
		ArrayList<Responsibility> responsibility = new ArrayList<Responsibility>();

		try {
			int intJobId = 0;
			if (jobId != null) {
				intJobId = Integer.parseInt(jobId);
			}
			job = jobDAO.getChosenJobDetails(intJobId);
			company = companyDAO.getChosenCompany(job.getCompanyId());
			qualification = qualificationDAO.getJobQualifications(intJobId);
			responsibility = responsibilityDAO.getJobResponsibilities(intJobId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("job", job);
		request.setAttribute("company", company);
		request.setAttribute("qualification", qualification);
		request.setAttribute("responsibility", responsibility);
		
		RequestDispatcher rd = request.getRequestDispatcher("/job-detail.jsp");
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
