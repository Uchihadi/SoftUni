package TechAssessment230123;

// You are given a binary array state consisting of Integers 0 and 1. You are also given operations - an array of strings (2 types)
// 1) "L" : Find the smallest index i, for which state[i] = 0, and set state[i] = 1 (If there is no such index then do nothing)
// 2) "C{index}" : Set state[index] = 0. (It is guaranteed that index is a valid 0-based index of state (ie: index < state. Length)
// Given state and operations, your task is to return the binary string of state arrays after all operations have been applied

public class CodeWriting {
    public String solution(int[] state, String[] operations) {
        for (String operation : operations) {
            if (operation.equals("L")) {
                int index = -1;
                for (int i = 0; i < state.length; i++) {
                    if (state[i] == 0) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    state[index] = 1;
                }
            } else {
                int index = Integer.parseInt(operation.substring(1));
                state[index] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : state) {
            sb.append(i);
        }
        return sb.toString();
    }
}
