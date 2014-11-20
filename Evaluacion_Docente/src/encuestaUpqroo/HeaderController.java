package encuestaUpqroo;

import encuestaUpqroo.LoginModel;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;

public class HeaderController extends GenericForwardComposer<Component> {

	// public class HeaderController extends HtmlMacroComponent {
	@Wire
	private Label txtStudent;
	@Wire
	private Label txtClave;
	@Wire
	private Label lblCiclo;
	private LoginModel modelo;

	public HeaderController() {

		System.out.println("DENTRO");
	}

	@Override
public void doAfterCompose(Component component)throws Exception
{
	super.doAfterCompose(component);
	txtStudent.setValue(modelo.username);
	txtClave.setValue(modelo.password);
}

}
