/**
 * enum Class PositionTitle
 * @author
 * Josiah Rivera
 * DATE 10/6/2022
 * @param lower
 * this allows the user to put the titles in a lowercase(except first letter)
 */

enum class PositionTitle(var lower: String) {
    ADMINISTRATION("Administration"),
    PRODUCTION("Production"),
    MAINTENANCE("Maintenance"),
    TECHNICAL("Technical"),
    SECRETARIAL("Secretarial");
}