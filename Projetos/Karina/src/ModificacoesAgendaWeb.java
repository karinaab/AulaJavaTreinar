package br.com.treinar.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.service.ICommand;

/**
 * Servlet implementation class ServletController
 */

 //avisa o servidor que essa classe é do tipo Servlet e que qualquer 
 //coisa terminada com '.maca' terá que passar por essa parte do código.
@WebServlet("*.maca")
public class ServletController extends HttpServlet {
	//Servlet é classe java que estende funcionalidades de um servidor de aplicação.
	//espera a requisição para tratá-la e retorná-la ao servidor.

	private static final long serialVersionUID = 1L;

	private Map<String, String> comandos;

	@Override
	public void init() throws ServletException {
		//init -> é chamado e executado uma única vez, inicializando o objeto do
		//servlet que fica aguardando as requisições.
		comandos = new HashMap<>();
		comandos.put("cad", "br.com.treinar.agenda.service.CriaContatoCommand");
		comandos.put("rem", "br.com.treinar.agenda.service.RemoveContatoCommand");
		comandos.put("acs", "br.com.treinar.agenda.service.AcessaTelaContatoCommand");
		comandos.put("lis", "br.com.treinar.agenda.service.ListaContatoCommand");
		comandos.put("lga", "br.com.treinar.agenda.service.LoginCommand");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = comandos.get(request.getParameter("command"));
		//recupera a requisição e compara com as chaves do HashMap, salvando em 
		//command o caminho exato que a requisição deve seguir.
		try {
			//cria-se uma instância da classe salva em command e faz um casting para ICommand;
			//chama o metódo executar da classe e salva em goTo o novo caminho que a requisição
			//deve seguir; por fim, na linha 52, direciona a requisição para o lugar desejado.
			ICommand c = (ICommand) Class.forName(command).newInstance();
			String goTo = c.executar(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher(goTo);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package br.com.treinar.agenda.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.util.Database;

public class CriaContatoCommand implements ICommand {

	private List<Contato> contatos;
	
	public CriaContatoCommand() {
		//Método construtor da classe 
		//inicializa a lista de contatos do banco de dados Database.
		contatos = Database.getInstance().getContatos();
	}

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		//recupera os dados inseridos pelo usuário e salva em uma variável
		//do tipo Contato.
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setSexo(Sexo.valueOf(sexo.trim()));
		
		//Se o novo contato ainda não existe, o adiciona ao banco de dados.

		if (!contatos.contains(contato)) {
			contatos.add(contato);			
		}
		
		//Executa o método executar da classe ListaContatoCommand e retorna
		//o caminho que a requisição deve seguir. 
		ICommand lista = new ListaContatoCommand();
		return lista.executar(request, response);
	}

}


package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {
	//Interface que será implementanda em todas as classe do pacote service, 
	//portanto o método executar terá que ser implementado em todas. 

	String executar(HttpServletRequest request, HttpServletResponse response);
	
	//request -> variável criada pelo servidor; contém todas as informações 
	//da requisição; também é usada para transmitir dados necessários dentro 
	//do servidor, em outras palavras, permite "comunicação" entre as classes 
	//do pacote service.
	
	//response -> variável criada pelo servidor que produz algo para o usuário,
	//como uma página HTML, ou seja, a 'resposta' do servidor.
}



package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;

public class Database {
	//Essa classe segue o padrão de projeto Singleton, que permite criar
	//um objeto único dessa classe, ou seja, uma instância estática.
	//Nesse caso, a lista de contatos será única no banco de dados.

	private List<Contato> contatos;
	
	private static Database instance;
	
	static {
		instance = new Database();
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	private Database() {
		super();
		contatos = new ArrayList<>();
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
}












