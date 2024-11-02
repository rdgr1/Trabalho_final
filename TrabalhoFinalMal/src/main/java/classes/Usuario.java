package classes;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Usuario {
    private Integer id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;

    public boolean login(String senha){

    return true;}
    public void logout(){};
    public String consultarDados(){return "";}
}
