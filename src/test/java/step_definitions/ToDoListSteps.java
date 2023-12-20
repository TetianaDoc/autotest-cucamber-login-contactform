package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.ToDoListPO;
import utils.GlobalVars;

public class ToDoListSteps {
    public final ToDoListPO toDoListPO;

    public ToDoListSteps(ToDoListPO toDoListPO) {
        this.toDoListPO = toDoListPO;
    }

    @Given("Go to To-Do List Page")
    public void goToToDoListPage() {
        toDoListPO.navigateToUrl(GlobalVars.HOMEPAGE_URL + "/To-Do-List/index.html");
    }

    @When("I click on the Item")
    public void clickOnItem() {
        toDoListPO.clickOnItemToBeCompleted();
    }

    @Then("The Item is crossed by line")
    public void itemIsCrossed() {
        toDoListPO.isItemCompleted();
    }

    private int before;
    private int after;

    @When("I write a new todo item in placeholder")
    public void addNewItemInPlaceholder() {
        before = toDoListPO.numberOfItems();
        toDoListPO.addNewItem();
        after = toDoListPO.numberOfItems();
    }

    @Then("New todo item appears in ToDo List")
    public void newItemAppearsInToDoList() {
        toDoListPO.isItemAdded(before, after);
    }

    @When("I click on the Trash icon")
    public void clickOnTrashIconToDelete() {
        before = toDoListPO.numberOfItems();
        toDoListPO.deleteItem();
        after = toDoListPO.numberOfItems();
    }

    @Then("The Item is deleted")
    public void itemIsDeleted() {
        toDoListPO.isItemDeleted(before, after);
    }

}
