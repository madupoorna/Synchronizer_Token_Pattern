$(document).ready(function () {
    $.ajax({
        type: "post",
        url: "/csrf",
        success : function(csrfValue) {
            document.getElementById("csrf").value = csrfValue;
        },
        error : function(xhr) {
            alert("Request failed with error "+ xhr.responseText);
        }
    });
});

$(".logout-btn").on("click", function(e) {
    e.preventDefault();
    $.ajax({
        type: "post",
        url: "/logout",
        success: function(response) {
            $("html").html(response);
        },
        error : function(xhr) {
            alert("Request failed with error "+ xhr.responseText);
        }
    });
});

