Feature: select passengers
  AS Automation of quality control
  I want to select the number of passengers
  to check if I can make the reservation

  @ScenarioOutline
  Scenario Outline: Child passenger with preselection greater than nine

    Given go to the volotea flights page
    When the plus button is clicked and it is greater than nine '<kids>'
    Then if it is greater than nine the link  '<alert>' Reserva de grupos

    Examples:
      | kids |       alert         |
      | 1    |        " "          |
      | 6    |        " "          |
      | 9    |        " "          |
      | 10   | "Reserva de grupos" |

