package encuestaUpqroo;

import encuestaUpqroo.LoginModel;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

public class LoginController extends SelectorComposer<Component> {
	@Wire
	private Component component;
	@Wire
	private Textbox username;
	@Wire
	private Textbox password;
	@Wire
	private Button login;
	
	private LoginModel Model;
	public String usuario="";
	public String pass="";
	
	
	@Listen("onClick=#login")
	public void signIn() {
		validate();
	}

	private void validate() {
		if ("".equals(username.getText())) {
			Messagebox.show("Ingresa el nombre de Usuario");
			username.setFocus(true);
		} else if ("".equals(password.getText())) {
			Messagebox.show("Ingresa la contraseña de Usuario");
			password.setFocus(true);
		} else if (username.getText().trim().equals("Shary")
				&& password.getText().trim().equals("201200166")) {
				usuario=username.getText().trim();
				pass=password.getText();
				
				Model=new LoginModel(username.getText(),password.getText());
				System.out.println(usuario);
				
			Executions.sendRedirect("/header.zul");
//			OnOpe
		} else {
			Messagebox.show("Invalido Nombre y Contraseña de ususrio");
			username.setText("");
			password.setText("");
			username.setFocus(true);
		}
	}
}
