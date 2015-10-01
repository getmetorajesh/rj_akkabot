import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import scala.concurrent.duration._


object ScalaBotMain2 extends App{
    val system = ActorSystem("helloakka")
    
    val akkaBot = system.actorOf(Props[ScalaAkkaBot], "akkaBot")
    
    println("ScalaBotMain Actor System was created")
}