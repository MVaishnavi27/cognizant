class Car
{
    run()
    {
console.log("This is car")
    }
}
class Maruti extends Car{
    run()
    {
        super.run()
        console.log("This is maruti")
    }
}
class Suzuki extends Maruti{
    run()
    {
        super.run()
        console.log("This is suzuki")
    }
}
var m=new Suzuki();
m.run();