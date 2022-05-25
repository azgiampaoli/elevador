public class Elevador implements controleElevador {

    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeElevador;
    private int numerPessoas;


    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }
    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }
    public int getNumerPessoas() {
        return numerPessoas;
    }
    public void setNumerPessoas(int numerPessoas) {
        this.numerPessoas = numerPessoas;
    }


    /*Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
    andares no prédio (os elevadores sempre começam no térreo e vazio);
    */
    @Override
    public void inicializa(int qts, int andares) {
        setCapacidadeElevador(qts);
        setTotalAndares(andares);
        System.out.println("A capacidade do elevador é de  " + getCapacidadeElevador() + " pessoas e o prédio tem " + getTotalAndares() + " andares");

    }
/*Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);*/
    @Override
    public void entra(int pessoas) {
    if(getNumerPessoas()+pessoas <= getCapacidadeElevador()){
        setNumerPessoas(pessoas + getNumerPessoas());
        System.out.println("Tem " + getNumerPessoas() + " dentro do elevador");
    }else{
        System.out.println("Chegou ao limite da capacidade");
    }


    }

/*Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);*/
    @Override
    public void sai(int pessoa) {
        if(getNumerPessoas()!=0){
            setNumerPessoas(getNumerPessoas()-pessoa);
            System.out.println("Tem " + getNumerPessoas() + " dentro do elevador");
        }else{
            System.out.println("Não tem ninguém para sair");
        }


    }
//Sobe : para subir um andar (não deve subir se já estiver no último andar);
    @Override
    public void sobe() {
        if(getAndarAtual()<getTotalAndares()){
            setAndarAtual(getAndarAtual() +1);
            System.out.println("Voce está no andar " + getAndarAtual());
        }else {
            System.out.println("Voce está no andar último andar");
        }
    }
//Desce : para descer um andar (não deve descer se já estiver no térreo);
    @Override
    public void desce() {
        if(getAndarAtual()!=0){
            setAndarAtual(getAndarAtual()-1);
            System.out.println("Voce está no andar " + getAndarAtual());
        }else{
            System.out.println("Você está no terreo");
        }


    }
}
