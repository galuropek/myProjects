package practice.bankomat;

import javax.swing.*;

class Validator {

    static boolean isValidGetMoney(JTextField jtxtMoney, Account account, JFrame frame) {

        String message = "";

        String inputLine = jtxtMoney.getText();

        if (isDouble(inputLine)) {
            message = "Enter number";
        } else if (Double.parseDouble(inputLine) < 10) {
            message = "Min for getting: 10$";
        } else if (Double.parseDouble(inputLine) > 250) {
            message = "Max for getting: 250$";
        } else if (account.getBalance() - Double.parseDouble(inputLine) < 0) {
            message = "Insufficient funds";
        } else {
            return true;
        }

        errorMessage(message, jtxtMoney, frame);
        return false;
    }

    static boolean isValidPutMoney(JTextField jtxtMoney, JFrame frame) {

        String message = "";

        String inputLine = jtxtMoney.getText();

        if (isDouble(inputLine)) {
            message = "Enter number";
        } else if (Double.parseDouble(inputLine) < 100.0) {
            message = "Min for putting: 100$";
        } else if (Double.parseDouble(inputLine) > 500.0) {
            message = "Max for getting: 500$";
        } else {
            return true;
        }

        errorMessage(message, jtxtMoney, frame);
        return false;
    }

    private static void errorMessage(String message, JTextField jtxtMoney, JFrame frame) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.WARNING_MESSAGE);
        jtxtMoney.requestFocus();
        jtxtMoney.selectAll();
    }

    private static boolean isDouble(String num) {
        try {
            Double.parseDouble(num);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

}
