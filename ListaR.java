public class ListaR{
    private NodeR inicio;
    
    public ListaR(){
        inicio = null;
    }   
    
    public void push(int v){
        if(inicio!=null){
            inicio.push(v);
        }
        else{
            inicio = new NodeR(v);
        }
    }
    
    public int length(){
        if(inicio!=null){
            return inicio.length();
        }
        else{
            return 0;
        }
    }
    
    public void show(){
        if(inicio!=null){
            inicio.show();
        }
    }
    
    public int quant(int v){
        if(inicio!=null){
            return inicio.quant(v);
        }
        else{
            return 0;
        }
    }
}
