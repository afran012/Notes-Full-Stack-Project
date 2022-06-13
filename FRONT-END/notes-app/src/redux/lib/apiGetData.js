import { BASEURL } from "./api";


export async function apiGetData(table, id) {
    try {
        const url = `${BASEURL}/${table}/${id}`;
        const resp = await fetch(url);
        const data = await resp.json();
        //console.log(data);
        return await data;

    } catch (error) {
        console.log(error);
    }
}
