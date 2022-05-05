import React from "react";
import './ListCompra.css'
import { Container, Row, Col, Table } from "react-bootstrap";

const ListCompra = (props) => {

    return (
        <Container>
            <Row>
                <Col className="list_resumo_compra">
                    <Table striped bordered hover className="table_listCompra">
                        <thead className="thead-listCompra">
                            <tr className="tr_listCompra">
                                <th className="text-center pb-3">Produto</th>
                                <th className="text-center pb-3">Descrição</th>
                                <th className="text-center pb-3">Valor</th>
                                <th className="text-center pb-3">Quantidade</th>
                                <th className="text-center pb-3"></th>
                            </tr>
                        </thead>
                        <tbody className="tbody-listCompra">
                            {props.children}
                        </tbody>
                    </Table>
                </Col>
            </Row>
        </Container>
    )
}
export default ListCompra