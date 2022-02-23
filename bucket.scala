object bucket{
  def truncateAt(x: Double , p:Int): Double = {
    // To truncate the values
    val s =math.pow(10,p)
    (x*s).toInt / s
  }

  def bucketise(num: Double):(Double,Double)={
    //used mathematics to find bucket in the range
    var initialValue: Double = (num/0.05).floor *0.05;
    var finalValue : Double = (num/0.05).floor *0.05 + 0.049;
    return (truncateAt(initialValue,3), truncateAt(finalValue,3))
  }

  def main(args: Array[String]) :Unit={
    var numbers: Array[Double] = Array(12.05, 12.03, 10.33, 11.45, 13.50)
    for(number <- numbers){
      println(s"The bucket at which the value $number is found is - ${bucketise(number)}")
    }
  }
}