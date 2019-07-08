
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Storedata")
public class Storedata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Storedata() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String SOLID = request.getParameter("solid");
		String BranchName = request.getParameter("brname");
		String BranchZone = request.getParameter("brzone");
		String Region = request.getParameter("region");
		String BranchAddress1 = request.getParameter("bradd1");
		String BranchAddress2 = request.getParameter("bradd2");
		String City = request.getParameter("city");
		String PinCode = request.getParameter("pincode");
		String Telephone = request.getParameter("Telephone");
		String Branchmail = request.getParameter("brmail");

		request.getSession().setAttribute("SOLID", SOLID);
		request.getSession().setAttribute("BranchName", BranchName);
		request.getSession().setAttribute("BranchZone", BranchZone);
		request.getSession().setAttribute("Region", Region);
		request.getSession().setAttribute("BranchAddress1", BranchAddress1);
		request.getSession().setAttribute("BranchAddress2", BranchAddress2);
		request.getSession().setAttribute("City", City);
		request.getSession().setAttribute("PinCode", PinCode);
		request.getSession().setAttribute("Telephone", Telephone);
		request.getSession().setAttribute("Branchmail", Branchmail);
		
		//File store=new File("C:/Users/ditnew07021995/Desktop/Storedata.txt");
		//FileInputStream fin=new FileInputStream("C:/Users/ditnew07021995/Desktop/Storedata.txt");
		//FileOutputStream fout=new FileOutputStream("C:/Users/ditnew07021995/Desktop/Storedata.txt");
		FileWriter writter=new FileWriter("C:/Users/ditnew07021995/Desktop/Storedata.txt");
		writter.write(SOLID+"\n");
		writter.write(BranchName+"\n");
		writter.write(BranchZone+"\n");
		writter.write(Region+"\n");
		writter.write(BranchAddress1+"\n");
		writter.write(BranchAddress2+"\n");
		writter.write(City+"\n");
		writter.write(PinCode+"\n");
		writter.write(Telephone+"\n");
		writter.write(Branchmail+"\n");

		writter.close();
		//String a=(String) request.getAttribute("SOL-ID");
		//out.print("a--"+a);
		
		//out.print("<h>"+SOLID+".."+BranchName+".."+BranchZone+".."+Region+".."+BranchAddress1+".."+BranchAddress2+".."+City+".."+PinCode+".."+Telephone+".."+Branchmail+"</h>");
/*		HttpSession  session= request.getSession(); 
		session.setAttribute("SOLID", SOLID);
		session.setAttribute("BranchName", "BranchName");
		session.setAttribute("BranchZone", "BranchZone");
		session.setAttribute("Region", "Region");
		session.setAttribute("BranchAddress1", "BranchAddress1");
		session.setAttribute("BranchAddress2", "BranchAddress2");
		session.setAttribute("City", "City");
		session.setAttribute("PinCode", "PinCode");
		session.setAttribute("Telephone", "Telephone");
		session.setAttribute("Branchmail", "Branchmail");*/
	

		
		response.sendRedirect("details.jsp");

	}

}
