/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
import java.util.Objects;
public class Location
{
    /** X and Y coordinates of this location. **/
    public int xCoord;
    public int yCoord;
    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }
    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    /** Реализация метода equals ()**/
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }
    /** реализация метода hashcode().**/
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }
}