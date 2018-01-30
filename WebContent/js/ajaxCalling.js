/**
 * 
 */

$(document).ready(function() {
	$('#coinButton').click(function() {
		$.ajax({
			type : $('#methodId :selected').val(), 
			url : 'FlipCoinServlet',
			data : {
				coinValue : $('#coinValueId').val()
			},
			datatype : 'text',
			success : function(responseText) {
				console.log(responseText);
				var flipJson = JSON.parse(responseText);
				console.log(flipJson.coins);
				//$('#ajaxGetUserServletResponse').text(responseText);
				jQuery('#flipId').html(flipJson.coins);
			}
		});
	});
});