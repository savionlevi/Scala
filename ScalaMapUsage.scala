object ScalaMapUsage extends App {

  val workers = Map("Boss" -> "builder bob",
                    "VP" -> "fireman Sam")

  if(workers.contains("Boss"))
    printf("Boss : %s\n", workers("Boss"))


  for((k,v) <- workers)
    printf("%s : %s\n", k,v)
}
