package duke.deadline;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import duke.task.Task;

public class Deadline extends Task {

    protected LocalDate deadline;

    public Deadline(String description, LocalDate deadline) {
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String getTypeIcon() {
        return "D";
    }

    @Override
    public String getTask() {
        return String.format("[%s][%s] %s (by: %s)",
                getTypeIcon(), getStatusIcon(), description, deadline.format(DateTimeFormatter.ofPattern("MMM d yyyy")));
    }

    @Override
    public String getTaskForFile() {
        return String.format("%s | %b | %s | %s", getTypeIcon(), isDone, description, deadline);
    }
}
