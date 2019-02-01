package practice.bankomat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener {

    //компоненты GUI
    //рамка
    private JFrame frame;
    //главная панель
    private JPanel mainPanel;
    //заголовки
    private JLabel jlblBalanceCaption, jlblBalance, jlblMoneyCaption;
    //текстовые поля
    private JTextField jtxtMoney;
    //кнопка
    private JButton jbtnGetMoney, jbtnPutMoney;

    private Account account = new Account(100);

    private static void setATM() {
        ATM atm = new ATM();
    }

    public ATM() {

        frame = new JFrame("ATM");

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        frame.getContentPane().add(mainPanel);

        addComponents();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(200, 150);
        frame.setLocation(300, 300);
        frame.setVisible(true);

        displayBalance();
    }

    private void addComponents() {
        jlblBalanceCaption = new JLabel("Balance: $");
        jlblBalance = new JLabel(" ");
        jlblMoneyCaption = new JLabel("Money: $");
        jtxtMoney = new JTextField();
        jbtnGetMoney = new JButton("Get money");
        jbtnPutMoney = new JButton("Put money");

        //выравнивание
        jlblBalanceCaption.setHorizontalAlignment(JLabel.RIGHT);
        jlblMoneyCaption.setHorizontalAlignment(JLabel.RIGHT);

        //зеленый цвет на черном фоне
        jlblBalance.setBackground(Color.BLACK);
        jlblBalance.setForeground(Color.GREEN);
        jlblBalance.setOpaque(true);

        //добавление компонентов на панель
        mainPanel.add(jlblBalanceCaption);
        mainPanel.add(jlblBalance);
        mainPanel.add(jlblMoneyCaption);
        mainPanel.add(jtxtMoney);
        mainPanel.add(jbtnGetMoney);
        mainPanel.add(jbtnPutMoney);

        //слушатели событий
        jbtnGetMoney.addActionListener(this);
        jbtnPutMoney.addActionListener(this);
    }

    private void displayBalance() {

        String balance = String.format("%.2f", account.getBalance());
        jlblBalance.setText(balance);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnGetMoney) {
            getMoney();
        } else if (e.getSource() == jbtnPutMoney) {
            putMoney();
        }
    }

    private void putMoney() {
        if (isValidPutMoney()) {
            double money = Double.parseDouble(jtxtMoney.getText());
            account.putMoney(money);
            JOptionPane.showMessageDialog(frame, "Putting was a success", "Message", JOptionPane.INFORMATION_MESSAGE);

            //пересчет баланса
            displayBalance();
        }
    }

    private void getMoney() {
        if (isValidGetMoney()){
            double money = Double.parseDouble(jtxtMoney.getText());
            account.getMoney(money);
            JOptionPane.showMessageDialog(frame, "Getting was a success", "Message", JOptionPane.INFORMATION_MESSAGE);

            //пересчет баланса
            displayBalance();
        }
    }

    private boolean isValidGetMoney() {

        String message = "";

        String inputLine = jtxtMoney.getText();

        if (!isDouble(inputLine)) {
            message = "Enter number";
        } else if (Double.parseDouble(inputLine) < 10) {
            message = "Min for getting: 10$";
        } else if (Double.parseDouble(inputLine) > 250) {
            message = "Max for getting: 250$";
        } else if (account.getBalance() - Double.parseDouble(inputLine) < 0){
            message = "Insufficient funds";
        } else {
            return true;
        }

        errorMessage(message);
        return false;
    }

    private boolean isValidPutMoney() {

        String message = "";

        String inputLine = jtxtMoney.getText();

        if (!isDouble(inputLine)) {
            message = "Enter number";
        } else if (Double.parseDouble(inputLine) < 100.0) {
            message = "Min for putting: 100$";
        } else if (Double.parseDouble(inputLine) > 500.0) {
            message = "Max for getting: 500$";
        } else {
            return true;
        }

        errorMessage(message);
        return false;
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.WARNING_MESSAGE);
        jtxtMoney.requestFocus();
        jtxtMoney.selectAll();
    }

    private boolean isDouble(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
