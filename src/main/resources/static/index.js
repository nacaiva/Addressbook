$(function() {
  $.ajax({
    url : '/phonebook'
  }).done(function(persons) {
    var $list = $('#phonebook');
    var template = $list.find('template').html();

    //  Render persons
    $.each(persons, function(index) {
      var person = persons[index];
      console.log(person);

      $list.append(template.replace('{{name}}',person.firstname + ' ' +person.lastname));

      //  Render person's numbers
      $.each(person.numbers, function(index) {
        
      });
    });
  });
});
