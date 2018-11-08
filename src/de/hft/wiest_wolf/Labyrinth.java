package de.hft.wiest_wolf;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Lukas Wiest
 * @author Erik Wolf
 */
public class Labyrinth
{
    private final Feld[] data;
    private final int rows;
    private final int columns;

    public Labyrinth()
    {
        this.rows = 7;
        this.columns = 19;

        data = new Feld[this.rows * this.columns];
        for (int i=0; i < this.columns * this.rows; i++)
        {   // init array with new Feld instances
            this.data[i] = new Feld();
        }

        for (int i=0; i < this.columns; i++)
        {   // lock top and bottom border
            this.data[i].lock();
            this.data[i+((this.rows-1)*this.columns)].lock();
        }

        for (int i=0; i < data.length; i += this.columns)
        {   // lock left and right border
            this.data[i].lock();
            this.data[i+this.columns-1].lock();
        }

        // list of border-fields
        Koordinate[] lockedFields = new Koordinate[]
        {
            new Koordinate(2, 2),
            new Koordinate(3, 2),
            new Koordinate(4, 2),
            new Koordinate(5, 2),
            new Koordinate(7, 2),
            new Koordinate(8, 2),
            new Koordinate(8, 1),
            new Koordinate(10, 2),
            new Koordinate(11, 2),
            new Koordinate(13, 2),
            new Koordinate(14, 2),
            new Koordinate(15, 2),
            new Koordinate(16, 2),
            new Koordinate(2,3),
            new Koordinate(5, 3),
            new Koordinate(10, 3),
            new Koordinate(14, 3),
            new Koordinate(2, 4),
            new Koordinate(5, 4),
            new Koordinate(6, 4),
            new Koordinate(7, 4),
            new Koordinate(8, 4),
            new Koordinate(9, 4),
            new Koordinate(10, 4),
            new Koordinate(11, 4),
            new Koordinate(12, 4),
            new Koordinate(13, 4),
            new Koordinate(14, 4),
            new Koordinate(15, 4),
            new Koordinate(16, 4)
        };

        // mark border fields as locked
        Arrays.asList(lockedFields).stream().forEach(this::lockField);

        // place cheese on a random non border field
        List<Feld> freeFields = Arrays.asList(data).stream().filter(f -> !f.isLocked).collect(Collectors.toList());
        Random rand = new Random();
        int random = rand.nextInt(freeFields.size());
        freeFields.get(random).setCheese();
        freeFields.remove(random);
    }

    public Koordinate placeMaus()
    {
        List<Feld> freeFields = Arrays.asList(data).stream().filter(f -> !f.isLocked && !f.hasCheese()).collect(Collectors.toList());
        Random rand = new Random();
        int random = rand.nextInt(freeFields.size());
        Feld maus = freeFields.get(random);

        Koordinate startKoordinate = null;
        for (int i=0; i < rows * columns; i++)
        {
            if (maus == data[i])
            {
                startKoordinate = new Koordinate(i % columns, i / columns);
                break;
            }
        }

        return startKoordinate;
    }

    public FieldState checkField(Koordinate k)
    {
        Feld f = getFieldonKoordinate(k);

        if (f.isCheese)
            return FieldState.CHEESE;

        if (f.isLocked)
            return FieldState.LOCKED;

        return FieldState.FREE;
    }

    public void lockField(Koordinate k)
    {
        getFieldonKoordinate(k).lock();
    }

    public Feld getFieldonKoordinate(Koordinate k)
    {
        return data[k.x + (k.y * columns)];
    }

    public class Feld
    {
        private boolean isCheese = false;
        private boolean isLocked = false;

        public boolean isLocked()
        {
            return isLocked;
        }

        public void setCheese()
        {
            isCheese = true;
        }

        public boolean hasCheese()
        {
            return isCheese;
        }

        public void lock()
        {
            isLocked = true;
        }
    }

    public static class Koordinate
    {
        public final int x;
        public final int y;

        public Koordinate(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString()
        {
            return "(" + x + "|" + y + ")\n";
        }
    }

    public enum FieldState
    {
        FREE,
        LOCKED,
        CHEESE
    }
}
