/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copy.constructor;

/**
 *
 * @author cui
 */
public class Copy {
    int a;
    double b;
    public Copy(){
         this.a=10;
        this.b=10.5;
        System.out.println(a+"\n"+b+"\n");
    }
    public Copy(Copy r){
        this.a=r.a;
        this.b=r.b;
         System.out.println(a+"\n"+b+"\n");
    }
    
}
