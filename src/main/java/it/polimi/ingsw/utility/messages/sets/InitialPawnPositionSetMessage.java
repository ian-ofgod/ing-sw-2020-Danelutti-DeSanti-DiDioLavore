package it.polimi.ingsw.utility.messages.sets;

import it.polimi.ingsw.model.Position;
import it.polimi.ingsw.model.SetObservable;
import it.polimi.ingsw.utility.messages.SetMessage;

import java.io.Serializable;
import java.util.ArrayList;

public class InitialPawnPositionSetMessage extends SetMessage implements Serializable {
    private static final long serialVersionUID = -2076557089937662535L;

    int workerId1,workerId2;
    Position workerPos1, workerPos2;

    public InitialPawnPositionSetMessage(String sender, int workerId1, int workerId2, Position workerPos1, Position workerPos2) {
        super(sender);
        this.workerId1 = workerId1;
        this.workerId2 = workerId2;
        this.workerPos1 = workerPos1;
        this.workerPos2 = workerPos2;
    }

    public void accept(SetObservable visitor) {
        visitor.notifyListeners(this);
    }
}
