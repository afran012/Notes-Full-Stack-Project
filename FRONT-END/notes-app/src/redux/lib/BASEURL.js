const BASEURL = "http://localhost:8082/api";


export const apiGetAllData = async (urlTable) => {
    try {
        const resp = await fetch(BASEURL + `/${urlTable}`);
        const data = await resp.json();
        //console.log(data);
        return await data;

    } catch (error) {
        console.log(error);
    }
};

export const apiGetSingleData = async (urlTable, id) => {
    try {
        const resp = await fetch(BASEURL + `/${urlTable}` + `/${id}`);
        const data = await resp.json();
        //console.log(data);
        return await data;

    } catch (error) {
        console.log(error);
    }
};

export const apiGetSingleData = async (urlTable, id) => {
    try {
        const resp = await fetch(BASEURL + `/${urlTable}` + `/${id}`);
        const data = await resp.json();
        //console.log(data);
        return await data;

    } catch (error) {
        console.log(error);
    }
};


export const apiNotePost = (post) => {
    const url = BASEURL + "/posts/";
    const request = {
        method: 'POST',
        body: JSON.stringify(post),
        headers: { "Content-type": "application/json; charset=UTF-8" }
    };
    return fetch(url, request)
        .then(response => response.json());
};

export const apiNotePut = (post) => {
    const url = BASEURL + "/posts/";
    const request = {
        method: 'POST',
        body: JSON.stringify(post),
        headers: { "Content-type": "application/json; charset=UTF-8" }
    };
    return fetch(url, request)
        .then(response => response.json());
};
