import axios from "axios";

const API_ROOT = 'http://localhost:8080';

const requests = {
    get: url =>
      axios.get(`${API_ROOT}${url}`)
};

const Vehicles = {
    all: () =>
      requests.get('/vehicles')
};

export default {
    Vehicles
};