import dbveiksmai.DuonbazesVeiksmai;
import dbveiksmai.IngridentoVeiksmai;
import dbveiksmai.ReceptoVeiksmai;
import entity.Indigrientas;
import entity.Receptai;
import utility.KonsolesVeiksmai;
import utility.PapildomiVeiksmai;

import java.sql.Connection;
import java.util.ArrayList;

public class PagrindinePrograma {
    public static void main(String[] args) {
        DuonbazesVeiksmai DuombazesVeiksmai = null;
        Connection jungtis = DuombazesVeiksmai.prisijungtiPrieDuombazes();

        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        ArrayList<Indigrientas> visiIngredijentai = new ArrayList<>();

        int pasirinkimas = KonsolesVeiksmai.meniuPasirinkimai();
<<<<<<< HEAD
=======





>>>>>>> 70f4713f7680a21770aff22312c4b744ea3c952c

        switch (pasirinkimas) {
            case 1:
                visiReceptai = ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
                PapildomiVeiksmai.isvestiListaEilutemis(visiReceptai);
                break;
            case 2:
                Double kainuVidurkis = IngridentoVeiksmai.kainuVidurkis(jungtis);
                break;

            case 6:
<<<<<<< HEAD
                Receptai naujasReceptas = (KonsolesVeiksmai.nuskaitytiReceptai());
                //int receptoId = KonsolesVeiksmai.nuskaitytiReceptai().getId();
                ReceptoVeiksmai.idetiRecepta(jungtis, naujasReceptas);
                break;
            case 2:
                Indigrientas naujasIngridentas = (KonsolesVeiksmai.nuskaitytiIndigrientai());
                IngridentoVeiksmai.grazintiVisusIndigrientus(jungtis);
=======
              Receptai naujasReceptas = (KonsolesVeiksmai.nuskaitytiReceptai());
              //int receptoId = KonsolesVeiksmai.nuskaitytiReceptai().getId();
              ReceptoVeiksmai.idetiRecepta(jungtis,naujasReceptas);
              break;
              case 7:
                    Indigrientas naujasIngridentas= (KonsolesVeiksmai.nuskaitytiIndigrientai());
                /*IngridentoVeiksmai.grazintiVisusIndigrientus(jungtis);*/
                IngridentoVeiksmai.idetiIngridienta(jungtis,naujasIngridentas);
>>>>>>> 70f4713f7680a21770aff22312c4b744ea3c952c
                break;
            case 4:
                visiIngredijentai = IngridentoVeiksmai.grazintiVisusIndigrientus(jungtis);
                PapildomiVeiksmai.isvestiListaEilutemis(visiIngredijentai);
                System.out.println("vis = " + visiIngredijentai.size());
                break;
            case 3:

            ArrayList<Indigrientas> grazintiBrangiausiusIngridijentus = IngridentoVeiksmai.grazintiBrangiausiusIngridijentus(jungtis ,5);

            break;


              /*
              visiReceptai=ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
              int receptoId = visiReceptai.get(visiReceptai.size() -1)).getId();
              if(receptoId <=0) {
                  Receptai receptai = KonsolesVeiksmai.nuskaitytiReceptai();
                  ReceptoVeiksmai.idetiRecepta(jungtis, receptai);
                  receptai = ReceptoVeiksmai.grazintiVisusReceptai(jungtis);
                  receptoId = receptai.get(receptai.size() - 1).getId();
              }



               break;
         /*  case 3:
                Receptai naujiReceptai = KonsolesVeiksmai.nuskaitytiReceptaiIsKonsoles();

                KonsolesVeiksmai.idetiReceptai(jungtis, naujiReceptai);
                visiReceptai = KonsolesVeiksmai.grazintiVisiReceptai(jungtis);
                int RecaptaiId = visiReceptai.get(visiReceptai.size() - 1).getId();
                if (RecaptaiId <= 0) {
                    ReceptaiId receptas = KonsolesVeiksmai.nuskaitytiReceptaiIsKonsoles();
                    ReceptoVeiksmai.idetiReceptai(jungtis, receptas);
                    receptas = ReceptoVeiksmai.gautiVisusReceptai(jungtis);
                    ReceptaiId= Receptai.get(receptas.size() - 1).getId();
                }*/


        }
    }


}
