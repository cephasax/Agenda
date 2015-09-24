package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.el.ELResolver;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import modelo.Contato;
import modelo.User;

@ManagedBean
@ApplicationScoped
public class agendaBean implements Serializable {

	private User user = new User();
    private List<User> listUser;

    private String username;
	private String password;
	
	private Contato contato;
	private List<Contato> agenda;

	private String nome;
	private String email;
	private String tel;
	private String end;

	public void makeUsers(){
		
		//usuario1
		listUser = new ArrayList<User>();
		
		user = new User();
		user.setNome("usuario2005");
		user.setSenha("2005");
		listUser.add(user);
		
		//usuario2
		
		user = new User();
		user.setNome("usuario2006");
		user.setSenha("2006");
		listUser.add(user);
		
		//usuario3
		
		user = new User();
		user.setNome("usuario2007");
		user.setSenha("2007");
		listUser.add(user);
		
	}
	
	public String Login() {
		
		String[] users = {"usuario2005:2005","usuario2006:2006","usuario2007:2007"};
    	for (String user: users) {
    	String dbUsername = user.split(":")[0];
    	String dbPassword = user.split(":")[1];
    	
    	// Successful login
    	if (dbUsername.equals(username) && dbPassword.equals(password)) {
    		this.makeAgenda();
    		return "home";
    	}
    	}
    	
    	// Set login ERROR
    	FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
    	msg.setSeverity(FacesMessage.SEVERITY_ERROR);
    	FacesContext.getCurrentInstance().addMessage(null, msg);
    	return "erroLogin";
    	
	}
	
	public String erroLogin(){
		return "login";
	}
	
	public String logout() throws Throwable{
		FacesContext fc = FacesContext.getCurrentInstance();  
		HttpSession session = (HttpSession)fc.getExternalContext().getSession(false);  
		session.invalidate();
		return "login";
	}
	
	public void makeAgenda() {
		
		agenda = new ArrayList<Contato>();
		
		if(password.equals("2005")){
			Contato c = new Contato();

			c.setNome("Lorde Veemência");
			c.setEmail("lordeveemencia@gmail.com");
			c.setEnd("rua do apogeu, 14-Natal - RN");
			c.setTel("88881539");
			agenda.add(c);

			c = new Contato();
			c.setNome("Capitao Valor");
			c.setEmail("capitaovalor@gmail.com");
			c.setEnd("rua do mane, 15-São Paulo - SP");
			c.setTel("88883049");
			agenda.add(c);

			c = new Contato();
			c.setNome("Rapaz Obrigação");
			c.setEmail("rapazobrigacao@gmail.com");
			c.setEnd("rua do garimpo, 16-Natal - RN");
			c.setTel("88889771");
			agenda.add(c);

			c = new Contato();
			c.setNome("Homem Suavidade");
			c.setEmail("homemsuavidade@gmail.com");
			c.setEnd("rua do apogeu, 17-São Paulo - SP");
			c.setTel("88881591");
			agenda.add(c);

			c = new Contato();
			c.setNome("Mega Fe");
			c.setEmail("megafe@gmail.com");
			c.setEnd("rua do mane, 18-Natal - RN");
			c.setTel("88883912");
			agenda.add(c);

			c = new Contato();
			c.setNome("Rei Inteligência");
			c.setEmail("reiinteligencia@gmail.com");
			c.setEnd("rua do garimpo, 19-São Paulo - SP");
			c.setTel("88888241");
			agenda.add(c);
		}
		
		else if(password.equals("2006")){
			Contato c = new Contato();

			c = new Contato();
			c.setNome("Rei Inteligência");
			c.setEmail("reiinteligencia@gmail.com");
			c.setEnd("rua do garimpo, 19-São Paulo - SP");
			c.setTel("88888241");
			agenda.add(c);
			
			c = new Contato();
			c.setNome("Homem Desconhecido");
			c.setEmail("homemdesconhecido@gmail.com");
			c.setEnd("rua do apogeu, 20-Natal - RN");
			c.setTel("88881698");
			agenda.add(c);

			c = new Contato();
			c.setNome("Homem Poder");
			c.setEmail("homempoder@gmail.com");
			c.setEnd("rua do mane, 21-São Paulo - SP");
			c.setTel("88880067");
			agenda.add(c);

			c = new Contato();
			c.setNome("Sussurrar");
			c.setEmail("sussurrar@gmail.com");
			c.setEnd("rua do garimpo, 22-Natal - RN");
			c.setTel("88886986");
			agenda.add(c);

			c = new Contato();
			c.setNome("Capitão Nariz");
			c.setEmail("capitaonariz@gmail.com");
			c.setEnd("rua do apogeu, 23-São Paulo - SP");
			c.setTel("88882086");
			agenda.add(c);

			c = new Contato();
			c.setNome("Super-Cueca");
			c.setEmail("supercueca@gmail.com");
			c.setEnd("rua do mane, 24-Natal - RN");
			c.setTel("88882386");
			agenda.add(c);

			c = new Contato();
			c.setNome("Homem Sonho");
			c.setEmail("homemsonho@gmail.com");
			c.setEnd("rua do garimpo, 25-São Paulo - SP");
			c.setTel("88885197");
			agenda.add(c);

			c = new Contato();
			c.setNome("Garota Caranguejo");
			c.setEmail("garotacaranguejo@gmail.com");
			c.setEnd("rua do apogeu, 26-Natal - RN");
			c.setTel("88887540");
			agenda.add(c);

			c = new Contato();
			c.setNome("Capitão Papagaio");
			c.setEmail("capitaopapagaio@gmail.com");
			c.setEnd("rua do mane, 27-São Paulo - SP");
			c.setTel("88880547");
			agenda.add(c);

			c = new Contato();
			c.setNome("Comandante Hipopótamo");
			c.setEmail("comandantehipopotamo@gmail.com");
			c.setEnd("rua do garimpo, 28-Natal - RN");
			c.setTel("88887742");
			agenda.add(c);

			c = new Contato();
			c.setNome("Mulher Negrume");
			c.setEmail("mulhernegrume@gmail.com");
			c.setEnd("rua do apogeu, 29-São Paulo - SP");
			c.setTel("88880419");
			agenda.add(c);
			
			c = new Contato();
			c.setNome("Fortaleza");
			c.setEmail("fortaleza@gmail.com");
			c.setEnd("rua do mane, 30-Natal - RN");
			c.setTel("88882246");
			agenda.add(c);

			c = new Contato();
			c.setNome("Férias");
			c.setEmail("ferias@gmail.com");
			c.setEnd("rua do garimpo, 31-São Paulo - SP");
			c.setTel("88883267");
			agenda.add(c);

			c = new Contato();
			c.setNome("Homem-Glutonaria");
			c.setEmail("homemglutonaria@gmail.com");
			c.setEnd("rua do apogeu, 32-Natal - RN");
			c.setTel("88889220");
			agenda.add(c);

			c = new Contato();
			c.setNome("Capitão Indiferença");
			c.setEmail("capitaoindiferenca@gmail.com");
			c.setEnd("rua do mane, 33-São Paulo - SP");
			c.setTel("88881680");
			agenda.add(c);
		}
		
		else if(password.equals("2007")){
			Contato c = new Contato();

			c.setNome("Homem-Glutonaria");
			c.setEmail("homemglutonaria@gmail.com");
			c.setEnd("rua do apogeu, 32-Natal - RN");
			c.setTel("88889220");
			agenda.add(c);

			c = new Contato();
			c.setNome("Capitão Indiferença");
			c.setEmail("capitaoindiferenca@gmail.com");
			c.setEnd("rua do mane, 33-São Paulo - SP");
			c.setTel("88881680");
			agenda.add(c);
		}

	}

