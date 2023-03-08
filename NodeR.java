public class NodeR{
    private int x;
    private NodeR prox;

    public NodeR(int v){
        x = v;
        prox = null;
    }

    public void push(int v){
        if(prox!=null){
            prox.push(v);
        }
        else{
            prox = new NodeR(v);
        }
    }
    
    public int length(){
        int s = 0;
        if(prox!=null){
            s = prox.length();
        }
        return 1+s;
    }
    
    public void show(){
        System.out.println(x);
        if(prox!=null){
            prox.show();
        }        
    }
    
    public int quant(int v){
        int q = 0;
        if(prox!=null){
            q = prox.quant(v);
        }
        
        if(x == v){
            return 1+q;
        }
        else{
            return q;
        }
        
    }
}



