package days;

import model.Opcode;

import java.util.Arrays;
import java.util.List;

public class AdventOfCodeTwo {
    public List<Integer> runProgram(List<Integer> inputs, Integer currentIndex) {
        if (inputs == null || inputs.size() == 0 && currentIndex <= inputs.size()) {
            return inputs;
        }

        Opcode opcode = getNextOpCode(inputs.subList(currentIndex, inputs.size()));

        if(currentIndex == 0) {
            inputs.set(1, 12);
            inputs.set(2, 2);
        }

        int leftOperandIndex;
        int rightOperandIndex;
        int resultIndex;

        int leftOperand;
        int rightOperand;

        int result;

        switch (opcode) {
            case ADD_OPCODE:
                leftOperandIndex = inputs.get(currentIndex +1);
                rightOperandIndex = inputs.get(currentIndex +2);
                resultIndex = inputs.get(currentIndex + 3);

                leftOperand = inputs.get(leftOperandIndex);
                rightOperand = inputs.get(rightOperandIndex);

                result = leftOperand + rightOperand;

                inputs.set(resultIndex, result);

                runProgram(inputs, currentIndex + 4);
                break;
            case MULTIPLY_OPCODE:
                leftOperandIndex = inputs.get(currentIndex +1);
                rightOperandIndex = inputs.get(currentIndex +2);
                resultIndex = inputs.get(currentIndex + 3);

                leftOperand = inputs.get(leftOperandIndex);
                rightOperand = inputs.get(rightOperandIndex);

                result = leftOperand * rightOperand;

                inputs.set(resultIndex, result);

                runProgram(inputs, currentIndex + 4);
                break;
            case ABORT_OPCODE:
                break;
        }

        return inputs;
    }

    public Opcode getNextOpCode(List<Integer> slicedInputs) {
        return Arrays.stream(Opcode.values()).filter(opcode -> opcode.getId() == slicedInputs.get(0)).findFirst().get();
    }
}
