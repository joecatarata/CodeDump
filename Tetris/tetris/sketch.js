var tetromino;
function setup() {
  createCanvas(400, 400);
  tetromino = new Tetromino();
}

function draw() {
  background(0);
  tetromino.show();
}
