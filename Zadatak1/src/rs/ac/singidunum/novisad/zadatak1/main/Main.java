package rs.ac.singidunum.novisad.zadatak1.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import rs.ac.singidunum.novisad.zadatak1.modeli.Radnik;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		List<Radnik> listaRadnika = Stream.iterate(0,n -> n+1)
		.map(r -> new Radnik())
		.limit(5) // proizvoljan broj radnika
		.collect(Collectors.toList());
		
//		prosek plate svih radnika
		double prosek = listaRadnika.stream().map(x -> x.getPlata()).reduce(0.0,Double::sum) / listaRadnika.size();
		System.out.println(prosek);
		
//		Loop kroz sve radnike
		for(Radnik r:listaRadnika) {
			System.out.println(r);
		}
		
		List<Radnik> filtriranaLista = listaRadnika.stream().filter(r -> r.getPlata() < prosek).collect(Collectors.toList());
		
		System.out.println("---------------------");
		
//		Loop kroz filtrirane radnike (radnici koji imaju manju platu od prosecne
		for(Radnik r:filtriranaLista) {
			System.out.println(r);
		}
		
//		Ova lista se zapisuje u file
		List<String> radniciUString = listaRadnika.stream().filter(r -> r.getPlata() < prosek).map(o -> o.toString()).collect(Collectors.toList());
		

//		Zapisivanje u file		
		Files.write(Paths.get("radnici.txt"),radniciUString);
		
		
		
		
	}

	
	
}
