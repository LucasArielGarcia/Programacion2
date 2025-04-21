package Principal;
import apis.*;
import implementaciones.*;
import impl.*;

public class ClasePrincipal {

	public static void main(String[] args) {
		PilaTDA pila = new PilaLD();
		Implementaciones implementaciones = new Implementaciones();
		pila.inicializarPila();
		pila.apilar(1);
		pila.apilar(2);
		pila.apilar(3);
		implementaciones.invertir(pila);
		implementaciones.mostrar(pila);
		System.out.print("Elementos sumados "+implementaciones.sumarElementos(pila));
	}

}
