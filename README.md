# Animals

A program implements two stacks using 1D arrays. One stack stores the names of colours. One stack stores the names of animals.

# Global Arrays and Variables

- 1D array Animal to store the names of up to 20 animals.
- 1D array Colour to store the names of up to 10 colours.
- AnimalTopPointer to point to the next free space in the array Animal, initialised to 0.
- ColourTopPointer to point to the next free space in the array Colour, initialised to 0.

# Functions/Procedures

- PushAnimal() - Returns BOOLEAN - Takes in a string parameter (Name of an animal) to push, acknowledges it.
- PopAnimal() - Returns STRING - Removes and returns the next item in animal stack
- PushColour() - Returns BOOLEAN - Takes in a string parameter (Name of a colour) to push, acknowledges it.
- PopColour() - Returns STRING - Removes and returns the next item in colour stack
- ReadData() -
   - reads the animal names from the file AnimalData.txt
   - uses PushAnimal() to insert each name onto the stack
   - uses appropriate exception handling if the file does not exist.
   - reads the colours from the text file ColourData.txt
   - uses PushColour() to insert each colour onto the stack
   - uses appropriate exception handling if the file does not exist.
- OutputItem() -
    - pops the next item from both Animal and Colour
    - outputs the colour and animal on one line, for example "black horse"
    - If there is no data in Colour:
      - the animal is pushed back onto Animal
      - "No colour" is output.
    - If there is no data in Animal:
      - the colour is pushed back onto Colour
      - "No animal" is output.
