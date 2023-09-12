package ejemplo;

import javax.management.AttributeList;
import javax.management.Attribute;

public class Ejemplo {

    public static void main(String[] args) {
        AttributeList nose = new AttributeList();
        nose.add(new Attribute("edad", "hola"));
        nose.add(new Attribute("nombre", "daniel"));
        nose.add(new Attribute("edad", 17));
        nose.add(new Attribute("fecha", 28));

        System.out.println("Atributos en la lista:");
        for (Object obj : nose) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);
            }
        }
        System.out.println("");
        nose.remove(1);
        System.out.println("Se quito el elemento que se encontraba en la posicion 1");
        for (Object obj : nose) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);
            }
        }
        System.out.println("");
        System.out.println(nose.get(0));
        System.out.println("");
        nose.set(0, new Attribute("jojo", 54));
        for (Object obj : nose) {
            if (obj instanceof Attribute) {
                Attribute attribute = (Attribute) obj;
                String name = attribute.getName();
                Object value = attribute.getValue();
                System.out.println(name + ": " + value);

            }
        }
        System.out.println(nose.size());

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
        
        if (list1.equals(nose)) {
            System.out.println("Los dos attributeList son iguales");
        } else {
            System.out.println("Los dos attributeList son diferentes");
        }

    }
}
