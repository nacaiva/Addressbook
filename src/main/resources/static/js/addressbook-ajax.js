$(function() {
  $.ajax({
    url : '/addressbook'
  }).done(function(entries) {
    var $list = $('#addressbook');
    var personTemp = $list.find('#personTemp').html();
    var detailsTemp = $list.find('#detailsTemp').html();

    $.each(entries, function(index) {
      var entry = entries[index];

      var detailsValue='';
      $.each(entry.details, function(index) {
        var detail = entry.details[index];
        detailsValue+=detailsTemp.replace('{{detailValue}}',detail.type + ': ' +detail.value);
      });
      
      $list.append(
          personTemp.replace('{{name}}',entry.name).replace('{{details}}',detailsValue)
      );
    });
  });
});
