package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.Keys;
import pages.ToDoListPage;

import java.util.List;

public class ToDoListStepDefinitions {
    @When("user enters todos")
    public void user_enters_todos(DataTable dataTable) throws InterruptedException {
        ToDoListPage toDoListPage = new ToDoListPage();
        List<String> todos = dataTable.asList();
        for (String todo : todos) {
            toDoListPage.input.sendKeys(todo+ Keys.ENTER);
            Thread.sleep(200);
        }
    }

}