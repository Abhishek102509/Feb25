import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Navbar } from "./components/Navbar";
import { Home } from "./components/Home";
import { About } from "./components/About";
import { Contact } from "./components/Contact";
import { DemoComponent } from "./DemoComponent";
import { MyComponent } from "./MyComponent";

function App() {
  return (
    <BrowserRouter>
      <div>
        <Navbar></Navbar>
        <Routes>
          <Route path="/" element={<Home></Home>}></Route>
          <Route path="/about" element={<About></About>}></Route>
          <Route path="/contact" element={<Contact></Contact>}></Route>
        </Routes>

        <p>This is App component</p>
      <MyComponent text="This is dummy text" heading="Welcome to my component"></MyComponent>
      <DemoComponent text="Example dummy content" heading="Welcome"></DemoComponent>
      </div>
    </BrowserRouter>
  )
}

export default App
