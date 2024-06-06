package stepdefinitions;

import io.cucumber.java.en.When;
import pages.EditorPage;

public class EditorStepDefination {
    EditorPage editorPage = new EditorPage();

    @When("user enters credentials from excel")
    public void user_enters_credentials_from_excel() {
        editorPage.newButton.click();
        editorPage.first_name.sendKeys();
    }
}
