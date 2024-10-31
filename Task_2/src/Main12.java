class UniqueID {
    private static int counter = 0;
    private int id;

    public UniqueID() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }
}