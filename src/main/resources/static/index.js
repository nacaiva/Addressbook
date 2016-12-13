$(function() {
  $.ajax({
    url : '/phonebook'
  }).done(function(persons) {
    var $list = $('#phonebook');
    var personTemp = $list.find('#personTemp').html();
    var numberTemp = $list.find('#numberTemp').html();

    //  Render persons
    $.each(persons, function(index) {
      var person = persons[index];

      //  Render person's numbers
      var numbers='';
      $.each(person.numbers, function(index) {
        var number = person.numbers[index].number;
        numbers+=numberTemp.replace('{{number}}',number);
      });

      $list.append(
          personTemp.replace('{{name}}',person.firstname + ' ' +person.lastname)
          .replace('{{numbers}}',numbers)
      );
    });
  });
});
