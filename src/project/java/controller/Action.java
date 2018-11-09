package project.java.controller;

import project.java.controller.doneOperation.CmdAddCarDone;
import project.java.controller.doneOperation.CmdAddOrderDone;
import project.java.controller.doneOperation.CmdSignUpDone;

enum Action {

    INDEX {{
        cmd = new CmdIndex();
    }},
    PROFILE{{
       cmd = new CmdProfile();
    }},
    LOGIN {{
        cmd = new CmdLogin();
    }},
    SIGNUP {{
        cmd = new CmdSignUp();
    }},
    SIGNUPDONE {{
        cmd = new CmdSignUpDone();
    }},
    ADDORDER {{
        cmd = new CmdAddOrder();
    }},
    ADDORDERDONE {{
        cmd = new CmdAddOrderDone();
    }},
    ADDCAR {{
        cmd = new CmdAddCar();
    }},
    ADDCARDONE {{
        cmd = new CmdAddCarDone();
    }},
    EDITUSERS {{
        cmd = new CmdEditUsers();
    }},
    EDITORDERS {{
        cmd = new CmdEditOrders();
    }},
    EDITCARLIST {{
        cmd = new CmdEditCarList();
    }},
    CARLIST{{
       cmd = new CmdCarList();
    }},
    ERROR {{
        cmd = new CmdError();
    }},
    RESET {{
        cmd = new CmdReset();
    }};

    public String getJsp() {
        return "/" + this.cmd.toString().toLowerCase() + ".jsp";
    }

    public Cmd cmd = new CmdError();
}
