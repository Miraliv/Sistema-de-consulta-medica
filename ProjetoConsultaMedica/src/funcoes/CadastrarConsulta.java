
package funcoes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telas.TelaInicio;


public class CadastrarConsulta {

    TelaInicio telaInicio;
    public CadastrarConsulta(TelaInicio telaInicio) {
        this.telaInicio = telaInicio;
        
    }
    
    // Método para validar o formato do CPF
   public boolean validarCPF(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (!cpf.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Formato de CPF inválido. O formato correto é XXX.XXX.XXX-XX");
            return false;
        }
        return true;
    }

    // Método para validar o formato da data
    public boolean validarData(String data) {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        if (!data.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido. O formato correto é XX/XX/XXXX");
            return false;
        }
        return true;
    }

    // Método para validar o formato do telefone
    public boolean validarTelefone(String telefone) {
        String regex = "\\(\\d{2}\\) \\d{5}-\\d{4}";
        if (!telefone.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Formato de telefone inválido. O formato correto é (XX) XXXXX-XXXX");
            return false;
        }
        return true;
    }

    // Método para validar os campos obrigatórios
    public boolean validarCamposObrigatorios(String nome, String cpf, String telefone, String dataConsulta) {
        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || dataConsulta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios");
            return false;
        }
        return true;
    }

    // Método para cadastrar a consulta
    public void cadastrarConsulta(String nome, String cpf, String telefone, String dataConsulta,String paciente,String JaRealizado,javax.swing.JTable table) {
         // Obter o modelo da tabela usando o método getter
         DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.addRow(new Object[]{nome, cpf, telefone, dataConsulta,paciente,JaRealizado});
    // Adicionar uma nova linha ao modelo da tabela
        
    }
        
}
