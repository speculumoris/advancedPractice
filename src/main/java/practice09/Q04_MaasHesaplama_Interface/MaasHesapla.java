package practice09.Q04_MaasHesaplama_Interface;

public class MaasHesapla implements MaasArtir,Vergi{
    @Override
    public double yillikExtra(int calismaYili) {
        System.out.println("yillik extra :"+calismaYili*100);
        return calismaYili*100;
    }

    @Override
    public double saatlikExtre(int calismaSaati) {
        if (calismaSaati-160>0){
            System.out.println("saatlik extra :"+(calismaSaati-160)*10);
            return (calismaSaati-160)*10;

        }else {
            return 0;
        }
    }

    @Override
    public double vergi(double brüt, int calismaYili) {
        if (calismaYili>9){
            System.out.println("vergi = " + brüt*30/100);
            return brüt*30/100;

        }else {
            System.out.println("vergi = " + brüt*20/100);

            return brüt*20/100;
        }
    }
    public  double netMaas(double brutMaas,int calismaYili,int calismaSaati){

        return brutMaas+yillikExtra(calismaYili)+saatlikExtre(calismaSaati)-vergi(brutMaas,calismaYili);
    }
}
