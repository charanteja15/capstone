
import './App.css';
import AnswerQuestion from './Components/AnswerQuestion';
import CreateQuestion from './Components/CreateQuestion';
import GetAllUsers from './Components/GetAllUsers';
import GetAnswer from './Components/GetAnswer';
import GetUnApprovedAnswers from './Components/GetUnApprovedAnswers';
import GetUnApprovedQuestions from './Components/GetUnApprovedQuestions';
// import SearchBox from './Components/SearchBox';
import AdminRegistartion from './Services/AdminRegistartion';
// import UserLoginService from './Services/UserLoginService';
import UserRegistartion from './Services/UserRegistartionService';


function App() {
  return (
   <>
    <AdminRegistartion />
    <UserRegistartion />
    {/* <UserLoginService /> */}
    <CreateQuestion />
    <AnswerQuestion />
    <GetAllUsers />
    {/* <GetAnswer /> */}
    {/* <SearchBox /> */}
    <GetUnApprovedQuestions />
    <GetUnApprovedAnswers />
   </>  
  );
}

export default App;
