// Fetch data from the server (using Fetch API)
fetch('/api/data')
  .then(response => response.json())
  .then(data => {
    displayData(data); // Display the data in a table
  })
  .catch(error => {
    console.error('Error fetching data:', error);
  });

// Display the data in a table
function displayData(data) {
  const table = document.createElement('table');
  const headerRow = table.insertRow();

  // Add table headers based on your data structure
  for (const key in data[0]) {
    const headerCell = headerRow.insertCell();
    headerCell.textContent = key;
  }

  // Add data rows
  data.forEach(record => {
    const row = table.insertRow();
    for (const key in record) {
      const cell = row.insertCell();
      cell.textContent = record[key];
    }
  });

  const dataDisplay = document.getElementById('data-display');
  dataDisplay.innerHTML = ''; // Clear previous data
  dataDisplay.appendChild(table);
}

// Handle form submission
const addForm = document.getElementById('new-record-form');
addForm.addEventListener('submit', (event) => {
  event.preventDefault(); // Prevent default form submission

  // Get data from input fields
  const name = document.getElementById('name').value;

  // Send data to the server
  fetch('/api/data', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ name: name, ... }) // Add other fields
  })
    .then(response => response.json())
    .then(data => {
      // Update the displayed data
      displayData(data); 
    })
    .catch(error => {
      console.error('Error adding record:', error);
    });
});