package model;

public enum Opcode {
    ADD_OPCODE(1), MULTIPLY_OPCODE(2), ABORT_OPCODE(99);

    private final int id;

    Opcode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
