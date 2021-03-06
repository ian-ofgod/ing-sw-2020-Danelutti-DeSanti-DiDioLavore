package it.polimi.ingsw.view.modelview;

import java.io.Serializable;
import java.util.ArrayList;

public class PlayerView implements Serializable {
    private static final long serialVersionUID = 3617065964702629105L;
    private String name;
    private CardView card;
    private ArrayList<PawnView> pawnList;
    private Boolean isWinner;
    private Boolean isLoser;

    public PlayerView(String name, ArrayList<PawnView> pawnList) {
        this.name = name;
        this.pawnList = pawnList;
        this.isWinner=false;
        this.isLoser=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardView getCard() {
        return card;
    }

    public void setCard(CardView card) {
        this.card = card;
    }

    public ArrayList<PawnView> getPawnList() {
        return pawnList;
    }

    public void setPawnList(ArrayList<PawnView> pawnList) {
        this.pawnList = pawnList;
    }

    public Boolean getWinner() {
        return isWinner;
    }

    public void setWinner(Boolean winner) {
        isWinner = winner;
    }

    public Boolean getLoser() {
        return isLoser;
    }

    public void setLoser(Boolean loser) {
        isLoser = loser;
    }
}
