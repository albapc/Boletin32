package boletin32;

import javax.swing.JOptionPane;

public class Alumno {

    private String nome;
    private int nota;
    private Enderezo enderezo;

    public class Enderezo {

        private String rua;
        private int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }

    }

    public Alumno() {
    }

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    public int cambiarNota() {
        nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce a nova nota"));
        return nota;
    }

    public void amosar() {
        System.out.println("nome -> " + nome + ", nota -> " + nota + ", enderezo: rua ->" + enderezo.getRua() + ", numero -> " + enderezo.getNumero());
//        System.out.println("nome -> " + nome + ", nota -> " + nota + ", enderezo -> " + enderezo.toString()); (dos formas de hacerlo)
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }

}
