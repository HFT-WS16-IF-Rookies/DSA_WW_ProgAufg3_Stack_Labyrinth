/*---------------------------------------------------
 * Hochschule für Technik Stuttgart
 * Fachbereich Vermessung, Informatik und Mathematik
 * Schellingstr. 24
 * D-70174 Stuttgart
 *
 * Volker Coors, Markus Deininger
 * 17.10.2008
 *
 * Datenstrukturen und Algorithmen
 * SG Informatik und SG Informationslogistik
 *
 * Hausübung 3: ADT Stack
 * 
 * ------------------------------------------------*/

package stack;
/*
 * Aufgabe 1.a - Stack Implementierung als Array mit Exception-Handling
 * 
 * Vervollständigen Sie zunächst die Klasse Stack. Diese Klasse repräsentiert
 * einen Stack der beliebige Objekte aufnimmt.
 * Ergänzen Sie den Stack um eine Fehlerbehandlung für leere und volle Stacks. 
 * Nutzen Sie dazu die beiden Fehlerklassen StackEmptyException und
 * StackFullException. Die Fehler sollen ausgelöst werden, wenn eine Operation
 * einen Stacküberlauf oder Stackunterlauf verursachen würde.
 * Hinweis: dazu müssen Sie die Signatur einiger Stack-Methoden anpassen.
 * 
 *  Aufgabe 1.b - Stack Implementierung als verkettete Liste mit Exception-Handling
 *  
 *  Bauen Sie die Klasse Stack wie in der Vorlesung dargestellt um, so dass die
 *  Datenhaltung statt in einem Array nun als verkettete Liste erfolgt.
 *  Nutzen Sie dazu die Klasse Link. Realisieren Sie die Methode toString so,
 *  dass der Stack beginnend mit dem untersten Element ausgegeben wird.
 *  Optimieren Sie den Stack so, dass alle Methoden (außer toString) nun die
 *  Komplexität O(1) besitzen. 
 *  Zusatzaufgabe: Wie könnten Sie die Methode toString ebenfalls mit O(1) realisieren? 
 */

public class Stack{
	
	
	// Implementierung der Methoden hier ...
	
	
	public String version(){		// gibt eine Versionsnummer zurück
		// diese Methode dient dazu, die verschiedenen Implementierungen zu unterscheiden;
		// für jede neue Implementierung muss der Text angepasst werden.
			return "Aufgabe 1.a - Stack; Implementierung als Array mit Exception-Handling";
			// return "Version 1.b - Stack; Implementierung als verkettete Liste mit Exception-Handling";
		}
	
	public void empty(){			// leert den Stack
		//Methoden ...
	}
	
	public void push(Object element){	// legt ein Element auf den Stack
		//Methoden ...
	}

	public Object pop(){				// nimmt ein Element vom Stack
		//Methoden ...
		return null; // Dummy-Wert
	}
	
	public int size(){				// aktuelle Anzahl Elemente in Stack
		//Methoden ...
		return 0; // Dummy-Wert
	}
	
	public boolean isEmpty(){		// ist der Stack leer?
		//Methoden ...
		return true; // Dummy-Wert
	}
	
	public boolean isFull(){		// ist der Stack voll?
		//Methoden ...
		return true; // Dummy-Wert
	}
	
	public Object peek(){			// liest oberstes Element vom Stack, 
									// ohne es zu vom Stack zu entfernen
		//Methoden ...
		return null; // Dummy-Wert
	}

	
	public String toString(){		// Gibt einen String aus, der den Stack repräsentiert;
									// Format: Wert1 Wert2 Wert3 [Top-Wert]
									//	also z.B. 5 8 1 10 [9]
		//Methoden ...
		return "[x]"; // Dummy-Wert
	}
	
}
