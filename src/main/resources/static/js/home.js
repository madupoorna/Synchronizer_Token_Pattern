$('#logout-btn').ready(function () {
    $('button').click(function (e) {
        e.preventDefault();
        logout();
    });
});

function logout() {
    $.ajax({
        type: "post",
        url: "/logout",
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            location.reload();
        },
        error: function (jqXHR, exception) {
            console.log(exception);
            alert("error");
        }
    });
}
