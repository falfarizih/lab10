package nfa.examples;

import nfa.NFA;

public class NFAAutomatonA implements NFAWithExamples {

    public NFA getFA() {
        NFA automatonA = new NFA(0, "Automaton A");
        automatonA.addRule(0, '0', 0);
        automatonA.addRule(0, '1', 1);
        automatonA.addRule(1, '0', 2);
        automatonA.addRule(1, '1', 3);
        automatonA.addRule(2, '0', 0);
        automatonA.addRule(2, '1', 1);
        automatonA.addRule(3, '0', 2);
        automatonA.addRule(3, '1', 3);
        automatonA.addAcceptState(0);
        return automatonA;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0","00", "000" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "1", "01", "001", "011"};
    }


}
