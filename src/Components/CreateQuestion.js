import React, { Component } from 'react'

export default class CreateQuestion extends Component {
    constructor(props){   
        super(props);
        this.state={    
            userId:"",
            question:"",
            topic:""
        }
        //creating Ref's
        this.userIdRef=React.createRef();
        this.questionRef = React.createRef();
        this.topicRef = React.createRef();
      
    }

    questionPost=(e)=>{
        e.preventDefault();
        console.log(this.state)
        fetch("http://localhost:9090/user/askQuestion",
        {
            method:"POST",
            body:JSON.stringify({
                userId:this.userIdRef.current.value,
                question:this.questionRef.current.value,
                topic:this.topicRef.current.value
            }),
            headers:{"Content-Type": 'application/json'}})
            .then(response=>response.json())
            .then(question=>console.log(question));
            alert('question posted successfully');
       
    }
  render() {
    return (
      <div>
        <form className="container col-md-5" onSubmit={this.questionPost}>
            <h3>Question Form</h3>
            <div className="form-group">
                <label> Enter User Id</label>
                <input type="number" name="userId" required placeholder="Enter a user Id" className="form-control" ref={this.userIdRef} />
            </div>
            <div className="form-group">
                <label>Add a question</label>
                <input type="text" name="questionName" required placeholder="Enter a question" className="form-control" ref={this.questionRef} />
            </div>
            <div className="form-group">
                <label>Enter a topic</label>
                <input type="text" name="topic" required placeholder="Enter a topic" className="form-control" ref={this.topicRef} />
            </div>
            <div className="jsutify-content center">
                <button type="submit" className='btn btn-warning'>Submit the question</button>
            </div>
        </form>
      </div>
    )
  }
}
