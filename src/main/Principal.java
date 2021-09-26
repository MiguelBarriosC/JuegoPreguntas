package main;

import clases.Categoria;
import clases.Juego;
import clases.Jugador;
import clases.Opcion;
import clases.Pregunta;
import clases.Premio;
import clases.Ronda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Categoria 1 Principiante
		Opcion [] opciones_1 = new Opcion[4];
		opciones_1[0] = new Opcion("Euro",false);
		opciones_1[1] = new Opcion("Dolar",false);
		opciones_1[2] = new Opcion("Peso colombiano",true);
		opciones_1[3] = new Opcion("Libra esterlina",false);
		
		Pregunta pregunta_1 = new Pregunta("¿Cual es la moneda de Colombia?",opciones_1);
		
		Opcion [] opciones_2 = new Opcion[4];
		opciones_2[0] = new Opcion("Español",true);
		opciones_2[1] = new Opcion("Mexicano",false);
		opciones_2[2] = new Opcion("Ruso",false);
		opciones_2[3] = new Opcion("Mandarin",false);
		
		Pregunta pregunta_2 = new Pregunta("¿Cual es la lengua oficial de Colombia?",opciones_2);
		
		Opcion [] opciones_3 = new Opcion[4];
		opciones_3[0] = new Opcion("Socialismo",false);
		opciones_3[1] = new Opcion("Republica presidencialista",true);
		opciones_3[2] = new Opcion("Capitalismo",false);
		opciones_3[3] = new Opcion("Feudalismo",false);
		
		Pregunta pregunta_3 = new Pregunta("¿Cual es la forma de gobierno de Colombia?",opciones_3);
		
		Opcion [] opciones_4 = new Opcion[4];
		opciones_4[0] = new Opcion("Cundinamarca",true);
		opciones_4[1] = new Opcion("Huila",false);
		opciones_4[2] = new Opcion("Antioquía",false);
		opciones_4[3] = new Opcion("Atlántico",false);
		
		Pregunta pregunta_4 = new Pregunta("¿Como se lama el departamento mas poblado de Colombia?",opciones_4);
		
		Opcion [] opciones_5 = new Opcion[4];
		opciones_5[0] = new Opcion("La Cordillera Oriental",false);
		opciones_5[1] = new Opcion("La Cordillera Occidental",false);
		opciones_5[2] = new Opcion("La Cordillera Central",false);
		opciones_5[3] = new Opcion("La Cordillera de los Andes",true);
		
		Pregunta pregunta_5 = new Pregunta("¿Qué cordillera atraviesa el territorio colombiano?",opciones_5);
		
		//Categoria 2 Basico
		
		Opcion [] opciones_6 = new Opcion[4];
		opciones_6[0] = new Opcion("Fernando Botero",true);
		opciones_6[1] = new Opcion("Diomedez Diaz",false);
		opciones_6[2] = new Opcion("Joe Arroyo",false);
		opciones_6[3] = new Opcion("Gabriel Garcia Marquez",false);
		
		Pregunta pregunta_6 = new Pregunta("¿De que artista colombiano es la obra La Mona Lisa a los 12 años?",opciones_6);
		
		Opcion [] opciones_7 = new Opcion[4];
		opciones_7[0] = new Opcion("El macizo colombiano",false);
		opciones_7[1] = new Opcion("El Páramo de Sonsón ",false);
		opciones_7[2] = new Opcion("El pico Cristóbal Colón",true);
		opciones_7[3] = new Opcion("La Cordillera de los Andes",false);
		
		Pregunta pregunta_7 = new Pregunta("¿Cuál es la montaña más alta de Colombia?",opciones_7);
		
		Opcion [] opciones_8 = new Opcion[4];
		opciones_8[0] = new Opcion("Aeropuerto Internacional Gustavo Rojas Pinilla",false);
		opciones_8[1] = new Opcion("Aeropuerto Internacional Palonegro",false);
		opciones_8[2] = new Opcion("Aeropuerto Internacional El Edén",false);
		opciones_8[3] = new Opcion("Aeropuerto internacional El Dorado",true);
		
		Pregunta pregunta_8 = new Pregunta("¿Cómo se llama el aeropuerto de Bogotá?",opciones_8);
		
		Opcion [] opciones_9 = new Opcion[4];
		opciones_9[0] = new Opcion("El girasol",false);
		opciones_9[1] = new Opcion("La orquídea",true);
		opciones_9[2] = new Opcion("La rosa roja",false);
		opciones_9[3] = new Opcion("La rosa blanca",false);
		
		Pregunta pregunta_9 = new Pregunta("¿Cuál es la flor nacional de Colombia?",opciones_9);
		
		Opcion [] opciones_10 = new Opcion[4];
		opciones_10[0] = new Opcion("Puerto de Buenaventura",true);
		opciones_10[1] = new Opcion("Puerto de Tumaco",false);
		opciones_10[2] = new Opcion("Puerto de la Guajira",false);
		opciones_10[3] = new Opcion("Puerto de Cartagena",false);
		
		Pregunta pregunta_10 = new Pregunta("¿Cuál es el principal puerto marítimo de Colombia?",opciones_10);
		
		//Categoria 3 Medio
		
		Opcion [] opciones_11 = new Opcion[4];
		opciones_11[0] = new Opcion("Jorge Isaacs",true);
		opciones_11[1] = new Opcion("Gabriel Garcia Marquez",false);
		opciones_11[2] = new Opcion("Francisco Segundo",false);
		opciones_11[3] = new Opcion("Paulo Cohelo",false);
		
		Pregunta pregunta_11 = new Pregunta("¿Qué colombiano escribió la famosa novela romántica Maria?",opciones_11);

		Opcion [] opciones_12 = new Opcion[4];
		opciones_12[0] = new Opcion("Cristobal Colon",false);
		opciones_12[1] = new Opcion("Amparo Grisales",false);
		opciones_12[2] = new Opcion("Alonso de Ojeda",true);
		opciones_12[3] = new Opcion("Los reptilianos",false);
		
		Pregunta pregunta_12 = new Pregunta("¿Quién comando la primera expedición a lo que hoy es Colombia en 1499?",opciones_12);
		
		Opcion [] opciones_13 = new Opcion[4];
		opciones_13[0] = new Opcion("Lago Bretaña",false);
		opciones_13[1] = new Opcion("Lago el Quimbo",false);
		opciones_13[2] = new Opcion("Lago de Tota",true);
		opciones_13[3] = new Opcion("Lago el Curibano",false);
		
		Pregunta pregunta_13 = new Pregunta("¿Cuál es el lago más grande de Colombia?",opciones_13);
		
		Opcion [] opciones_14 = new Opcion[4];
		opciones_14[0] = new Opcion("Gonzalo Jiménez de Quesada",true);
		opciones_14[1] = new Opcion("Rafael Maria Gomez",false);
		opciones_14[2] = new Opcion("Martin Elias Vargas",false);
		opciones_14[3] = new Opcion("Simón Bolívar",false);
		
		Pregunta pregunta_14 = new Pregunta("¿Quién fundó la ciudad Santa Fe de Bogotá?",opciones_14);
		
		Opcion [] opciones_15 = new Opcion[4];
		opciones_15[0] = new Opcion("En Florencia",false);
		opciones_15[1] = new Opcion("En Neiva",false);
		opciones_15[2] = new Opcion("En Soacha",true);
		opciones_15[3] = new Opcion("En Barranquilla",false);
		
		Pregunta pregunta_15 = new Pregunta("¿En qué minicipio se encuentra la catarata del salto del Tequendama?",opciones_15);
		
		//Categoria 4 Avanzado
		
		Opcion [] opciones_16 = new Opcion[4];
		opciones_16[0] = new Opcion("La Capitanía de Perú",false);
		opciones_16[1] = new Opcion("La Capitania de Nueva Granada",true);
		opciones_16[2] = new Opcion("La Capitania de Colombia",false);
		opciones_16[3] = new Opcion("La Capitania de EEUU",false);
		
		Pregunta pregunta_16 = new Pregunta("¿Qué capitanía del Virreinato de Perú gobernaba sobre el actual territorio colombiano?",opciones_16);
		
		Opcion [] opciones_17 = new Opcion[4];
		opciones_17[0] = new Opcion("Dinero",false);
		opciones_17[1] = new Opcion("El tiempo",false);
		opciones_17[2] = new Opcion("Semana",false);
		opciones_17[3] = new Opcion("La nacion",true);
		
		Pregunta pregunta_17 = new Pregunta("¿Cuál es el diario de mayor circulación en Colombia?",opciones_17);
		
		Opcion [] opciones_18 = new Opcion[4];
		opciones_18[0] = new Opcion("Simón Bolivar",true);
		opciones_18[1] = new Opcion("Jorge Yorente",false);
		opciones_18[2] = new Opcion("Isaac Newton",false);
		opciones_18[3] = new Opcion("Cristobal Colón",false);
		
		Pregunta pregunta_18 = new Pregunta("¿Quién propuso el nombre de Colombia aludiendo a Cristóbal Colón?",opciones_18);
		
		Opcion [] opciones_19 = new Opcion[4];
		opciones_19[0] = new Opcion("Republicas unidas",false);
		opciones_19[1] = new Opcion("Nueva Granada",false);
		opciones_19[2] = new Opcion("Colombia unida",false);
		opciones_19[3] = new Opcion("La Gran Colombia",true);
		
		Pregunta pregunta_19 = new Pregunta("¿Qué estado conformó Colombia junto con Venezuela, Ecuador y Panamá?",opciones_19);
		
		Opcion [] opciones_20 = new Opcion[4];
		opciones_20[0] = new Opcion("Antioquia",false);
		opciones_20[1] = new Opcion("Bogotá",true);
		opciones_20[2] = new Opcion("Barranquilla",false);
		opciones_20[3] = new Opcion("Manizales",false);
		
		Pregunta pregunta_20 = new Pregunta("¿Cuál es la capital de colombia?",opciones_20);
		
		//Categoria 5 Profeta
		
		Opcion [] opciones_21 = new Opcion[4];
		opciones_21[0] = new Opcion("Naciones unidas de Colombia",false);
		opciones_21[1] = new Opcion("La gran Colombia",false);
		opciones_21[2] = new Opcion("Estados Unidos de Colombia",true);
		opciones_21[3] = new Opcion("La nueva Colombia",false);
		
		Pregunta pregunta_21 = new Pregunta("¿Cómo pasó de llamarse Colombia tras la Constitución de Rionegro?",opciones_21);
		
		Opcion [] opciones_22 = new Opcion[4];
		opciones_22[0] = new Opcion("Cali",true);
		opciones_22[1] = new Opcion("Bogotá",false);
		opciones_22[2] = new Opcion("Barranquilla",false);
		opciones_22[3] = new Opcion("Manizales",false);
		
		Pregunta pregunta_22 = new Pregunta("¿Qué ciudad colombiana se conoce por ser la capital mundial de la salsa?",opciones_22);
		
		Opcion [] opciones_23 = new Opcion[4];
		opciones_23[0] = new Opcion("El río de los colores",false);
		opciones_23[1] = new Opcion("El río colorido",false);
		opciones_23[2] = new Opcion("El río de los cinco colores",true);
		opciones_23[3] = new Opcion("El río Magdalena",false);
		
		Pregunta pregunta_23 = new Pregunta("¿Qué río situado en la serranía de la Macarena posee un lecho que cambia de color?",opciones_23);
		
		Opcion [] opciones_24 = new Opcion[4];
		opciones_24[0] = new Opcion("Antioquia",false);
		opciones_24[1] = new Opcion("Bogotá",false);
		opciones_24[2] = new Opcion("Barranquilla",false);
		opciones_24[3] = new Opcion("Santa Marta",true);
		
		Pregunta pregunta_24 = new Pregunta("¿En qué ciudad de Colombia se encuentra la Ciudad Perdida?",opciones_24);
		
		Opcion [] opciones_25 = new Opcion[4];
		opciones_25[0] = new Opcion("El tratado de libre comercio",false);
		opciones_25[1] = new Opcion("El tratado de paz de Wisconsin",true);
		opciones_25[2] = new Opcion("Tratado Thomson-Urrutia",false);
		opciones_25[3] = new Opcion("El tratado de paz",false);
		
		Pregunta pregunta_25 = new Pregunta("¿Qué tratado dio fin a las guerra de los Mil Días?",opciones_25);
		
		// Arrays de preguntas por categoria
		//grupo 1
		Pregunta [] preguntas_cat_1 = new Pregunta[5];
		preguntas_cat_1[0] = pregunta_1;
		preguntas_cat_1[1] = pregunta_2;
		preguntas_cat_1[2] = pregunta_3;
		preguntas_cat_1[3] = pregunta_4;
		preguntas_cat_1[4] = pregunta_5;
		//grupo 2
		Pregunta [] preguntas_cat_2 = new Pregunta[5];
		preguntas_cat_2[0] = pregunta_6;
		preguntas_cat_2[1] = pregunta_7;
		preguntas_cat_2[2] = pregunta_8;
		preguntas_cat_2[3] = pregunta_9;
		preguntas_cat_2[4] = pregunta_10;
		//grupo 3
		Pregunta [] preguntas_cat_3 = new Pregunta[5];
		preguntas_cat_3[0] = pregunta_11;
		preguntas_cat_3[1] = pregunta_12;
		preguntas_cat_3[2] = pregunta_13;
		preguntas_cat_3[3] = pregunta_14;
		preguntas_cat_3[4] = pregunta_15;
		//grupo 4
		Pregunta [] preguntas_cat_4 = new Pregunta[5];
		preguntas_cat_4[0] = pregunta_16;
		preguntas_cat_4[1] = pregunta_17;
		preguntas_cat_4[2] = pregunta_18;
		preguntas_cat_4[3] = pregunta_19;
		preguntas_cat_4[4] = pregunta_20;
		//grupo 5
		Pregunta [] preguntas_cat_5 = new Pregunta[5];
		preguntas_cat_5[0] = pregunta_21;
		preguntas_cat_5[1] = pregunta_22;
		preguntas_cat_5[2] = pregunta_23;
		preguntas_cat_5[3] = pregunta_24;
		preguntas_cat_5[4] = pregunta_25;
		
		//Asignacion de preguntas a su categoria 
		Categoria principiante = new Categoria("Principiante",1,preguntas_cat_1);
		Categoria basico = new Categoria("Basico",2,preguntas_cat_2);
		Categoria medio = new Categoria("Medio",3,preguntas_cat_3);
		Categoria avanzado = new Categoria("Avanzado",4,preguntas_cat_4);
		Categoria profeta = new Categoria("Profeta",5,preguntas_cat_5);
		
		//Creacion de premio por ronda
		Premio premio_ronda_1 = new Premio("Efectivo",100000);
		Premio premio_ronda_2 = new Premio("Efectivo",200000);
		Premio premio_ronda_3 = new Premio("Efectivo",300000);
		Premio premio_ronda_4 = new Premio("Efectivo",400000);
		Premio premio_ronda_5 = new Premio("Efectivo",500000);
		
		//Creacion de rondas
		Ronda ronda_1 = new Ronda(principiante,premio_ronda_1);
		Ronda ronda_2 = new Ronda(basico, premio_ronda_2);
		Ronda ronda_3 = new Ronda(medio, premio_ronda_3);
		Ronda ronda_4 = new Ronda(avanzado, premio_ronda_4);
		Ronda ronda_5 = new Ronda(profeta, premio_ronda_5);
		
		//Creacion de array que contenga cada una de las rondas
		Ronda [] rondas = new Ronda[5];
		rondas[0] = ronda_1;
		rondas[1] = ronda_2;
		rondas[2] = ronda_3;
		rondas[3] = ronda_4;
		rondas[4] = ronda_5;
		
		//Creacion de el jugador	
		Jugador jugador = new Jugador("Miguel",21,"Colombia");
		
		//Creacion de juego
		Juego juego = new Juego(jugador,rondas);
		
		//Inicia el juego	
		juego.iniciaJuego();
		System.out.println("TE LLEVAS: $" + juego.getJugador().getPremioAcomulado());
	}

}
