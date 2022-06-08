import React from "react";
import './ListCompra.css'
import { Container, Row, Col, Table } from "react-bootstrap";

const ListCompra = (props) => {

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
export default ListCompra