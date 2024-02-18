package bean.task;
import bean.command.exception.NoValueException;
public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) throws NoValueException {
        if(description == null) {
            throw new NoValueException();
        }
        this.description = description;
        this.isDone = false;
    }

    public abstract String toCommand();

    public String toString() {
        String checkBox = "[ ] ";
        if (isDone) {
            checkBox = "[X] ";
        }
        return checkBox + description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean checkDone() {
        return isDone;
    }

    public void setDone() {
        isDone = true;
    }

    public void setUndone() {
        isDone = false;
    }
}
