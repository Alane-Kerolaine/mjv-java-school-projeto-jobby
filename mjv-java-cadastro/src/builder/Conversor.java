package builder;

import model.Pessoa;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Conversor {

    Path arquivoDestino = Paths.get("C:\\mjv-java-school\\projeto-jobby\\mjv-java-school-projeto-jobby\\mjv-java-cadastro\\files\\cadastro.csv");

    public void gerarArquivoCsv(Pessoa pessoa) {
        StringBuilder dadosCadastrados = new StringBuilder();

        dadosCadastrados.append("NOME ;");
        dadosCadastrados.append("CPF ;");
        dadosCadastrados.append("DATA NASCIMENTO ;");
        dadosCadastrados.append("GÊNERO ;");
        dadosCadastrados.append("EMAIL ;");
        dadosCadastrados.append("TELEFONE ;");
        dadosCadastrados.append("CELULAR ;");
        dadosCadastrados.append("CELULAR WHATSAPP? ;");
        dadosCadastrados.append("LOGRADOURO ;");
        dadosCadastrados.append("NUMERO ;");
        dadosCadastrados.append("COMPLEMENTO ;");
        dadosCadastrados.append("BAIRRO ;");
        dadosCadastrados.append("CIDADE ;");
        dadosCadastrados.append("ESTADO ;");
        dadosCadastrados.append("PROFISSÃO ;");
        dadosCadastrados.append("EMPREGO ATUAL ;");
        dadosCadastrados.append("EMPRESA ;");
        dadosCadastrados.append("SALARIO ;");
        dadosCadastrados.append("HABILIDADES ;");
        dadosCadastrados.append("PRETENSAO SALRIAL MINIMA ;");
        dadosCadastrados.append("PRETENSAO SALRIAL MAXIMA ;").append("\n");

        dadosCadastrados.append(pessoa.getNome() + ";");
        dadosCadastrados.append(pessoa.getCpf() + ";");
        dadosCadastrados.append(pessoa.getDataNascimento() + ";");
        dadosCadastrados.append(pessoa.getGenero() + ";");
        dadosCadastrados.append(pessoa.getContato().getEmail() + ";");
        dadosCadastrados.append(pessoa.getContato().getTelefone() + ";");
        dadosCadastrados.append(pessoa.getContato().getCelular() + ";");
        dadosCadastrados.append(pessoa.getContato().getWhatsapp() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getLogradouro() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getNumero() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getComplemento() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getBairro() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getCidade() + ";");
        dadosCadastrados.append(pessoa.getEndereco().getEstado() + ";");
        dadosCadastrados.append(pessoa.getProfissional().getProfissao() + ";");
        dadosCadastrados.append(pessoa.getProfissional().getEmpregoAtual() + ";");
        dadosCadastrados.append(pessoa.getProfissional().getEmpresa() + ";");
        dadosCadastrados.append(pessoa.getProfissional().getSalario() + ";");
        dadosCadastrados.append(pessoa.getInformacoesAdicionais().getHabilidades() + ";");
        dadosCadastrados.append(pessoa.getInformacoesAdicionais().getPretensaoMinima() + ";");
        dadosCadastrados.append(pessoa.getInformacoesAdicionais().getPretensaoMaxima() + "; \n");


        try {
            Files.write(arquivoDestino, dadosCadastrados.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
