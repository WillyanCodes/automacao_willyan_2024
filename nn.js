let x = 250;
let y = 250;
let velocidade = 10;

function setup() {
  createCanvas(500, 500);
}

function draw() {
  background("#008EFF");
  circle(x, y, 40);
  fill("black")
  stroke("rgba(255,0,0,NaN)(255,0,0,NaN)");

  if (keyIsDown(RIGHT_ARROW)) {
  x += velocidade;
}
if (keyIsDown(LEFT_ARROW)) {
  x -= velocidade;
}

  
  }
