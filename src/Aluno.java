import java.util.Date;

public class Aluno {

    private String nome;
    private int num;

    private Date data;

    private double paga;

    public Aluno(String n, int nu) {
        this.nome = n;
        this.num = nu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", num=" + num +
                ", data=" + data +
                ", paga=" + paga +
                '}';
    }
}
