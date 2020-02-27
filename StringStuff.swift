// The StringTime program rearranges and outputs a string depending on the inputted string.
// author Bradley Wills
// version 1.0
// since 2020-02-23

// create variables
var counter:Int = 0
var lastNumber:Double = 1
var currentNumber:Double = 0
var lastLetter:String = ""
var currentLetter:String = ""
var rewrittenString:String = ""

// Ask for input
print("Input the string.")
var inputedText:String! = readLine()
// Removes spaces
if counter < inputedText.count {
    // Repeats for each character
    while counter < inputedText.count {
        currentLetter = String(Array(inputedText)[counter])
        counter += 1
        if currentLetter != " " {
            if let currentNumber = Double(currentLetter) {
                lastLetter = currentLetter
            } else if let lastNumber = Double(lastLetter) {
                for _ in 1...Int(lastNumber) {
                    rewrittenString += currentLetter
                }
                lastLetter = currentLetter
            } else {
                rewrittenString += currentLetter
                lastLetter = currentLetter
            }
        }
    }
    print("The rewritten string is \(rewrittenString)")
} else {
    print("Invalid Input.")
}
