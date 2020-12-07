/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $(".dropdown-search").click(function() {
        $(".dropdown-seach-list ul").toggleClass("active");
    });
    
    $(".dropdown-search-list ul li").click(function() {
        var icon_text = $(this).html();
        $(".default-option").html(icon_text);
    });
    
    $(document).on("click", function(event) {
        if(!$(event.target).closest(".dropdown-search").length) {
            $(".dropdown-seach-list ul").removeClass("active");
        }
    });
});