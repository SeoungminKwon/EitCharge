import './App.css';
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Login from './pages/Login/Login';
import Home from './pages/Home/Home';
import Navbar from './layout/NavBar';
import Footer from './layout/Footer';
import MapContainer from './containers/MapContainer'; 
import ChargingServiceInfo from './components/ChargingServiceInfo'; 
import ChargingStationInfo from './components/ChargingStationInfo'; 
import EVSystem from './components/EVSystem'; 
import StatisticsInfo from './components/StatisticsInfo'; 
function App() {
  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/" element={<Home />} />
        <Route path="/map" element={<MapContainer />} />
        <Route path="/chargingServiceInfo" element={<ChargingServiceInfo />} />
        <Route path="/chargingStationInfo" element={<ChargingStationInfo />} />
        <Route path="/evsystem" element={<EVSystem />} />
        <Route path="/statisticsInfo" element={<StatisticsInfo />} />
      </Routes>
      <Footer />
    </Router>

  );
}

export default App;