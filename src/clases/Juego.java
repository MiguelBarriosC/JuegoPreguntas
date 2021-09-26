package clases;

import javax.swing.JOptionPane;
import conn.ConexionDb;
import java.sql.*;

public class Juego {
	private Jugador jugador;
	private Ronda[] rondas;
	private int nivel;
	
	public Juego(Jugador jugador, Ronda[] rondas) {
		this.jugador = jugador;
		this.rondas = rondas;
		this.nivel = 0;
	}
	
	public void iniciaJuego() {
		//Etiqueta rondaFor para controlar el ciclo
		rondaFor:for (int i = 0; i < rondas.length; i++) {
			Ronda ronda = rondas[i];//Primera ronda
			int premio = ronda.getPremio().getValor();//Obtiene el premio por ronda	
			byte aleatorio = generarAleatorio();//Selecciona pregunta aleatoria
			Pregunta pregunta = ronda.getCategoria().getPreguntas()[aleatorio];
			nivel = i + 1;//Se asigna el nivel
			System.out.println("Nivel " + nivel );//Imprime el nivel
			mostrarPregunta(pregunta, i);//Imprime la pregunta y sus opciones
			String respuesta = responderPregunta();//Obtiene respuesta de la pregunta
			switch (respuesta) {//Si la respuesta es valida aumenta el nivel y pasa a la siguiente ronda de lo contrario se finaliza el juego y guarda los datos
			case "a"://verifica si la opcion "a" es valida
				if (pregunta.getOpciones()[0].isValid()) {
					jugador.setPremioAcomulado(premio);
					if (nivel == rondas.length) {//Si es el ultimo nivel guarda datos y temina el juego
						guardarDatos();
						System.out.println("FELICIDADES!!! HAS GANADO");
						break rondaFor;
					}
					continue rondaFor;
				} else {
					System.out.println("Respuesta incorrecta, juego terminado");
					guardarDatos();
					break rondaFor;
				}
			case "b"://verifica si la opcion "b" es valida 
				if (pregunta.getOpciones()[1].isValid()) {
					jugador.setPremioAcomulado(premio);
					if (nivel == rondas.length) {//Si es el ultimo nivel guarda datos y temina el juego
						guardarDatos();
						System.out.println("FELICIDADES!!! HAS GANADO");
						break rondaFor;
					}
					continue rondaFor;
				} else {
					System.out.println("Respuesta incorrecta, juego terminado");
					guardarDatos();
					break rondaFor;
				}
			case "c"://verifica si la opcion "c" es valida, sino es valida guarda los datos y termina el juego
				if (pregunta.getOpciones()[2].isValid()) {
					jugador.setPremioAcomulado(premio);
					if (nivel == rondas.length) {//Si es el ultimo nivel guarda datos y temina el juego
						guardarDatos();
						System.out.println("FELICIDADES!!! HAS GANADO");
						break rondaFor;
					}
					continue rondaFor;
				} else {
					System.out.println("Respuesta incorrecta, juego terminado");
					guardarDatos();
					break rondaFor;
				}
			case "d"://verifica si la opcion "d" es valida
				if (pregunta.getOpciones()[3].isValid()) {
					jugador.setPremioAcomulado(premio);
					if (nivel == rondas.length) {//Si es el ultimo nivel guarda datos y temina el juego
						guardarDatos();
						System.out.println("FELICIDADES!!! HAS GANADO");
						break rondaFor;
					}
					continue rondaFor;
				} else {
					System.out.println("Respuesta incorrecta, juego terminado");
					guardarDatos();
					break rondaFor;
				}
			case "0"://Fin del juego voluntario
				guardarDatos();
				System.out.println("Juego terminado voluntariamente");
				break rondaFor;
			default: //Si la respuesta es desconocida termina el juego
				System.out.println("Entrada invalida juego terminado!");
				break rondaFor;
			}
		}
	}
	//Genera un numero aleatorio entre 0 y 4
	public byte generarAleatorio() {
		int a, b;
		a = 0; b = 4;
		byte aleatorio = (byte)Math.floor(Math.random()*(b-a+1)+a);
		return aleatorio;
	}
	//Imprime la pregunta
	private void mostrarPregunta(Pregunta pregunta, int index) {
		System.out.println(index + 1 + ". " + pregunta.getText());
		System.out.println("a. " + pregunta.getOpciones()[0].getText());
		System.out.println("b. " + pregunta.getOpciones()[1].getText());
		System.out.println("c. " + pregunta.getOpciones()[2].getText());
		System.out.println("d. " + pregunta.getOpciones()[3].getText());
		System.out.println("0. Retirarse");
		System.out.println();
	}
	//Devuelve la respuesta
	private String responderPregunta() {
		String respuesta = JOptionPane.showInputDialog( "Ingrese su respuesta" );
		return respuesta;
	}
	//Almacena datos del jugador en db
	private void guardarDatos() {
		ConexionDb conn = new ConexionDb();//Instancia de clase ConexionDb
		conn.establecerConexion();
		Connection conexion = conn.getConexion();
		try {
			PreparedStatement preparedStatement= conexion.prepareStatement("insert into historial(nombre,edad,pais,premio_acomulado) values(?,?,?,?)");
			//Da valores a cada parametro
			preparedStatement.setString(1,jugador.getNombre());
			preparedStatement.setInt(2, jugador.getEdad());
			preparedStatement.setString(3, jugador.getPais());
			preparedStatement.setInt(4, jugador.getPremioAcomulado());
			preparedStatement.executeUpdate();//Ejecuta Query
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				conn.cerrarConexion();//Cierra la conexion
		    }          
	}
	
	public Ronda[] getRondas() {
		return this.rondas;
	}
	
	public Jugador getJugador() {
		return this.jugador;
	}
	public int getNivel() {
		return nivel;
	}
	//falta imprimir el premio que gano cuando gana completo cuando pierde y cuando se retira y subir a github
}
