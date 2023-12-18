public class Cliente {
    String nome;
    String endereco;
    String telefone;
    String email;
    DVD[] dvds_alugados = new DVD[3];

    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    void alugarDVD(DVD dvd) {
        for (int i = 0; i < dvds_alugados.length; i++) {
            if (dvds_alugados[i] == null) {
                dvds_alugados[i] = dvd;
                break;
            }
        }
    }

    void devolverDVD(DVD dvd) {
        for (int i = 0; i < dvds_alugados.length; i++) {
            if (dvds_alugados[i].titulo.equals(dvd.titulo)) {
                dvds_alugados[i] = null;
                break;
            }
        }
    }

    void informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }

    void imprimir() {
        System.out.println(this.nome);
    }
}
