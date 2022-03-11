import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    private void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Edmonton", "AB");
        assertEquals(list.hasCity(city), false);
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }

    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton", "AB");
        assertEquals(list.getCount(), 0);
        list.addCity(city);
        assertEquals(list.getCount(), 1);
        list.deleteCity(city);
        assertEquals(list.getCount(), 0);
    }
}