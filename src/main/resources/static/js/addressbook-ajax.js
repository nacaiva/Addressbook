$(function() {
  $.ajax({
    url : '/addressbook'
  }).done(function(persons) {
    var $list = $('#addressbook');
    var personTemp = $list.find('#personTemp').html();
    var numberTemp = $list.find('#numberTemp').html();
    var addressTemp = $list.find('#addressTemp').html();
    var emailTemp = $list.find('#emailTemp').html(); 
    var noteTemp = $list.find('#noteTemp').html();

    //  Render persons
    $.each(persons, function(index) {
      var person = persons[index];

      //  Render person's numbers
      var numbers='';
      $.each(person.numbers, function(index) {
        var number = person.numbers[index].number;
        numbers+=numberTemp.replace('{{number}}',number);
      });
      
      //  Render person's addresses
      var addresses='';
      $.each(person.addresses, function(index) {
        var address = person.addresses[index].address;
        addresses+=addressTemp.replace('{{address}}',address);
      });
      
      //  Render person's emails
      var emails='';
      $.each(person.emails, function(index) {
        var email = person.emails[index].email;
        emails+=emailTemp.replace('{{email}}',email);
      });
      
      //  Render person's notes
      var notes='';
      $.each(person.notes, function(index) {
        var note = person.notes[index].note;
        notes+=noteTemp.replace('{{note}}',note);
      });

      $list.append(
          personTemp.replace('{{name}}',person.firstname + ' ' +person.lastname)
          .replace('{{numbers}}',numbers).replace('{{addresses}}',addresses).replace('{{emails}}',emails).replace('{{notes}}',notes)
      );
    });
  });
});
