package practice.bankomat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener {

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




    @Override
    public void actionPerformed(ActionEvent e) {

        // return latter for this method
    }
}
