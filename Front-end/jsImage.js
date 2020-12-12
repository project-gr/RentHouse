/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


const wrapper = document.querySelector(".wrapper-image");
const fileName = document.querySelector(".file-name");
const cancelBtn = document.querySelector("#cancel-btn");
const defaultBtn = document.querySelector("#default-btn");
const customBtn = document.querySelector("#custom-btn");
const img = document.querySelector("img");
let regExp = /[0-9a-zA-Z\^\&\'\@\{\}\[\]\,\$\=\!\-\#\(\)\.\%\+\~\_ ]+$/;

function defaultBtnActive() {
    defaultBtn.click();
}

defaultBtn.addEventListener("change", function () {
    const file = this.files[0];
    if(file) {
        const reader = new FileReader();
        reader.onload = function () {
            const result = reader.result;
            img.src = result;
            wrapper.classList.add("active");
        };
        cancelBtn.addEventListener("click", function() {
            img.src = "";
            wrapper.classList.remove("active");
        });
        reader.readAsDataURL(file);
    }
    if(this.value) {
        let valueStore = this.value.match(regExp);
        fileName.textContent = valueStore;
    }
});

//link hướng dẫn https://www.youtube.com/watch?v=AYjOyQhZiK0