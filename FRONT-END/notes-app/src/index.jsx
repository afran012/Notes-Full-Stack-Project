import React from 'react';
import ReactDOM from 'react-dom/client';
import "./styles/css/style.css"
import reportWebVitals from './reportWebVitals';
// estilos bootstrap
import 'bootstrap/dist/css/bootstrap.min.css'
import AppRouter from './routers/AppRouter';
//import { ProviderId } from 'firebase/auth';
import { Provider } from 'react-redux';
import { store } from './redux/store/store';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Provider store={store}>
  <React.StrictMode>
    <AppRouter/>
  </React.StrictMode>
  </Provider>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
