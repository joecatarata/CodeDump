function Tetromino(){
    this.x = width/2;
    this.y = 0;

    this.show = function(){
        fill(255);
        ellipse(this.x, this.y, 16, 16);
    }
    

}
