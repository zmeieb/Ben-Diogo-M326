//Project: Flix Bus Switzerland
//Titel: Platform.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meierpackage flixBusSwitzerland;

package flixBusSwitzerland;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Main.creations();


        System.out.println("Choose your action:");
        System.out.println("=========================");
        System.out.println("[1] View Departures");
        System.out.println("[2] Generate new Trip");
        System.out.println("[x] Beenden");
    }

    public static void creations(){
        List<Platform> platforms = new List<Platform>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Platform> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Platform platform) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Platform> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Platform> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Platform get(int index) {
                return null;
            }

            @Override
            public Platform set(int index, Platform element) {
                return null;
            }

            @Override
            public void add(int index, Platform element) {

            }

            @Override
            public Platform remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Platform> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Platform> listIterator(int index) {
                return null;
            }

            @Override
            public List<Platform> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        //Platform Creation
        Platform platform1 = new Platform(1, 6, "international", "large", true);
        Platform platform2 = new Platform(2, 6, "national", "large", false);
        Platform platform3 = new Platform(3, 3, "international", "small", false);
        Platform platform4 = new Platform(4, 3, "national", "small", true);
        //adding Platforms
        platforms.add(platform1);
        platforms.add(platform2);
        platforms.add(platform3);
        platforms.add(platform4);
        //Bus Terminal Creation
        BusTerminal busTerminal = new BusTerminal("Bus Terminal Zürich", platforms);


    }
}