package Classes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlunoController
 */
@WebServlet({ "/AlunoController", "/AlunoServlet" })
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
		List listaAluno = gerenciadorAluno.getAlunos();
		req.setAttribute("alunos", listaAluno);
		RequestDispatcher view = req.getRequestDispatcher("aluno.jsp");
		view.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.setNome(req.getParameter("nome"));
		aluno.setCpf(req.getParameter("cpf"));
		aluno.setRg(req.getParameter("rg"));
		aluno.setSexo(req.getParameter("sexo"));
		aluno.setUf(req.getParameter("uf"));
		
		GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();
		gerenciadorAluno.salvar(aluno);
	}

}
