package command.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateAction {
    private List<IAction> ActionList = new ArrayList<>();
    public void addNewAction(IAction act){
        ActionList.add(act);
    }

    public void run(){
        for(IAction action: ActionList){
            action.execute();
        }
    }
}
