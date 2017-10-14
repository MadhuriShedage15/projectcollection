$(function() 
		{
	switch (menu) {
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'Products':
		$('#products').addClass('active');
		break;

	case 'WishList':
		$('#wishlist').addClass('active');
		break;
	default:

		$('#home').addClass('active');
				break;
				$('#products').addClass('active');
				$('a_' + menu).addClass('active');
				break;


	}
});