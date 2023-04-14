package ex3;

public class employe {
    private int  mat;
    private String nom;
    private int id_sal;
    static float val=12;

    employe(int mat,String nom,int id_sal){
        this.mat=mat;
        this.nom=nom;
        this.id_sal=id_sal;
    }
    public float calcul_sal()
    {
        return((this.id_sal*val));
    }
    public String toString()
    {
     return("employe=> mat:"+Integer.toString(mat)+" nom:"+nom+" saleur"+ String.valueOf(calcul_sal()));
    }
    void affiche()
    {
        System.out.println("employe=> mat:"+mat+" nom:"+nom+" saleur"+ calcul_sal());
    }



}
