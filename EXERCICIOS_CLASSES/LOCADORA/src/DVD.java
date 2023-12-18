public class DVD {
    String titulo;
    String genero;
    String diretor;
    int ano;
    boolean alugado = false;
    String cliente;

    public DVD(String titulo, String genero, String diretor, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
    }

    void alugar(String cliente) {
        this.alugado = true;
        this.cliente = cliente;
    }

    void devolver() {
        this.alugado = false;
        this.cliente = null;
    }

    void descricao() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Genero: " + this.genero);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ano: " + this.ano);
    }

    void imprimir() {
        System.out.println(this.titulo);
    }
}
