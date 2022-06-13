import React, { useEffect } from "react";
import styled from "styled-components";
import { List } from "./List";
//import { useFormik } from "formik";
import { useDispatch } from "react-redux";
import { fetchGetPost } from "../../redux/action/notesAction";


export const NotesCRUD = () => {
    const dispatch = useDispatch();

    useEffect(() => {
        dispatch(fetchGetPost("notes"));
        // eslint-disable-next-line react-hooks/exhaustive-deps
    }, []);

    return (
        <div>
            <div className="container mt-5">
                <hr />
                <div className="row">
                    <div className="col-12">
                        <h3 className="text-center">Movies</h3>

                    </div>
                    <List />
                </div>
            </div>
        </div>
    );
};