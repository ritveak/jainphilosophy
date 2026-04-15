package jagat.padarth;

import jagat.base.Astikay;
import enums.Count;

public interface PudgalAstikay extends Astikay {
    @Override
    default Count getPradeshCount(){
        return Count.ASANKHYA;
    }
    Integer getNumberOfRang();
    Integer getNumberOfSparsh();
    Integer getNumberOfGandh();
    Integer getNumberOfRas();

}
