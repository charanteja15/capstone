import React,{useState} from 'react'
import DeleteQuestion from './DeleteQuestion';
function GetUnApprovedQuestions() {
  const[unApprovedQuestions,setUnApprovedQuestions]=useState([]);
  function getAllUnApprovedQuestionsAPI(){
    fetch("http://localhost:9090/admin/getUnApprovedQuestions")
    .then((response)=>{return response.json()})
    .then((questions)=>{console.log(questions);setUnApprovedQuestions(questions);})
  }

  return (
    <div>
      <button type="submit" onClick={getAllUnApprovedQuestionsAPI}>Get All Un Approved Questions</button>
      <table  className='table table-striped col-md-4'>
            <thead> <tr><th>Question Id</th> <th>Question</th>  <th>Topic</th> <th>Posted by</th>    </tr> </thead>
             <tbody>
                   {
                            unApprovedQuestions.map((question)=>{ 
                             return  <tr  key={question.id}><td>{question.id}</td> <td>{question.question}</td>  <td>{question.topic}</td>       </tr>    //<td><DeleteQuestion questionId={question.id}></DeleteQuestion></td>  
                            //     unique id inside  server is key
                         })
                         
                    
                         
                   } 

                </tbody>
        </table>
    </div>
  )
}

export default GetUnApprovedQuestions;
