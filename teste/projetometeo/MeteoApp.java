import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeteoApp extends JFrame {
    private JTextField cidadeField;
    private JButton consultarButton;
    private JTextArea resultadoArea;
    private PrevisaoDAO previsaoDAO;

    public MeteoApp(PrevisaoDAO previsaoDAO) {
        this.previsaoDAO = previsaoDAO;
        cidadeField = new JTextField(20);
        consultarButton = new JButton("Consultar");
        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cidade = cidadeField.getText();
                Previsao previsao = previsaoDAO.buscarPrevisao(cidade);
                if (previsao != null) {
                    resultadoArea.setText("Cidade: " + previsao.getCidade() +
                                          "\nTemperatura: " + previsao.getTemperatura() +
                                          "\nCondição: " + previsao.getCondicao());
                } else {
                    resultadoArea.setText("Previsão não encontrada para a cidade: " + cidade);
                }
            }
        });

        add(cidadeField);
        add(consultarButton);
        add(new JScrollPane(resultadoArea));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        // Configuração do Hibernate e criação da SessionFactory deve ser feita aqui
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); // Método fictício para obter a SessionFactory
        PrevisaoDAO previsaoDAO = new PrevisaoDAO(sessionFactory);
        
        new MeteoApp(previsaoDAO);
    }
}