/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function myFunction() {
    var x = document.getElementById("password");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }

    var y = document.getElementById("confpassword");
    if (y.type === "password") {
        y.type = "text";
    } else {
        y.type = "password";
    }

}
function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confpassword").value;
        if (password !== confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }