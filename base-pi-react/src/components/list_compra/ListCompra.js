import React from "react";
import './ListCompra.css'
import { Container, Row, Col, Table } from "react-bootstrap";

const ListCompra = (props) => {

    return (
        <Container>
            <Row>
                <Col className="list_resumo_compra">
                    <Table>
                        <thead>
                            <tr>
                                <th className="text-center pb-3">Produto</th>
                                <th className="text-center pb-3">Descrição</th>
                                <th className="text-center pb-3">Valor</th>
                                <th className="text-center pb-3">Quantidade</th>
                                <th className="text-center pb-3">Excluir</th>
                            </tr>
                        </thead>
                        <tbody>
                            {props.children}
                        </tbody>
                    </Table>
                </Col>
            </Row>
        </Container>
    )
}
export default ListCompra