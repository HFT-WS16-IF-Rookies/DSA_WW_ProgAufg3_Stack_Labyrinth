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

public abstract class Stack
{
    /**
     * gibt eine Versionsnummer zurück
     * diese Methode dient dazu, die verschiedenen Implementierungen zu unterscheiden;
     * für jede neue Implementierung muss der Text angepasst werden.
     * return "Aufgabe 1.a - Stack; Implementierung als Array mit Exception-Handling";
     * return "Version 1.b - Stack; Implementierung als verkettete Liste mit Exception-Handling";
     * @return type of stack implementation
     */
    public abstract String version();

    /**
     * leert den Stack
     */
    public abstract void empty();

    /**
     * legt ein Element auf den Stack
     *
     * @param element element das auf den Stack soll
     */
    public abstract void push(Object element) throws StackFullException;

    /**
     * nimmt ein Element vom Stack
     *
     * @return zuletzt auf den Stack gelegtes Element
     */
    public abstract Object pop()throws StackEmptyException;

    /**
     * Gibt die momentane Groesse des Stack zurueck
     *
     * @return Groesse des Stack
     */
    public abstract int size();

    /**
     * Prueft den Stack auf leer sein
     *
     * @return true wenn Stack leer ist
     */
    public abstract boolean isEmpty();

    /**
     * Prueft den Stack auf vollsein
     *
     * @return true wenn ein weiterer push eine Exception ausloesen wuerde
     */
    public abstract boolean isFull();

    /**
     * Liest das oberste Element vom Stack, ohne es vom Stack zu nehmen
     *
     * @return oberstes Stack Element
     */
    public abstract Object peek() throws StackEmptyException;

    /**
     * Gibt einen String aus, der den Stack repraesentiert.<br>
     * Format: Wert 1 Wert 2 Wert 3 [Top-Wert]
     *
     * @return String representation des Stack
     */
    @Override
    public abstract String toString();

}
