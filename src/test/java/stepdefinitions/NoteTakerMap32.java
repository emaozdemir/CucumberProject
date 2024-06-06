package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.Map;

public class NoteTakerMap32 {

    @When("user enters title and note")
    public void user_enters_title_and_note(DataTable dataTable) {

        Map<String, String> titleNotes = dataTable.asMap();
        //System.out.println("titleNotes = " + titleNotes);//titleNotes = {Selenium=Hello John, TestNG=Hi, everyone, TestPOM=Goodbye, Java=Merhaba!!!, HTML/CSS=Merhaba!!!, SDLC=Merhaba!!!}


    }

    @When("user clicks on form add")
    public void user_clicks_on_form_add() {

    }

}
