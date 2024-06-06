package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.NoteTakerPage;

import java.util.Map;

public class NoteTakerMap32 {
    NoteTakerPage noteTakerPage = new NoteTakerPage();

    @When("user enters title and note")
    public void user_enters_title_and_note(DataTable dataTable) {

        Map<String, String> titleNotes = dataTable.asMap();
        //System.out.println("titleNotes = " + titleNotes);//titleNotes = {Selenium=Hello John, TestNG=Hi, everyone, TestPOM=Goodbye, Java=Merhaba!!!, HTML/CSS=Merhaba!!!, SDLC=Merhaba!!!}
        for (Map.Entry<String, String> w : titleNotes.entrySet()) {
            String title = w.getKey();
            String notes = w.getValue();

            noteTakerPage.title.sendKeys(title);
            noteTakerPage.notes.sendKeys(notes);
        }

    }

    @When("user clicks on form add")
    public void user_clicks_on_form_add() {
        noteTakerPage.add.click();
    }

}
