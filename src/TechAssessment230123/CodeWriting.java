package TechAssessment230123;

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
