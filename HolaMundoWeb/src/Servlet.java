

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.google.gson.*;
import com.google.*;
/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
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
		
		List<Person> listaPersonas = new ArrayList<Person>();
		listaPersonas.add(new Person("juan","sanchez"));
		listaPersonas.add(new Person("pepe","Perez"));
		Person a = new Person("juan manuel","Sanchez");
		//JSONObject json = new JSONObject();
		//JSONArray personas = new JSONArray(listaPersonas);
		/*
		for (int i = 0; i < listaPersonas.size(); i++) {
						
		}
		*/
		//response.setContentType("text/html");
		response.setContentType("application/json");
		
		JSONArray jsArr = new JSONArray(listaPersonas);
		//jsArr.put(listaPersonas);
		response.getWriter().print(jsArr);
		/*
		JsonObject gson = new JsonObject();
		String json = gson.toJson(listaPersonas, Person);
		*/
		 //List<String> target2 = gson.fromJson(json, listType);
	}

}
