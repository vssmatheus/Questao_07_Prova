package br.com.questao07Prova;
public class Fibonacci {    
 
    static long fi(int n) {
        int F = 0;     
        int ant = 0;   
  
        for (int i = 1; i <= n; i++) {
  
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
  
        }
  
        return F;
    }
  
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
           System.out.print(Fibonacci.fi(i) +" ");
            
        }
  
    }
}

