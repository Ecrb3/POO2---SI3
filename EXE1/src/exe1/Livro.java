/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;

/**
 *
 * @author eduardo.borges
 */
public class Livro {
    private String isbn;
    private Autor autor;
    private Biblioteca biblioteca;
    private Capitulo capitulos;

    public Livro(String isbn, Autor autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Capitulo getCapitulos() {
        return capitulos;
    }

    

    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", autor=" + autor + ", biblioteca=" + biblioteca + ", capitulos=" + capitulos + '}';
    }



    
}
