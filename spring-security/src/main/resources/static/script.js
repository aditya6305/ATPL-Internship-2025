/**
 * 
 */
async function handleRegister(e) {
  e.preventDefault();
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;
  let confirm = document.getElementById("confirm").value;

  let msg = document.getElementById("msg");

  if (password !== confirm) {
    msg.innerText = "Passwords do not match!";
    return;
  }

  let res = await fetch(BASE_URL + "/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ username, password, roles: "USER" })
  });

  let text = await res.text();
  msg.innerText = text;
}

async function handleLogin(e) {
  e.preventDefault();
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;

  let msg = document.getElementById("msg");

  let res = await fetch(BASE_URL + "/login", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ username, password })
  });

  let token = await res.text();

  if (res.ok) {
    localStorage.setItem("jwtToken", token);
    window.location.href = "token.html";
  } else {
    msg.innerText = "Invalid credentials!";
  }
}

function showToken() {
  let token = localStorage.getItem("jwtToken");
  let tokenBox = document.getElementById("tokenBox");
  if (token) {
    tokenBox.innerText = token;
  } else {
    tokenBox.innerText = "No token found! Please login first.";
  }
}
