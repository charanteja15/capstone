// // import React,{useState} from 'react'
// // import {Link,useNavigate} from 'react-router-dom';
// // function UserLoginService() {
// //     const userLogin=()=>{
// //         const[email,setUserName]=useState('');
// //         const[password,setPassword]=useState("");
// //         const navigate=useNavigate();
// //         const login=(event)=>{
// //             event.preventDefault();
// //             if(isAuthorized())
// //             {
// //             //    " console.log()"
// //             fetch("http://localhost:9090/user/login" +email)
// //             .then((response)=>{return response.json()})
// //             .then((response)=>{console.log(response)
// //                           if(Object.keys(response).length===0)
// //                           {

// //                           }  
// //                           else{
// //                             if(response.password===password)
// //                             {
// //                                 navigate('/UserDashBoard');
// //                             }
// //                           }
// //                         })
// //             }
// //         }

// //         const isAuthorized=()=>{
// //             let result=true;
// //             if(email===null || email===" ")
// //             {
// //                 result=false;
// //             }
// //             if(password===null||password===" ")
// //             {
// //                 result=false;
// //             }
// //             return result;
// //         };
// //     }
// //   return (
// //     <div>
// //       <form  className='container bg-info col-md-5'  onSubmit={userLogin}>
// //         <h1>User Login</h1>
// //         <div className='form-group'>
// //         <label>UserName</label>
// //         <input value={email} className='form-control' placeholder="Enter Email" onChange={(event) => setUserName(event.target.value)}></input>
// //         </div>
// //         <div className='form-group'>
// //         <label>password</label>
// //         <input value={password} className='form-control' placeholder="Enter Password" onChange={(event) => setPassword(event.target.value)}></input>
// //         </div>
// //         <button type="submit" className='btn btn-dark'>Login</button>
       
// //       </form>
// //       <footer className='myFoot'>To Create New Account <Link to='/RegisterUser'>Click Here</Link></footer>
// //     </div>
// //   )
// // }

// // export default UserLoginService


// import { useState } from "react";
// import { Link, useNavigate } from "react-router-dom";
// const UserLoginService = () => {
//   const [email, setEmail] = useState("");
//   const [password, setPassword] = useState("");

//    const navigate= useNavigate();

//   const proceedLogin = (e) => {
//     e.preventDefault();
//     if (isAuthorized()) {
//       console.log("proceed");
//       fetch("http://localhost:9090/user/login")
//         .then((response) => {
//           return response.json();
//         })
//         .then((response) => {
//           console.log(response)
//           if(Object.keys(response).length === 0){

//           }else{

//           if(response.password===password){
//              navigate('/UserDashboard')
//           }
//         }
//         });
//     }
//   };
//   const isAuthorized = () => {
//     let result = true;
//     if (email === null || email === " ") {
//       result = false;
//     }
//     if (password === null || password === " ") {
//       result = false;
//     }
//     return result;
//   };
//   return (
//     <div>
//       <form  className='container bg-info col-md-5'  onSubmit={proceedLogin}>
//         <h1>User Login</h1>
//         <div className='form-group'>
//         <label>UserName</label>
//         <input value={email} className='form-control' placeholder="Enter name" onChange={(e) => setEmail(e.target.value)}></input>
//         </div>
//         <div className='form-group'>
//         <label>password</label>
//         <input value={password} className='form-control' placeholder="Enter Password" onChange={(e) => setPassword(e.target.value)}></input>
//         </div>
//         <button type="submit" className='btn btn-dark'>Login</button>
       
//       </form>
//       <footer className='myFoot'>To Create New Account <Link to='/RegisterUser'>Click Here</Link></footer>
//     </div>
//   );
// };
// export default UserLoginService;
