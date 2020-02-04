class Shape
{
 disp(res)
  {
      console.log(res)
  }

}
class Circle extends Shape{
    cons(radius){
        var radius
   this.Area=3.14*radius*radius;
     var res=this.Area;
    return res;
}
}
class Rect extends Shape{
    cons(length,width){
    this.Area=length*width;
    var res=this.Area;
    return res;
  
    }
}
var c1 = new Circle();
var c2=new Rect();
c1.cons(1)
c2.cons(3,4)