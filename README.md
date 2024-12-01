# The Racing Game

Welcome to "The Racing Game", a thrilling simulation where players compete on a custom race track using various vehicles, each with unique characteristics. Players can design the track, select their vehicle, and strategize their fuel usage for each segment of the race.

## Game Features
- **Custom Track Design**: Players specify the type, length, and conditions (e.g., turns) of each track segment.
- **Vehicle Choices**: Choose from three vehicles:
  - **Motorbike**: Low fuel consumption, faster on smooth roads.
  - **Car**: Balanced fuel consumption and performance.
  - **Jeep**: High fuel consumption but excels on rough terrain.
- **Dynamic Road Types**:
  - **Paved Road**: Default road with minimal consumption adjustments.
  - **Dirt Road**: Affected by rain, increasing fuel consumption.
  - **Rocky Road**: Difficult terrain that increases consumption based on its difficulty level.
- **Fuel Strategy**: Players decide the amount of fuel to use for each segment, influencing speed and completion time.

## How to Play
1. **Track Setup**:
   - Specify the number of segments for the track.
   - For each segment, choose the road type (Paved, Dirt, or Rocky), length (in kilometers), and whether it has turns.
2. **Vehicle Selection**:
   - Choose your vehicle: Motorbike, Car, or Jeep.
3. **Racing**:
   - For each track segment, input the amount of fuel to use.
   - Your vehicle's speed and time depend on the fuel used and the road conditions.
4. **Winning**:
   - The race ends when all segments are completed.
   - The player's total race time is displayed.

## Implementation Details
- **Key Classes**:
  - **`Vehicle`**: Abstract class representing the base functionality of all vehicles.
    - Subclasses: **`Motorbike`**, **`Car`**, **`Jeep`**.
  - **`Road`**: Represents a segment of the track.
    - Subclasses: **`DirtRoad`** and **`RockyRoad`**, each with unique fuel consumption adjustments.
  - **`RaceTrack`**: Manages the track's segments and player progress.
  - **`Racer`**: Represents the player, tracking their vehicle and race time.
  - **`RacingGame`**: The entry point for the game, handling setup, input, and gameplay flow.

## How to Run
**Clone the Repository**:
```bash
git clone https://github.com/SpanouMaria/Racing-Game.git
cd Racing-Game
