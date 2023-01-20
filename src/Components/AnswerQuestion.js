import React, { Component } from 'react'

export class AnswerQuestion extends Component {
    constructor(props){   
        super(props);
        this.state={      
            userId:"",
            questionId:"",
            answer:"",   
        }
        //creating Ref's
        this.userIdRef=React.createRef();
        this.questionIdRef = React.createRef();
        this.answerRef = React.createRef();
    }
    answerPost=(e)=>{
        e.preventDefault();
        console.log(this.state)
        fetch("http://localhost:9090/user/giveAnswer",
        {
            method:"POST",
            body:JSON.stringify({
                userId:this.userIdRef.current.value,
                questionId:this.questionIdRef.current.value,
                answer:this.answerRef.current.value
            }),
            headers:{"Content-Type": 'application/json'}})
            .then(response=>response.json())
            .then(answer=>console.log(answer));
            alert('answer posted successfully');
       
    }
  render() {
    return (
      <>
        <div>
        <form className='container col-md-5' onSubmit={this.answerPost}>
                <h3>Answer Form</h3>
                <div className='form-group'>
                    <label>Enter User Id</label>
                    <input type="number" name='userId' required placeholder='Enter UserId' className='form-control' ref={this.userIdRef} />
                </div>
                <div className='form-group'>
                    <label>Enter Question Id </label>
                    <input type="number" name='questionId' required  placeholder='Enter question Id' className='form-control'  ref={this.questionIdRef} />
                </div>
                <div className='form-group'>
                    <label>Answer the Question</label>
                    <input type="text" name="answer" required placeholder="Answer the question" className='form-control' ref={this.answerRef} />
                </div>
                <div className='form-group'>
                    <button type="submit" className="btn btn-success">Answer the question</button>
                </div>
        </form>
      </div>

      </>
    )
  }
}

export default AnswerQuestion
