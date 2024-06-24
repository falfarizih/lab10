package nfa.examples;

import nfa.NFA;

public class NFAAutomatonC implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA automatonC = new NFA(0, "Automaton C");

        // Transition rules for Automaton C
        automatonC.addRule(0, '0', 1);
        automatonC.addRule(0, '1', 0);
        automatonC.addRule(1, '0', 1);
        automatonC.addRule(1, '1', 2);
        automatonC.addRule(2, '0', 3);
        automatonC.addRule(2, '1', 0);
        automatonC.addRule(3, '0', 3);
        automatonC.addRule(3, '1', 0);
        automatonC.addAcceptState(0);
        automatonC.addAcceptState(1);
        automatonC.addAcceptState(2);

        return automatonC;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "1", "00", "11", "000", "111", "101", "110", "100" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "010", "1010", "0101010" };
    }
}