	public String salvarContato() {
		Contato c = new Contato();
		if (!(nome.equals(""))){
			c.setEmail(email);
			c.setEnd(end);
			c.setNome(nome);
			c.setTel(tel);
			agenda.add(c);
		}
		return "home";
	}

	public String deletarContato() {
		Contato cont = new Contato();
		if ((!(nome.equals(""))) && (buscarContato(nome, tel) != null)){
			cont = buscarContato(nome, tel);
			agenda.remove(cont);
			System.out.println("Contato: " + cont.getNome() + " excluido com sucesso.");
			return "home";
		}
		return "deletarContato";
	}

	public String editarContato(){
		Contato cont = new Contato();
		if ((!(nome.equals(""))) && (buscarContato(nome, tel) != null)){
			cont = buscarContato(nome, tel);
			end = cont.getEnd();
			email = cont.getEmail();
			
			contato = new Contato();
			contato = cont;
			return "editarContatoFinal";
		}
		else{
			return "editarContato";
		}
	}
	
	public String confirmarEdicao(){
		int ind = agenda.indexOf(contato);
		System.out.println("na lista tem index: " + agenda.indexOf(contato));
		agenda.get(ind).setNome(nome);
		agenda.get(ind).setEmail(email);
		agenda.get(ind).setTel(tel);
		agenda.get(ind).setEnd(end);

		return "home";
	}
	
	public Contato buscarContato(String nome, String telefone) {
		for (Contato contato : agenda) {
			if ((contato.getNome().equals(nome)) && (contato.getTel().equals(telefone))) {
				System.out.println("Contato encontrado");
				return contato;
			}
		}
		System.out.println("Contato não encontrado");
		return null;
	}

	// navegacao
	public String goEditarContato() {
		nome = new String();
		tel = new String();
		return "editarContato";
	}

	public String goDeletarContato() {
		nome = new String();
		tel = new String();
		return "deletarContato";
	}

	public String goCadastro() {
		nome = new String();
		email = new String();
		tel = new String();
		end = new String();

		return "cadastrarContato";
	}

	public String goHome() {
		return "home";
	}

	// Getters and Setters
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Contato> agenda) {
		this.agenda = agenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getListUser() {
		return listUser;
	}
	
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
