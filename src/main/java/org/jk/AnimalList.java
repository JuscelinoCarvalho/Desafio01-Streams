package org.jk;


import lombok.Getter;
import lombok.Setter;

import java.util.*;


@SuppressWarnings("ALL")
@Setter
@Getter
public class AnimalList implements List<Animal> {
    private List<Animal> objs = new ArrayList<>();

    public void toAnimalsString() {
        objs.forEach(p -> {
            System.out.println("\nAnimal: " + p.getNome() + " Pesando: " + p.getPeso() + "Kg  Do Tipo: " + p.getTipo());
        });
    }

    @Override
    public int size() {
        return objs.size();
    }

    @Override
    public boolean isEmpty() {
        return objs.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return objs.contains(o);
    }

    @Override
    public Iterator<Animal> iterator() {
        return objs.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return objs.toArray(a);
    }

    @Override
    public boolean add(Animal animal) {
        return this.objs.add(animal);
    }

    @Override
    public boolean remove(Object o) {
        return this.objs.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(objs).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Animal> c) {
        return objs.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Animal> c) {
        return objs.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return objs.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return objs.retainAll(c);
    }

    @Override
    public void clear() {
        objs.clear();
    }

    @Override
    public boolean equals(Object o) {
        return objs.equals(o);
    }

    @Override
    public int hashCode() {
        return objs.hashCode();
    }

    @Override
    public Animal get(int index) {
        return objs.get(index);
    }

    @Override
    public Animal set(int index, Animal element) {
        return objs.set(index, element);
    }

    @Override
    public void add(int index, Animal element) {
        objs.add(index, element);
    }

    @Override
    public Animal remove(int index) {
        return objs.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return objs.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return objs.lastIndexOf(o);
    }

    @Override
    public ListIterator<Animal> listIterator() {
        return objs.listIterator();
    }

    @Override
    public ListIterator<Animal> listIterator(int index) {
        return objs.listIterator(index);
    }

    @Override
    public List<Animal> subList(int fromIndex, int toIndex) {
        return objs.subList(fromIndex, toIndex);
    }
}
