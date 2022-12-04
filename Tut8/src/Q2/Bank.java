package Q2;

import java.util.ArrayList;

public class Bank {

    private String name, code;
    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch(){}
    public void removeBranch(){}
    public void getAllBranches(){}

    public void createBranch(){
        this.branches.add(new Branch());
    }
}
