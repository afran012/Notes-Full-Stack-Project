const BASEURL = "http://localhost:8082/api";


export const apiGetAllData = async (table) => {
    try {
        const url = `${BASEURL}/${table}`;
        const resp = await fetch(url);
        const notes = await resp.json();
        console.log(notes);
        return await notes;

    } catch (error) {
        console.log(error);
    }
};

export const apiGetData = async (table, id) => {
    try {
        const url = `${BASEURL}/${table}/${id}`;
        const resp = await fetch(url);
        const data = await resp.json();
        //console.log(data);
        return await data;

    } catch (error) {
        console.log(error);
    }
};

export const apiPostData = async (table, data) => {
    try {
        const url = BASEURL + `/${table}`;
        const request = {
            method: 'POST',
            body: JSON.stringify(data),
            headers: { "Content-type": "application/json; charset=UTF-8" }
        };
        const response = await fetch(url, request)
        return response.json();

    } catch (error) {
        console.log(error);
    }
};

export const apiPutData = async (table, id, data) => {
    try {
        const url = `${BASEURL}/${table}/${id}`;
        const request = {
            method: 'PUT',
            body: JSON.stringify(data),
            headers: { "Content-type": "application/json; charset=UTF-8" }
        };
        const response = await fetch(url, request)
        return response.json();

    } catch (error) {
        console.log(error);
    }
};

export const apiDeleteData = async (table, id) => {
    try {
        console.log(table,id);
        const url = `${BASEURL}/notes/${table}`;
        console.log(url);
        const request = {
            method: 'DELETE'
        };
        const response = await fetch(url, request)
        return response.json();

    } catch (error) {
        console.log(error);
    }
};