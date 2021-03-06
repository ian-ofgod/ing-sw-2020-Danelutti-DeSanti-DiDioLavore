package it.polimi.ingsw.utility.messages.sets;

import it.polimi.ingsw.model.SetObservable;
import it.polimi.ingsw.utility.messages.SetMessage;

import java.io.Serializable;
import java.util.ArrayList;

public class ChosenCardSetMessage extends SetMessage implements Serializable {
    private static final long serialVersionUID = -8402587606414689543L;

    int cardId;

    public ChosenCardSetMessage(int cardId) {
        this.cardId=cardId;
    }

    public int getCardId() {
        return cardId;
    }

    public void accept(SetObservable visitor) {
        visitor.notifyListeners(this);
    }
}
