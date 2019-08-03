import axios from "axios";

const API_ROOT = 'http://localhost:8080';

const requests = {
    get: url =>
      axios.get(`${API_ROOT}${url}`)
};

const OwnedVehicles = {
    all: () =>
      requests.get(`/owned-vehicles`),
    details: (id) =>
      requests.get(`/owned-vehicles/${id}`)
};

const Vehicles = {
  all: () =>
    requests.get(`/vehicles`),
  details: id =>
    requests.get(`/vehicles/${id}`)
};

export default {
    Vehicles,
    OwnedVehicles
};