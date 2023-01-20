// import React, { useState } from 'react'
// // import TextField from '@material-ui/core/TextField';
// // import Autocomplete from '@material-ui/lab/Autocomplete';

// const SearchBox = () => {

// const [myOptions, setMyOptions] = useState([])

// const getDataFromAPI = () => {
// 	console.log("Options Fetched from API")

// 	fetch('http://localhost:9090/searchQuestion/{question}').then((response) => {
// 	return response.json()
// 	}).then((res) => {
// 	console.log(res.data)
// 	for (var i = 0; i < res.data.length; i++) {
// 		myOptions.push(res.data[i].employee_name)
// 	}
// 	setMyOptions(myOptions)
// 	})
// }

// return (
// 	<div style={{ marginLeft: '40%', marginTop: '60px' }}>
// 	<input type="text" placeholder="Search" />
//     <button type="submit" onClick={getDataFromAPI}>Search</button>
// 	{/* <Autocomplete
// 		style={{ width: 500 }}
// 		freeSolo
// 		autoComplete
// 		autoHighlight
// 		options={myOptions}
// 		renderInput={(params) => (
// 		<TextField {...params}
// 			onChange={getDataFromAPI}
// 			variant="outlined"
// 			label="Search Box"
// 		/>
// 		)}
// 	/> */}


// 	</div>
// );
// }

// export default SearchBox;
