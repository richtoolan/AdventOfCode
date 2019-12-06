package days;

import model.Opcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AdventOfCodeTwo {

    private static final int NEXT_INSTRUCTION_OFFSET = 4;
    private static final int RESULT_PARAMETER_OFFSET = 3;

    public static void main(String... args) {
        AdventOfCodeTwo adventOfCodeTwo = new AdventOfCodeTwo();

        Boolean winner = false;
        int verb = 0;
        int noun = 0;
        while(!winner) {

            Map<Integer, Integer> initialState = Map.of(
              1, verb,
              2, noun
            );

            List<Integer> output = adventOfCodeTwo.executeProgram(Arrays.asList(1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23, 1, 23, 6, 27, 2, 9, 27, 31, 1, 5, 31, 35, 1, 35, 10, 39, 1, 39, 10, 43, 2, 43, 9, 47, 1, 6, 47, 51, 2, 51, 6, 55, 1, 5, 55, 59, 2, 59, 10, 63, 1, 9, 63, 67, 1, 9, 67, 71, 2, 71, 6, 75, 1, 5, 75, 79, 1, 5, 79, 83, 1, 9, 83, 87, 2, 87, 10, 91, 2, 10, 91, 95, 1, 95, 9, 99, 2, 99, 9, 103, 2, 10, 103, 107, 2, 9, 107, 111, 1, 111, 5, 115, 1, 115, 2, 119, 1, 119, 6, 0, 99, 2, 0, 14, 0), initialState);

            if (output.get(0) == 19690720) {
                System.out.println("We have a winner!" + (100 * initialState.get(1) + initialState.get(2)));
                winner = true;
            } else if(verb == 99) {
                verb = 0;
                noun ++;
            } else {
                verb ++;
            }
        }

    }

    public List<Integer> executeProgram(List<Integer> inputs, Map<Integer, Integer> initialState) {
        return runProgram(inputs, 0, initialState);
    }

    private List<Integer> runProgram(List<Integer> inputs, Integer instructionPointer, Map<Integer, Integer> initialState) {
        if (inputs == null || inputs.size() == 0 && instructionPointer <= inputs.size()) {
            return inputs;
        }

        Opcode opcode = getNextOpCode(inputs.subList(instructionPointer, inputs.size()));

        if(initialState != null && !initialState.isEmpty() && instructionPointer == 0 ) {
            initialState.keySet().forEach(key -> inputs.set(key, initialState.get(key)));
        }

        Parameters parameters;
        int resultIndex;
        int result;

        switch (opcode) {
            case ABORT_OPCODE:
                break;
            case ADD_OPCODE:
                parameters = new Parameters(inputs, instructionPointer).invoke();

                result = parameters.getFirstOperand() + parameters.getSecondOperand();
                resultIndex = inputs.get(instructionPointer + RESULT_PARAMETER_OFFSET);

                inputs.set(resultIndex, result);

                runProgram(inputs, instructionPointer + NEXT_INSTRUCTION_OFFSET, initialState);
                break;
            case MULTIPLY_OPCODE:
                parameters = new Parameters(inputs, instructionPointer).invoke();

                resultIndex = inputs.get(instructionPointer + RESULT_PARAMETER_OFFSET);


                result = parameters.getFirstOperand() * parameters.getSecondOperand();

                inputs.set(resultIndex, result);

                runProgram(inputs, instructionPointer + NEXT_INSTRUCTION_OFFSET, initialState);
                break;
        }

        return inputs;
    }

    public Opcode getNextOpCode(List<Integer> slicedInputs) {
        return Arrays.stream(Opcode.values()).filter(opcode -> opcode.getId() == slicedInputs.get(0)).findFirst().get();
    }

    private class Parameters {
        private List<Integer> inputs;
        private Integer currentIndex;
        private int leftOperandIndex;
        private int rightOperandIndex;

        public Parameters(List<Integer> inputs, Integer currentIndex) {
            this.inputs = inputs;
            this.currentIndex = currentIndex;
        }

        public int getFirstOperand() {
            return inputs.get(leftOperandIndex);
        }

        public int getSecondOperand() {
            return inputs.get(rightOperandIndex);
        }

        public Parameters invoke() {
            leftOperandIndex = inputs.get(currentIndex +1);
            rightOperandIndex = inputs.get(currentIndex +2);
            return this;
        }
    }
}
