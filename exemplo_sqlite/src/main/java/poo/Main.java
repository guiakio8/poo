package poo;

import poo.DAO.PessoaDAO;
import poo.model.Pessoa;

public class Main {
    
    public static void main(String[] args) {

        PessoaDAO dao = new PessoaDAO();

        Pessoa p1 = new Pessoa("Jota", "jota@rmail.com");
        Pessoa p2 = new Pessoa("Pedro", "pedro@rmail.com");

        System.out.println(p1);
        System.out.println(p2);

        dao.getPessoaById((long) 1);
    }

}
