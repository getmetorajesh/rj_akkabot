import akka.actor.Actor

class ScalaAkkaBot extends Actor{
    var moving:Boolean = false
    
    def receive = {
        case msg => unhandled(msg)
    }
}

object ScalaAkkaBot{
    sealed abstract class Direction
    case object FORWARD extends Direction
    case object BACKWARDS extends Direction
    case object RIGHT extends Direction
    case object LEFT extends Direction
    case class Move(direction:Direction)
    case object Stop
    case object GetObjectState
    case class RobotState(direction: Direction, moving: Boolean)
}