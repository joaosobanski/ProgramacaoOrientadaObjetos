package controller;

import java.util.ArrayList;

public interface DefaultController {

    public static ArrayList<Object> buscar();

    public static boolean cadastrar(Object obj);

    public static boolean update(long id, Object obj);

    public static boolean remover(long id);

}
