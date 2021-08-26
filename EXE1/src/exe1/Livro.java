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
    private int capitu;

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

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Livro{" + "isbn=" + isbn + ", autor=" + autor.getNome() + ", biblioteca=" + biblioteca + ", capitulos=" + capitu + '}';
    }



    
}
