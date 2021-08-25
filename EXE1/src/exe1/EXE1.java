package exe1;

import java.util.ArrayList;
import java.util.List;

public class EXE1 {
    public static void main(String[] args) {
        
        
        ArrayList<Autor> autores = new ArrayList();
        autores.add(new Autor("Antonio"));
        autores.add(new Autor("Cleber"));
        autores.add(new Autor("Eduardo"));
        
        ArrayList<Livro> livros = new ArrayList();
        livros.add(new Livro("978-0-7334", autores.get(0)));
        livros.add(new Livro("978-0-7335", autores.get(1)));
        livros.add(new Livro("978-0-7336", autores.get(2)));
        
        Biblioteca bibl = new Biblioteca("Biblioteca são josé");
        bibl.setLivros(livros);
        
        Capitulo cap = new Capitulo(3, livros.get(0));
        System.out.println(bibl.toString());
    }
    
}
