# MusicKlok

**MusicKlok** is a Java-based project designed to play and manage different types of audio content, such as songs, podcasts, voice notes, and sounds. The project uses object-oriented principles to create a flexible and scalable structure that can handle various audio types while allowing for future improvements and customization.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Classes](#classes)
- [Contributing](#contributing)
- [License](#license)

## Overview
MusicKlok allows users to simulate the playback of various audio formats, including songs, sounds, podcasts, and voice notes. It features a dynamic system for liking and playing audio, and also includes a "Favorites" functionality, where audios are classified based on their ratings.

The project is designed with extensibility in mind, allowing additional audio types or features to be easily integrated in the future.

## Features
- **Play Audio**: Simulate the playback of different audio types (e.g., songs, sounds).
- **Like Audio**: Like any audio to increase its popularity.
- **Manage Favorites**: Automatically add audios to a favorite list based on their rating.
- **Extensible Design**: Easily add new audio types with minimal changes.

## Project Structure
The project is divided into two packages:
- **`com.williamscarog.musicklok.main`**: Contains the main entry point of the application.
- **`com.williamscarog.musicklok.models`**: Contains the audio models and classes used to represent different types of audio.

### Package Breakdown:
1. **`main`**
    - `MusicKlok`: The main class that orchestrates the playback and interaction with the audio objects.

2. **`models`**
    - `Audio`: The superclass for all audio types.
    - `Song`: A subclass of `Audio` representing songs.
    - `Sound`: A subclass of `Audio` representing sounds.
    - `Podcast`: A subclass of `Audio` representing podcasts.
    - `VoiceNote`: A subclass of `Audio` representing voice notes.
    - `MyFavorite`: Manages favorite audios based on their rating.

## Installation

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/williamscarog/musicKlok.git
2. Open the project in your favorite Java IDE (e.g., IntelliJ, Eclipse).
3. Ensure that JDK 8 or higher is installed on your machine.


## Usage

To run the project, simply execute the `MusicKlok` class from the `com.williamscarog.musicklok.main` package. This will create instances of different audio types (like `Song` and `Sound` ), simulate playback, and demonstrate the functionality of the favorite system.

### Example Execution:

In the current implementation, the `MusicKlok` class does the following:

- Creates a song (`aleluya`) and a sound (`pirate`).
- Simulates playing and liking them.
- Displays the total number of likes and plays for each audio.
- Adds these audios to the favorites list based on their rating.

```Java
Audio aleluya = new Song();
aleluya.setTitle("Taejun Alejandro");
aleluya.setAuthor("Williamscarog");
aleluya.setDuration(3.00);
aleluya.setTotalLikes(7);
aleluya.setTotalPlays(251);

Sound pirate = new Sound();
pirate.setAuthor("Jack Sparow");
pirate.setSoundType("Human");
pirate.setTitle("Ärgs, Voice");

MyFavorite myLoved = new MyFavorite();
myLoved.add(aleluya);
myLoved.add(pirate);

```

## Classes

`Audio`

The base class for all audio types, containing common attributes like `title`, `author`, `duration`, `likes`, and `totalPlays`.


`Song`

Represents a song and extends the `Audio` class. Additional attributes like `album` and `genre` could be added in future releases.


`Sound`

Represents a sound effect or clip. It has a specific `soundType` attribute (e.g., "nature", "human").


`MyFavorite`

This class manages favorite audios. It evaluates each audio's rating and classifies it into hot, popular, or potential favorite.

## Contributing

If you'd like to contribute to MusicKlok, please fork the repository, create a feature branch, and submit a pull request. We welcome all contributions to improve the project!


## License
GNU GPL v3

MusicKlok is licensed under the GNU General Public License Version 3. See the [LICENSE](./LICENSE) file for more details.

