public class Event extends Task {

    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at:" + at + ")";
    }

    public static Event outputAsEvent(String lineToRead) {
        String[] descriptionNAt = lineToRead.split("/at");
        String desc = descriptionNAt[0];
        String at = descriptionNAt[1];
        return new Event(desc, at);
    }
    public String getDescription() {
        return super.getDescription();
    }
    public String getAt() {
        return at;
    }
}
