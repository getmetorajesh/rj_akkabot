import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import scala.concurrent.duration._


object ScalaBotMain extends App{
    val system = ActorSystem("helloakka")
    
    val akkaBot = system.actorOf(Props[ScalaAkkaBot], "akkaBot")
    
    println("ScalaBotMain Actor System was created")
}

