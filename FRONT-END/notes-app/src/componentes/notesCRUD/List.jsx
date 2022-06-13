import React, { useCallback, useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { fetchDeletePost, fetchGetPost  } from "../../redux/action/notesAction";
import Modificar from "./Modificar";

export const List = () => {
    const [NoteModificar, setNoteModificar] = useState()
    const dispatch = useDispatch();
    const { pelicula } = useSelector((store) => store.pelicula);
    const { notes } = useSelector((store) => store.notes);
    const table="notes"
    //console.log(pelicula);

    // eslint-disable-next-line react-hooks/exhaustive-deps
    const handleModificar = useCallback((note) => {
        //console.log(peli);
        setNoteModificar(note)
    })

    useEffect(() => {

    }, [notes])
    
    
    return (
        <div>

            <Modificar pelicula={NoteModificar} />


            <table className="table text-center mt-3">
                <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">title</th>
                        <th scope="col">content</th>
                        <th scope="col">lastedited</th>
                        <th scope="col">actions</th>
                    </tr>
                </thead>
                <tbody>

                    {notes.map((note, index) => (
                        <tr key={index}>
                            <td>{note.id}</td>
                            <td>{note.title}</td>
                            <td>{note.content}</td>
                            <td>{note.lastedited}</td>
                            <td>
                                <button
                                    className="btn btn-success btn-sm float-end mx-2"
                                    onClick={() => { handleModificar(note) }}

                                >
                                    Modify
                                </button>
                            </td>
                            <td>
                                <button
                                    className="btn btn-danger btn-sm float-end"
                                    onClick={() => {
                                        dispatch(fetchDeletePost(table,note.id));
                                        dispatch(fetchGetPost(table));
                                    }}
                                >
                                    Delete
                                </button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>);
};