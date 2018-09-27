package andi.com;

import andi.com.model.Artist;
import andi.com.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        if(!dataSource.open()) {
            System.out.println("Can't open Datasource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists();
        if(artists == null) {
            System.out.println("No artists");
            return;
        }

        artists.forEach(a -> System.out.println("test" + a.getName()));

        dataSource.close();
    }
}
