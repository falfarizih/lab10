package nfa.examples;

import nfa.NFA;

public class NFAAutomatonE implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA automatonE = new NFA(0, "Automaton E");

        // Transition rules for Automaton E
        automatonE.addRule(0, '0', 0);
        automatonE.addRule(0, '1', 1);
        automatonE.addRule(1, '0', 2);
        automatonE.addRule(1, '1', 0);
        automatonE.addRule(2, '0', 1);
        automatonE.addRule(2, '1', 2);

        // Define accepting state (q0)
        automatonE.addAcceptState(0);

        return automatonE;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "11", "110", "1001",  "10101" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "1", "10", "1011", "10110", "101011" };
    }
}
