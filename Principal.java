public class Principal{
    
    public static void bin(int n){
        if(n>1){
            bin(n/2);
            System.out.print(n%2);
        }
        else{
            System.out.print(n);
        }
    }
    
    public static void Hanoi(int N, char Ori, char Dest, char Apoio){
        if(N>1){
            Hanoi(N-1, Ori, Apoio, Dest);
            System.out.println("Mover anel " + N + " da torre " + Ori + " para a torre " + Dest);
            Hanoi(N-1, Apoio, Dest, Ori);
        }
        else{
            System.out.println("Mover anel 1 da torre " + Ori + " para a torre " + Dest);
        }
    }
    
    
    public static void main(String args[]){
        //bin(25);
        
        //Hanoi(40, 'A', 'C', 'B');    
        
        ListaR l = new ListaR();
        
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.push(60);
        l.push(10);
        
        System.out.println(l.quant(110));
        
        //l.show();
    }
}



