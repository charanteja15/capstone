import React,{useState} from 'react'

function GetAnswer() {
    const[answer,setData]=useState([]);
    function getAnswerByQuestionIdApi(){
        var questionId=prompt("Enter the question id to get Answer:")
        fetch("http://localhost:9090/user/getAnswers/"+ questionId)
        .then((response)=>{return response.json()})
         .then((answer)=>{console.log(answer);})   //setData(answer);
  }
  return (
    <div>
      <button type="submit" onClick={getAnswerByQuestionIdApi}>Get Answer By Question Id</button>
    </div>
  )
}

export default GetAnswer
