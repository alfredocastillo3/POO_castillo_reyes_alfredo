import javax.swing.JOptionPane;

public class PasajerosQuePasanPorUnPeaje {

	public static void main (String[] args) {
		int peajes, tipo_de_vehiculo, turno, vehiculos_por_combi, vehiculos_por_minivan;
		int vehiculos_por_omnibus;
		double cantidad_de_pasajeros, peaje, peajes_de_combis, peajes_de_la_manana, peajes_de_la_noche;
		double peajes_de_la_tarde, peajes_de_minivans, peajes_de_omnibus, promedio_de_peajes, total_de_pasajeros;
		double total_de_peajes;
		peajes = 0;
		vehiculos_por_combi = 0;
		vehiculos_por_minivan = 0;
		vehiculos_por_omnibus = 0;
		peajes_de_combis = 0;
		peajes_de_la_manana = 0;
		peajes_de_la_noche = 0;
		peajes_de_la_tarde = 0;
		peajes_de_minivans = 0;
		peajes_de_omnibus = 0;
		promedio_de_peajes = 0;
		total_de_pasajeros = 0;
		total_de_peajes = 0;
		do {
			cantidad_de_pasajeros = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de cantidad de pasajeros"));
			tipo_de_vehiculo = JOptionPane.showOptionDialog(null, "Selecciona el valor de tipo_de_vehiculo.",
				"Algoritmo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"\u00D3mnibus", "Minivan", "Combi"}, null) + 1;
			turno = JOptionPane.showOptionDialog(null, "Selecciona el valor de turno.",
				"Algoritmo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				new String[]{"Ma\u00F1ana", "Tarde", "Noche"}, null) + 1;
			peaje=0;
			if(tipo_de_vehiculo==1)
			{
				peaje=15*cantidad_de_pasajeros;
				peajes_de_omnibus=peajes_de_omnibus+peaje*cantidad_de_pasajeros;
				vehiculos_por_omnibus=vehiculos_por_omnibus+1;
			}
			if(tipo_de_vehiculo==2)
			{
				peaje=8*cantidad_de_pasajeros;
				peajes_de_minivans=peajes_de_minivans+peaje*cantidad_de_pasajeros;
				vehiculos_por_minivan=vehiculos_por_minivan+1;
			}
			if(tipo_de_vehiculo==3)
			{
				peaje=10*cantidad_de_pasajeros;
				peajes_de_combis=peajes_de_combis+peaje*cantidad_de_pasajeros;
				vehiculos_por_combi=vehiculos_por_combi+1;
			}
			if(turno==1)
				peajes_de_la_manana=peajes_de_la_manana+peaje;
			if(turno==2)
				peajes_de_la_tarde=peajes_de_la_tarde+peaje;
			if(turno==3)
				peajes_de_la_noche=peajes_de_la_noche+peaje;
			total_de_peajes=total_de_peajes+peaje*cantidad_de_pasajeros;
			total_de_pasajeros=total_de_pasajeros+cantidad_de_pasajeros;
			peajes=peajes+1;
			JOptionPane.showMessageDialog(null,
				"Valor de peaje: " + peaje);
		} while (JOptionPane.showConfirmDialog(null, "\u00BFDeseas repetir el proceso?",
			null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION);
		if (peajes == 0) {
			promedio_de_peajes = 0;
		} else {
			promedio_de_peajes=total_de_peajes/peajes;
		}
		JOptionPane.showMessageDialog(null,
			"Valor de peajes: " + peajes + "\n" +
			"Valor de vehiculos por combi: " + vehiculos_por_combi + "\n" +
			"Valor de vehiculos por minivan: " + vehiculos_por_minivan + "\n" +
			"Valor de vehiculos por omnibus: " + vehiculos_por_omnibus + "\n" +
			"Valor de peajes de combis: " + peajes_de_combis + "\n" +
			"Valor de peajes de la manana: " + peajes_de_la_manana + "\n" +
			"Valor de peajes de la noche: " + peajes_de_la_noche + "\n" +
			"Valor de peajes de la tarde: " + peajes_de_la_tarde + "\n" +
			"Valor de peajes de minivans: " + peajes_de_minivans + "\n" +
			"Valor de peajes de omnibus: " + peajes_de_omnibus + "\n" +
			"Valor de promedio de peajes: " + promedio_de_peajes + "\n" +
			"Valor de total de pasajeros: " + total_de_pasajeros + "\n" +
			"Valor de total de peajes: " + total_de_peajes);
	}

}