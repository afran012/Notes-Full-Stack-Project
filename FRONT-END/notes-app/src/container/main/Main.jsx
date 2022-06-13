import React, { useEffect } from 'react'
import { useDispatch } from "react-redux"
import { fetchGetPost } from '../../redux/action/notesAction'
import { List } from '../../componentes/notesCRUD/List'

const Main = () => {
  const dispatch = useDispatch()
  

  useEffect(() => {
    try {
      dispatch(fetchGetPost("notes"));
      //console.log(fetchGetPost("notes"));
      
    } catch (error) {
      console.log(error);
    }
  }, [])


  return (
    <div className='main-Section'>
      <h1>All notes</h1>
      
      {/* <NotesSection>

      </NotesSection> */}
      <List></List>

    </div>
  )
}

export default Main