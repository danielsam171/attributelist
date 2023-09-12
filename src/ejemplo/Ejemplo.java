package ejemplo;

import javax.management.AttributeList;
import javax.management.Attribute;

public class Ejemplo {

    public static void main(String[] args) {
        AttributeList list = new AttributeList();
        list.add(new Attribute("edad", 17));
        list.add(new Attribute("apellido", "Garcia"));
        list.add(new Attribute("documento", 101022));
        list.add(new Attribute("nombre", "daniel"));
        

        System.out.println("Atributos en la lista:");
        for (Object obj : list) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);
            }
        }
        System.out.println("");
        list.remove(1);
        System.out.println("Se quito el elemento que se encontraba en la posicion 1");
        for (Object obj : list) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);
            }
        }
        System.out.println("");
        System.out.println("Atributo que se encontraba en la posicion 0");
        System.out.println(list.get(0));
        System.out.println("");
        System.out.println("Se cambia la clave y el valor del atributo encontrado en la posicion 0");
        list.set(0, new Attribute("Estatura", 1.8));
        for (Object obj : list) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);

            }
        }
        System.out.println("\nSe mide la cantidad de atributos que tiene la lista list");
        
        System.out.println(list.size()+"\n");

        Attribute atributo = new Attribute("nombre", "sara");
        AttributeList list1 = new AttributeList();
        AttributeList list2 = new AttributeList();

        list1.add(atributo);
        list2.add(atributo);

        if (list1.equals(list2)) {
            System.out.println("Los dos attributeList son iguales");
        } else {
            System.out.println("Los dos attributeList son diferentes");
        }
        
        if (list1.equals(list)) {
            System.out.println("Los dos attributeList son iguales");
        } else {
            System.out.println("Los dos attributeList son diferentes");
        }

    }
}
