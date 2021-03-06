package it.polimi.ingsw.utility.messages.updates;

import it.polimi.ingsw.model.RequestAndUpdateObservable;
import it.polimi.ingsw.utility.messages.RequestAndUpdateMessage;
import it.polimi.ingsw.view.modelview.ModelView;

import java.io.Serializable;
import java.util.ArrayList;

public class UndoUpdateMessage extends RequestAndUpdateMessage implements Serializable {
    private static final long serialVersionUID = -562998159831645238L;

    ModelView restoredModelView;

    public UndoUpdateMessage(ArrayList<String> recipients,ModelView restoredModelView) {
        super(recipients);
        this.restoredModelView=restoredModelView;
    }

    public ModelView getRestoredModelView() {
        return restoredModelView;
    }

    public void accept(RequestAndUpdateObservable visitor) {
        visitor.notifyListeners(this);
    }

}
