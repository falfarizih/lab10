package nfa.examples;

import nfa.NFA;

public class NFAAutomatonB implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA automatonB = new NFA(1, "Automaton B");
        automatonB.addRule(1, '0', 2);
        automatonB.addRule(1, '1', 4);
        automatonB.addRule(2, '0', 1);
        automatonB.addRule(2, '1', 3);
        automatonB.addRule(3, '0', 4);
        automatonB.addRule(3, '1', 2);
        automatonB.addRule(4, '0', 3);
        automatonB.addRule(4, '1', 1);
        automatonB.addAcceptState(2);
        automatonB.addAcceptState(4);
        return automatonB;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "1", "100", "101", "110"  }; // Strings ending in q2 or q4
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "01", "10", "0101" }; // Strings not ending in q2 or q4
    }
}
