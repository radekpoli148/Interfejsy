/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfejsy;

import java.util.Arrays;
import java.util.Collections;

public class Interfejsy {

    public static void main(String[] args) 
    {
        //nazwaInterfejsu a = new Pracownik();
        
        //((Pracownik)a).getWynagrodzenie();//rzutowanie w dół
        
        System.out.println(nazwaInterfejsu.PI);
        
        int[] tab = new int[3];
        
        tab[0] = 3;
        tab[1] = -2;
        tab[2] = 7;
        
        Arrays.sort(tab);
        
        System.out.println(tab[0]);//teraz 1 wartość to -2
        
        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(3000);
        pracownik[2] = new Pracownik(5000);
        
        System.out.println("Przed sortowaniem: ");
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        
        System.out.println(pracownik[0].compareTo(pracownik[1]));
        Arrays.sort(pracownik, Collections.reverseOrder());
        System.out.println("Po sortowniu: ");
        
        for (Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        
    }
    
}

interface nazwaInterfejsu
{
    double PI = 3.14;//public static final
    
    void cos();
}

class Pracownik implements nazwaInterfejsu, Comparable
{

    @Override
    public void cos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    private double wynagrodzenie;
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) 
    {
        Pracownik przyslany = (Pracownik)o;
        
        if(this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
        else if(this.wynagrodzenie > przyslany.wynagrodzenie)
            return 1;
        
        return 0;
    }
    
}