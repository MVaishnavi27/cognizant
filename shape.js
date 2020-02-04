class Shape
{
  cons(a)
  {
      this.Area=a;
  }

}
class Circle extends Shape{
    disp(radius){
        var radius
    this.Area=3.14*radius*radius;
    console.log(this.Area)
}
}
class Rect extends Shape{
    disp(length,width){
    this.Area=length*width;
    console.log(this.Area)
    }
}
var c1 = new Circle();
var c2=new Rect();
c1.disp(1)
c2.disp(3,4)