// import React from 'react'
// function DeleteQuestion(props) {
//     const deleteApi = ()=>{
//             fetch("http://localhost:9090/admin/deleteQuestion/"+props.questionId,
//             {method:'DELETE'})
//             .then((response)=>{ console.log(response.status); 
//             alert("Question with Question id " + props.questionId +" deleted")  })
//         }
//   return (
//     <div>
//       <button type="submit"  className='btn btn-danger' onClick={deleteApi} value={props.questionId} >Delete Question</button>
//     </div>
//   )
// }

// export default DeleteQuestion;


//doesnt work because in backend one column is a foreign key in another table
