const express = require('express');
const app = express();
const port = 3000;
const fs = require('fs'); // To read and write data from files

app.use(express.json()); // For parsing JSON request bodies

// Mock data (replace with database connection later)
let data = []; 

// Get data
app.get('/api/data', (req, res) => {
  res.json(data); 
});

// Add new data
app.post('/api/data', (req, res) => {
  const newData = req.body; 
  data.push(newData);
  res.json(data);
});

// Start the server
app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});