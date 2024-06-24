package nfa.examples;

import nfa.NFA;

public class NFAAutomatonD implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA automatonD = new NFA(0, "Automaton D");

        // Transition rules for Automaton D
        automatonD.addRule(0, '0', 1);
        automatonD.addRule(0, '1', 3);
        automatonD.addRule(1, '0', 2);
        automatonD.addRule(1, '1', 3);
        automatonD.addRule(2, '0', 2);
        automatonD.addRule(2, '1', 3);
        automatonD.addRule(3, '0', 1);
        automatonD.addRule(3, '1', 4);
        automatonD.addRule(4, '0', 1);
        automatonD.addRule(4, '1', 4);

        // Define accepting states (q0, q1, q3, q4 are accepting states)
        automatonD.addAcceptState(0);
        automatonD.addAcceptState(1);
        automatonD.addAcceptState(3);
        automatonD.addAcceptState(4);

        return automatonD;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0","1",   "11", "010", "101", "001", "110", "011" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "000",  "0000", "1100" };
    }
}
