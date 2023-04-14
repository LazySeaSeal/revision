package ex3;

public class responsable extends employe{
    private String titre;
    private employe t[];

    responsable(int mat,String nom,int id_sal,String titre,employe t[]){
        super(mat,nom,id_sal);
        this.titre=titre;
        this.t=t;
    }
    public void direct()
    {
        for (int i=0;i<this.t.length;i++)
            System.out.println(t[i].toString());
    }
    public void indirect()
    {
        for (int i=0;i<this.t.length;i++) {
            if (!(t[i] instanceof responsable))
            {
                System.out.println(t[i].toString());
            }
            else
            {
                ((responsable) t[i]).indirect();
            }
    }


}
