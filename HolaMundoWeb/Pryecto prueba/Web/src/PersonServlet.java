

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		//System.out.println(request.getInputStream()); 
		
		List<Person> listaPersonas = ControladorPerson.getListaPersonas();
		String personasToJson = new Gson().toJson(listaPersonas);
		response.getWriter().print(personasToJson);	/*
		InputStream in=request.getInputStream();
		  StringBuffer xmlStr=new StringBuffer();
		    int d;
		    while((d=in.read()) != -1){
		              xmlStr.append((char)d);
		    }
		    System.out.println("xmlStr1--"+xmlStr.toString());
		    */
	}

}
