package br.com.exercicio5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MMRExercicio5
 */
@WebServlet("/MMRExercicio5")
public class MMRExercicio5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MMRExercicio5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int ladoA, ladoB, ladoC;
		
		ladoA = Integer.parseInt(request.getParameter("ladoA"));
		ladoB = Integer.parseInt(request.getParameter("ladoB"));
		ladoC = Integer.parseInt(request.getParameter("ladoC"));
		
		if (ladoA == 0 && ladoA == 0 && ladoB == 0) {
			response.getWriter().println("Valor invalido, digite um valor maior que 0!");
		}
		else if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
			response.getWriter().println("Isso é um triângulo equilátero.");
		
		} else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			response.getWriter().println("Isso é um triângulo escaleno.");
		
		} else {
			response.getWriter().println("Isso é um triângulo isóscele");
		}
		
		
	}

}
