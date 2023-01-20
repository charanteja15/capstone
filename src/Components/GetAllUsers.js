import React,{useState} from 'react'
function GetAllUsers() {
  const[data,setData]=useState([]);
  function getAllUsersApi(){
    fetch("http://localhost:9090/admin/getAllUsers")
    .then((response)=>{return response.json()})
    .then((users)=>{console.log(users);setData(users);})
  }

  return (
    <div>
      <button type="submit" onClick={getAllUsersApi}>Get All Users</button>
      <table  className='table table-striped col-md-4'>
            <thead> <tr><th>Id</th> <th>Email</th>  <th>Name</th> <th>Phone Number</th>    </tr> </thead>
             <tbody>
                   {
                            data.map((user)=>{ 
                             return  <tr  key={user.id}><td>{user.id}</td> <td>{user.email}</td>  <td>{user.name}</td> <td>{user.phoneNumber}</td>     </tr>
                            //     unique id inside every mysql server is key
                         })
                         
        
                         
                   } 

                </tbody>
        </table>
    </div>
  )
}

export default GetAllUsers
