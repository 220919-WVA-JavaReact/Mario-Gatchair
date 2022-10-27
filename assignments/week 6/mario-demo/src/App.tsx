import React from 'react';
import './App.css';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Header from './components/header/Header';
import Nav from './components/nav/Nav';
import Home from './components/home/Home';
import TTAAL from './components/TTAAL/TTAAL';
import Footer from './components/footer/Footer';

function App() {
  return (
    <>
        <Header />
        <BrowserRouter>
          <Nav />
          <Routes>
            <Route path='/' element={<Home />}></Route>
            <Route path='ttaal' element={<TTAAL />}></Route>
          </Routes>
        </BrowserRouter>
        <Footer />
    </>
  );
}

export default App;
