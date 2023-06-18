package builder;


import enumeration.Genero;
import model.Pessoa;

import java.time.LocalDate;
import java.util.List;

public class Cadastro {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Alane Kerolaine Carvalho");
        pessoa1.setCpf("123.456.789-10");
        pessoa1.setDataNascimento(LocalDate.of(1996,1,10));
        pessoa1.setGenero(Genero.FEMININO);
        pessoa1.getContato().setEmail("alanekerolaine@live.com");
        pessoa1.getContato().setTelefone("3333-3333");
        pessoa1.getContato().setCelular("99640-0267");
        pessoa1.getContato().setWhatsapp(true);
        pessoa1.getEndereco().setLogradouro("Rua dos Bobos");
        pessoa1.getEndereco().setNumero(0);
        pessoa1.getEndereco().setComplemento("A");
        pessoa1.getEndereco().setBairro("Arruda");
        pessoa1.getEndereco().setCidade("Recife");
        pessoa1.getEndereco().setEstado("Pernambuco");
        pessoa1.getProfissional().setProfissao("Deenvolvedora de Software");
        pessoa1.getProfissional().setEmpregoAtual("Desenvolvedora Back-end Junior");
        pessoa1.getProfissional().setEmpresa("MJV");
        pessoa1.getProfissional().setSalario(3000);
        pessoa1.getInformacoesAdicionais().setHabilidades(List.of("Resolução de problemas", "Trabalho em equipe", "Proatividade", "Comunicação"));
        pessoa1.getInformacoesAdicionais().setPretensaoMinima(3000);
        pessoa1.getInformacoesAdicionais().setPretensaoMaxima(6000);

        Conversor c = new Conversor();
        c.gerarArquivoCsv(pessoa1);

    }
}
