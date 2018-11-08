package de.hft.wiest_wolf;

import de.hft.wiest_wolf.Labyrinth.Koordinate;
import de.hft.wiest_wolf.Labyrinth.FieldState;

/**
 *
 * @author Lukas Wiest
 * @author Erik Wolf
 */
public class Maus
{
    Koordinate pos;
    int direction;
    Labyrinth lab;
    ListStack route;

    public Maus()
    {
        direction = 0;
        lab = new Labyrinth();
        pos = lab.placeMaus();
        route = new ListStack();
    }

    public static void main(String[] args)
    {
        Maus m = new Maus();
        stack.Stack route = m.cheeseFinder();
        System.out.println(route);
    }

    public stack.Stack cheeseFinder()
    {
        int counter = 0;
        while(true)
        {
            Koordinate next = getNextKoordinate();
            FieldState state = lab.checkField(next);

            switch (state)
            {
                case CHEESE:
                    route.push(pos);
                    route.push(next);
                    return route;

                case FREE:
                    counter = 0;
                    route.push(pos);
                    lab.lockField(pos);
                    pos = next;
                    continue;

                case LOCKED:
                    if (++counter > 3)
                    {
                        lab.lockField(pos);
                        pos = (Koordinate) route.pop();
                        counter = 0;
                    }
                    else
                    {
                        direction++;
                        direction %= 4;
                    }
                    break;
            }
        }
    }

    public Koordinate getNextKoordinate()
    {
        Koordinate next = null;
        switch(direction)
        {
            case 0:
                next = new Koordinate(pos.x +1, pos.y);
                break;
            case 1:
                next = new Koordinate(pos.x, pos.y -1);
                break;
            case 2:
                next = new Koordinate(pos.x -1, pos.y);
                break;
            case 3:
                next = new Koordinate(pos.x, pos.y +1);
        }

        return next;
    }

}
