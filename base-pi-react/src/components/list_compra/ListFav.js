import React from "react";
import './ListCompra.css'
import { Container, Row, Table } from "react-bootstrap";

const ListFav = (props) => {

    return (
        <Container>
            <Row>
                
                    <Table >
                        <tbody className="tbody-listCompra">
                            {props.children}
                        </tbody>
                    </Table>
                
            </Row>
        </Container>
    )
}
export default ListFav