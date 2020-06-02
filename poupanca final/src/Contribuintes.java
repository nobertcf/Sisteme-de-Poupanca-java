
public class Contribuintes {
    private int id;
    private String nome;
    private String morada;
    private int cell;

    public Contribuintes() {
    }
    
   public Contribuintes (int Id,String nome, String Morada,int cell ){
       this.id=id;
       this.nome=nome;
       this.morada=morada;
       this.cell=cell;
       
   }

   
   
   public int getId(){
       return id;
   }
   public void setId(int id){
       this.id=id;
   } 
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

   
}
