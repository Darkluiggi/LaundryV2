/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
import javax.swing.SwingUtilities;

/**
 *
 * @author leoleguizamon
 */
public class LoginControl implements Controller {
    //private Sistema sistema = formularioFramePrincipal.sistema;

    private DAOUser dao;
    private String log;

    public LoginControl() {
        dao = new DAOUser();
        log = new String();
    }

    public String verifyLogin(User user) {
        if (!verifyNameLength(user.getUserName())) {
            return ("Longitud nombre incorrecta");
        }
        if (!verifyPasswordLength(user.getPassword())) {
            return ("Longitud contraseña incorrecta");
        }

        if (!dao.readLogin(user).equals("Wrong")) {
            log = dao.readLogin(user);
            if (log.equals("Administrador")) {
                return ("Administrador");
            } else {
                if (log.equals("Encargado de cabina")) {
                    return ("Encargado de cabina");
                }
            }
        }

        return ("Datos Incorrectos");
    }

    public boolean verifyNameLength(String name) {
        return (name.length() > 1 && name.length() <= 8);

    }

    public boolean verifyPasswordLength(String password) {
        return (password.length() >= 3 && password.length() < 8);
    }

    @Override
    public void executeCallBack(Runnable callback) {
        SwingUtilities.invokeLater(callback);
    }

}
