import scala.annotation.tailrec
import scala.io.StdIn.readLine


@main def Main(): Unit = {
  println("Enter your word!\n")
  val myList : List[Char] = readLine().toList

  stageOne(myList)
}

def stageOne(myList : List[Char]) : Unit = {
  if(myList.length <= 1) {println("FAIL: Word finished, but not in permissive state\n"); System.exit(1)}
  val element : Char = myList.apply(0)
  if(element == 'b') {println("Stage 1 -- OK\nMoving to Stage 2\n"); stageTwo(myList.slice(1, myList.length))} else {println("Stage 1 -- FAILED"); System.exit(1)}
}

def stageTwo(myList : List[Char]) : Unit = { 
  if(myList.length <= 1) {println("FAIL: Word finished, but not in permissive state\n"); System.exit(1)}
  val element : Char = myList.apply(0)
  if(element == 'a') {println("Stage 2 -- OK\nMoving to Stage 3\n"); stageThree(myList.slice(1, myList.length))} else {println("Stage 2 -- FAILED"); System.exit(1)}
}

def stageThree(myList : List[Char]) : Unit = { 
  if(myList.length <= 1) {println("FAIL: Word finished, but not in permissive state\n"); System.exit(1)}
  val element : Char = myList.apply(0)
  if(element == 'a') {println("Stage 3 -- OK\nMoving to Stage 4\n"); stageFour(myList.slice(1, myList.length))} else { if(element == 'c') {println("Stage 3 -- OK\nMoving to Stage 4\n"); stageFive(myList.slice(1, myList.length))} else {println("Stage 3 -- FAILED"); System.exit(1)}}
}

def stageFour(myList : List[Char]) : Unit = {
  if(myList.length <= 1) {println("FAIL: Word finished, but not in permissive state\n"); System.exit(1)}
  val element : Char = myList.apply(0)
  if(element == 'c' || element == 'b') {println("Stage 4 -- OK\nMoving to Stage 3\n"); stageThree(myList.slice(1, myList.length))} else {println("Stage 4 -- FAILED"); System.exit(1)}
}

def stageFive(myList : List[Char]) : Unit = {
  if(myList.length != 1){ println("FAIL: length of the word is bigger than expected!!!\n"); System.exit(1)}
  val element : Char = myList.apply(0)
  if(element == 'b') {println("Stage 5 -- OK\nMoving to Stage 6\n"); stageSix()} else {println("Stage 5 -- FAILED"); System.exit(1)}
}

def stageSix() : Unit = { 
  println("Regex Check is finished... everyting is fine!\n")
  System.exit(0)
}


