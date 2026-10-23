// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, text: String, redactChar: Char = 'X'): String {
    val redaction = redactChar.toString().repeat(text.length)
    return document.replace(text, redaction)
}