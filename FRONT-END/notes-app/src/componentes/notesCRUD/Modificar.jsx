import React, { useEffect } from 'react'
import { useDispatch } from 'react-redux';
import { modificarPeliculaAsincrono } from '../../redux/action/actionMovies';
import { fetchUpdatePost } from '../../redux/action/notesAction'; 
import { userFormHook } from '../../hooks/userFormHook';

const Modificar = ({ pelicula }) => {
    const dispatch = useDispatch();

    const { FormHook, handleInputChange, setFormHook, reset } = userFormHook({
        id: "",
        title: "",
        content: "",
        lastedited: "",
    });

    const getValues = () => {
        if (pelicula) {

            const {
                id,
                title,
                content,
                lastedited,
                active,
                userid

            } = pelicula

            setFormHook({
                id,
                title,
                content,
                lastedited,
                active,
                userid
            })
            //console.log(FormHook);
        } else {
            //console.log(pelicula);
        }
    }


    const handleModify = (e) => {
        //e.preventDefault() 
        dispatch(fetchUpdatePost("notes",pelicula.id, FormHook));
        reset();
    }


    useEffect(() => {
        getValues()

        // eslint-disable-next-line react-hooks/exhaustive-deps
    }, [pelicula])


    return (
        <div>
            <div className="container mt-5">
                <hr />
                <div className="row">
                    <div className="col-12">
                        <h3 className="text-center">Notes</h3>
                        <form className="form-group" >
                            <h1>active</h1>
                            <input
                                value={FormHook.active}
                                id="inputactive"
                                type="text"
                                className="form-control mt-2"
                                name="active"
                                autoComplete="off"
                                placeholder="active"
                                required
                                disabled
                                onChange={handleInputChange}
                            />
                            <h1>userid</h1>
                            <input
                                value={FormHook.userid}
                                id="inputuserid"
                                type="text"
                                className="form-control mt-2"
                                name="userid"
                                autoComplete="off"
                                placeholder="userid"
                                required
                                disabled
                                onChange={handleInputChange}
                            />
                            <h1>id</h1>
                            <input
                                value={FormHook.id}
                                id="inputid"
                                type="text"
                                className="form-control mt-2"
                                name="id"
                                autoComplete="off"
                                placeholder="id"
                                required
                                disabled
                                onChange={handleInputChange}
                            />
                            <h1>title</h1>
                            <input
                                value={FormHook.title}
                                id="inputtitle"
                                type="text"
                                className="form-control mt-2"
                                name="title"
                                autoComplete="off"
                                placeholder="title"
                                required
                                onChange={handleInputChange}
                            />
                            <h1>content</h1>
                            <input
                                value={FormHook.content}
                                id="inputcontent"
                                type="text"
                                className="form-control mt-2"
                                name="content"
                                autoComplete="off"
                                placeholder="content"
                                required
                                onChange={handleInputChange}
                            />
                            <h1>lastedited</h1>
                            <input
                                value={FormHook.lastedited}
                                id="inputlastedited"
                                type="text"
                                className="form-control mt-2"
                                name="lastedited"
                                autoComplete="off"
                                placeholder="lastedited"
                                required
                                disabled
                                onChange={handleInputChange}
                            />

                            <div className="d-grid gap-2 mx-auto mt-2">

                                <button
                                    value="Save"
                                    type="submit"
                                    className="btn btn-outline-dark"
                                    onClick={() => { handleModify() }}
                                >
                                    Modify
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Modificar