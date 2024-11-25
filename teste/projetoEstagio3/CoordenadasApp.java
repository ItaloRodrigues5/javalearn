import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoordenadasApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Inserir Coordenadas");
        JTextField xField = new JTextField(10);
        JTextField yField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém as coordenadas do usuário
                    String xInput = xField.getText();
                    String yInput = yField.getText();
                    
                    // Converte as entradas para números
                    double x = Double.parseDouble(xInput);
                    double y = Double.parseDouble(yInput);

                    // Valida as coordenadas (exemplo: deve estar dentro de um intervalo específico)
                    if (x < 0 || x > 100 || y < 0 || y > 100) {
                        throw new IllegalArgumentException("As coordenadas devem estar entre 0 e 100.");
                    }

                    // Se tudo estiver correto
                    JOptionPane.showMessageDialog(frame, "Coordenadas válidas: (" + x + ", " + y + ")");
                } catch (NumberFormatException ex) {
                    // Captura erro de formato numérico
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    // Captura coordenadas fora do intervalo
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    // Captura qualquer outra exceção
                    JOptionPane.showMessageDialog(frame, "Erro inesperado: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configuração do layout da janela
        JPanel panel = new JPanel();
        panel.add(new JLabel("Coordenada X:"));
        panel.add(xField);
        panel.add(new JLabel("Coordenada Y:"));
        panel.add(yField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}