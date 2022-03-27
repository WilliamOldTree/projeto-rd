import React from "react";
import './ListCompra.css'
import { Container, Row, Col } from "react-bootstrap";

const ListCompra = (props) => {

    return (
        <Container>
            <Row>
                <Col className="list_resumo_compra">
                    <table className="table">
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
                    </table>
                </Col>
            </Row>
        </Container>
    )
}
export default ListCompra