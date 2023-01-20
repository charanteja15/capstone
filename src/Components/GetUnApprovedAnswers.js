import React,{useState} from 'react'
function GetUnApprovedAnswers() {
  const[unApprovedAnswers,setUnApprovedAnswers]=useState([]);
  function getAllUnApprovedAnswersAPI(){
    fetch("http://localhost:9090/admin/getUnApprovedAnswers")
    .then((response)=>{return response.json()})
    .then((answers)=>{console.log(answers);setUnApprovedAnswers(answers);})
  }

  return (
    <div>
      <button type="submit" onClick={getAllUnApprovedAnswersAPI}>Get All Un Approved Answers</button>
      <table  className='table table-striped col-md-4'>
            <thead> <tr><th>Answer Id</th> <th>Answer</th>  <th>User Id</th>  <th>Question Id</th>    </tr> </thead>
             <tbody>
                   {
                            unApprovedAnswers.map((answer)=>{ 
                             return  <tr  key={answer.id}> <td>{answer.id}</td> <td>{answer.answer}</td>  <td>{answer.answer_user_id}</td>   <td>{answer.question_id}</td>    </tr>    //<td><DeleteQuestion questionId={question.id}></DeleteQuestion></td>  
                            //     unique id inside  server is key
                         })
                         
                    
                         
                   } 

                </tbody>
        </table>
    </div>
  )
}

export default GetUnApprovedAnswers;
