function validateForm() {
  let name = document.forms[0]["name"].value;
  let email = document.forms[0]["email"].value;
  let message = document.forms[0]["message"].value;

  if (name.length < 3) {
    alert("Name must be at least 3 characters");
    return false;
  }
  return true;
}


