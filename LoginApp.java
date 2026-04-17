import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginApp extends JFrame {
    public LoginApp() {
        setTitle("Sistema de Acesso");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(244, 247, 246));

        JPanel card = new JPanel();
        card.setPreferredSize(new Dimension(300, 400));
        card.setBackground(Color.WHITE);
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Seja bem-vindo (a)");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");
        loginBtn.setBackground(new Color(230, 57, 70));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        loginBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

        loginBtn.addActionListener((ActionEvent e) -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if(user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Welcome, Usuário do Aluno!");
            } else {
                JOptionPane.showMessageDialog(this, "Acesso Negado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        card.add(title);
        card.add(Box.createRigidArea(new Dimension(0, 20)));
        card.add(new JLabel("Usuário:"));
        card.add(userField);
        card.add(Box.createRigidArea(new Dimension(0, 10)));
        card.add(new JLabel("Senha:"));
        card.add(passField);
        card.add(Box.createRigidArea(new Dimension(0, 20)));
        card.add(loginBtn);

        add(card);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginApp().setVisible(true));
    }
}
