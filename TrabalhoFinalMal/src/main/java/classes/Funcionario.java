package classes;

import lombok.Data;

@Data
public class Funcionario extends Usuario{
    private String codigoFuncionario;
    private String cargo;
    private String senha;

    public void abrirConta(Conta conta){};
    public void encerrarConta(Conta conta){};
    public Conta consultarDadosConta(int numeroConta){return };
    public Cliente consultarDadosCliente(int idCliente){
        return};
    public void alterarDadosConta(Conta conta){};
    public void alterarDadosClientes(Cliente cliente){};
    public void cadastrarFuncionario(Funcionario funcionario){};
    public void gerarRelatorioMovimentacao(){};
}
