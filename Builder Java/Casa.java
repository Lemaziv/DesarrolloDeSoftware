public class Casa {
    String MiCasa=null;

    Casa(){
        MiCasa="";
    }

    public Casa Techo(){
        this.MiCasa+="Techo ";
        return this;
    }
    public Casa Pared(){
        this.MiCasa+="Pared ";
        return this;
    }
    public Casa Puerta(){
        this.MiCasa+="Puerta ";
        return this;
    }
    public void printHouse(){
        System.out.println(MiCasa);
    }
}
