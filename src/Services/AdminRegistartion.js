import React, { Component } from 'react'
export default class AdminRegistartion extends Component {
  constructor(props){   
    super(props);
    this.state={    
        id:"",
        name:"",
        password:"",
        email:"",
        phoneNumber:""   
    }
    //creating Ref's
    this.nameRef=React.createRef();
    this.passwordRef = React.createRef();
    this.emailRef = React.createRef();
    this.phoneNumberRef=React.createRef();
}

    adminPost =(e)=>{
        e.preventDefault();
        console.log(this.state)
        fetch("http://localhost:9090/admin/register",
            {
                method: 'POST',
                body: JSON.stringify({
                    name:this.nameRef.current.value,
                    email:this.emailRef.current.value,
                    password:this.passwordRef.current.value,
                    phoneNumber:this.phoneNumberRef.current.value                 
                }),
                headers: { "Content-Type": 'application/json' } })
               .then(res=>res.json())
                .then(data => console.log(data));
                alert("Admin registered successfully")
    }
    render() {
    return (

    <>
      <div>
        <form className='container col-md-5' onSubmit={this.adminPost}>
                <h1>Admin Registration</h1>
                <div className='form-group'>
                    <label>Enter AdminName</label>
                    <input type="text" name='name' required placeholder='Enter Name' className='form-control' ref={this.nameRef} />
                </div>
              <div className='form-group'>
                    <label>Enter email</label>
                    <input type="email" name="email" required placeholder='abc@gmail.com' className='form-control' ref={this.emailRef} />
                </div>
                <div className='form-group'>
                {/* pattern='[A-Z][a-z][@][.][1-10]' */}
                    <label>Enter password</label>
                    <input type="password" name='password' required  placeholder='Enter Password' className='form-control'  ref={this.passwordRef} />
                </div>
                <div className='form-group'>
                    <label>Enter Phone Number</label>
                    <input type="number" name='name' required placeholder='Enter Phone Number' className='form-control' ref={this.phoneNumberRef} />
                </div>
              <div className='justify-content centre'>
                <button type="submit" className='btn btn-primary'>Register as Admin</button>
              </div>
            </form>
      </div>
    </>

    )
    }
}