import express from 'express';
import { INVALID_VALUE, SOMETHING_WENT_WRONG, WELCOME_TO_HOME } from './src/constants/ResponseMessages.js';
import { StatusCodes } from 'http-status-codes';

const PORT = 9400;

const app = express();
app.use(express.json());

app.get("/", (request, response) => {
    response.status(StatusCodes.OK).send({ message: WELCOME_TO_HOME });
});

app.get("/factorial/:n", (request, response) => {
    try {
        const num = parseInt(request.params.n);
        if (num > 0) {
            var fact = 1;
            for (var i = 1; i <= num; i++) {
                fact = fact * i;
            }
            response
            .status(StatusCodes.OK)
            .send({ factorial: fact });
        }
        else {
            response.status(StatusCodes.BAD_REQUEST).send({ message: INVALID_VALUE });
        }
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: SOMETHING_WENT_WRONG });
    }
});

app.post("/product", (request, response) => {
    try {
        const data = request.body;
        const result = data.x * data.y;
        response.status(StatusCodes.OK).send({ product: result });
    } catch (error) {
        response.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: SOMETHING_WENT_WRONG });
    }
});

app.listen(PORT, () => {
    console.log(`Server is running on ${PORT}`);
});