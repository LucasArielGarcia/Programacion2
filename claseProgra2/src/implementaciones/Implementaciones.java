package implementaciones;
import apis.*;
import impl.*;
public class Implementaciones {
	public void pasar(PilaTDA pilaVieja,PilaTDA pilaNueva) {
		while (!pilaVieja.pilaVacia()) {
			pilaNueva.apilar(pilaVieja.tope());
			pilaVieja.desapilar();
		}
	}
	public PilaTDA copiar(PilaTDA pila) {
		PilaTDA pilaCopia = new PilaLD();
		PilaTDA pilaAuxiliar = new PilaLD();
		pilaAuxiliar.inicializarPila();
		pilaCopia.inicializarPila();
		pasar(pila,pilaAuxiliar);
		while(!pilaAuxiliar.pilaVacia()) {
			pila.apilar(pilaAuxiliar.tope());
			pilaCopia.apilar(pilaAuxiliar.tope());
			pilaAuxiliar.desapilar();
		}
		return pilaCopia;
	}
	public void mostrar(PilaTDA pilaMostrar) {
		PilaTDA pilaCopia = new PilaLD();
		pilaCopia.inicializarPila();
		pilaCopia = copiar(pilaMostrar);
		while(!pilaCopia.pilaVacia()) {
			System.out.print(pilaCopia.tope()+" ");
			pilaCopia.desapilar();
		}
	}
	public void invertir(PilaTDA pila) {
		PilaTDA pilaInverPilaTDA = new PilaLD();
		pilaInverPilaTDA.inicializarPila();
		pilaInverPilaTDA = copiar(pila);
		while(!pila.pilaVacia()) {
			pila.desapilar();
		}
		pasar(pilaInverPilaTDA, pila);
	}
	
	public int contarElementos(PilaTDA pilaTDA) {
		int cantidadElementos = 0;
		PilaTDA copiaPila = new PilaLD();
		copiaPila.inicializarPila();
		copiaPila=copiar(pilaTDA);
		while(!copiaPila.pilaVacia()) {
			cantidadElementos++;
			copiaPila.desapilar();
		}
		return cantidadElementos;
	}
	
	public int sumarElementos(PilaTDA pila) {
		int elementosSumados = 0;
		PilaTDA copiarPila = new PilaLD();
		copiarPila.inicializarPila();
		copiarPila = copiar(pila);
		while(!copiarPila.pilaVacia()) {
			elementosSumados += copiarPila.tope();
			copiarPila.desapilar();
		}
		return elementosSumados;
	}
	
	// COLA
	
	
	
	
	
	
	
	

}
