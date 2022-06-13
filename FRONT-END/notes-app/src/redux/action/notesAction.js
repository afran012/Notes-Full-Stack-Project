import {
    apiGetAllData,
    apiDeleteData,
    apiPostData,
    apiPutData,
    //apiGetData

} from '../lib/api';
import { typesNotes } from "../types/typesNote.js";


//actions sync
export const getPosts = (notes) => {
    return ({ 
        type: typesNotes.GET_POSTS, 
        payload: notes 
    })
};
export const addPost = (notes) => {
    return ({ 
        type: typesNotes.ADD_POST, 
        payload: notes 
    })
};
export const updatePost = (note) => ({ type: typesNotes.UPDATE_POST, payload: note });
export const deletePost = (table,id) => ({ type: typesNotes.DELETE_POST, payload: table,id });


//actions async




export const fetchGetPost = (table) => {
    return (dispatch) => {
        apiGetAllData(table)
            .then(res => {
                dispatch(getPosts(res));
            })
            .catch(res => {
                console.log(res);
            })
    }
};

export const fetchAddPost = (note) => {
    return async (dispatch) => {
        await apiPostData(note)
            .then(res => {
                dispatch(addPost(res));
            })
            .catch(res => {
                console.log(res)
            })
    }
};

export const fetchUpdatePost = (table, id, data) => {
    return (dispatch) => {
        apiPutData(table, id, data)
            .then(res => {
                dispatch(updatePost(res));
            })
            .catch(res => {
                console.log(res);
            })
    }
};

export const fetchDeletePost = (table,id) => {
    return (dispatch) => {
        console.log(table,id);
        apiDeleteData(id)
            .then(res => {
                console.log(deletePost("notes",id));
                dispatch(deletePost("notes",id));
            })
            .catch(res => {
                console.log(res);
            })
    }
};




