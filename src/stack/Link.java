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

 /*
 * Klasse zur Realisierung einer verketteten Listen;
 * "data" nimmt die Datenelement auf; 
 * "next" verweist auf das nächste Element der Liste oder ist "null"
 */
package stack;

public class Link
{

    private Object data;
    private Link next;
    private int element;

    public Link()
    {
        // Erzeugt ein neues, leeres Link-Objekt
        this.data = null;
        this.next = null;
        this.element = 1;
    }

    public Link(Object data)
    {
        // Erzeugt ein neues, gefülltes Link-Objekt
        this.data = data;
        this.next = null;
        this.element = 1;
    }

    public Link(Object data, Link next)
    {
        this(data);
        this.next = next;
        if (this.next == null)
            this.element = 1;
        else
            this.element = this.next.element +1;
    }

    public Object getData()
    {
        return data;
    }

    public Link getNext()
    {
        return next;
    }

    public int getElement()
    {
        return this.element;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public void setNext(Link next)
    {
        this.next = next;
    }
}
