/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Search
$(document).ready(function() {
    $(".dropdown-search").click(function() {
        $(".dropdown-search-list ul").toggleClass("active");
    });
    
    $(".dropdown-search-list ul li").click(function() {
        var icon_text = $(this).text();
        $(".default-option").text(icon_text);
    });
    
    $(document).on("click", function(event) {
        if(!$(event.target).closest(".dropdown-search").length) {
            $(".dropdown-search-list ul").removeClass("active");
        }
    });
});

function houseRented() {
  alert("House is already rented./nPlease choose another one!!!!!");
}

function showPassword() {
    var x = document.getElementById('password');
    var y = document.getElementById('hide');
    var z = document.getElementById('show');

    if (x.type === 'password') {
        x.type = "text";
        y.style.display = "block";
        z.style.display = "none";
    } else {
        x.type = "password";
        y.style.display = "none";
        z.style.display = "block";
    }
}

function showConfirmPassword() {
    var x = document.getElementById('confirmPassword');
    var y = document.getElementById('hide1');
    var z = document.getElementById('show1');

    if (x.type === 'password') {
        x.type = "text";
        y.style.display = "block";
        z.style.display = "none";
    } else {
        x.type = "password";
        y.style.display = "none";
        z.style.display = "block";
    }
}

function Validate() {
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    if (password !== confirmPassword) {
        window.alert("Passwords didn't match, try again.");
        return false;
    }
    return true;
}

function ValidateSignIn() {
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    if (password !== confirmPassword) {
        window.alert("Passwords didn't match, try again.");
        return false;
    }
    return true;
}