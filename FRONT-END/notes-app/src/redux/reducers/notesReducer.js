
import { typesNotes } from "../types/typesNote";

const initialState = { notes: [] };

export const notesReducers = (state = initialState, action) => {
    switch (action.type) {
        case typesNotes.GET_POSTS:
            return { ...state, notes: action.payload };
        case typesNotes.ADD_POST:
            return {
                ...state,
                notes: [action.payload, ...state.notes]
            };
        case typesNotes.UPDATE_POST:
            return {
                ...state,
                notes: [...state.notes.map((post) => post.id === action.payload.id ?
                    action.payload : post)]
            }
        case typesNotes.DELETE_POST:
            return {
                ...state,
                post: [...state.notes.filter(elem => elem.id !== action.payload)]
            }
        default:
            return { ...state };
    }
}
