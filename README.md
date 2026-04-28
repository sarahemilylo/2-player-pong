# 🏓 2 Player Pong

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![GUI](https://img.shields.io/badge/GUI-Swing-green.svg)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen.svg)

## 📝 Description
This is a simple **2-player Pong game** built using Java Swing. The game features real-time ball movement, paddle controls, and score tracking.

Player 1 controls the left paddle using the keyboard, while Player 2 controls the right paddle using the mouse. The objective is to score points by getting the ball past the opponent’s paddle.

---

<img width="2542" height="1446" alt="Screenshot 2026-04-26 172400" src="https://github.com/user-attachments/assets/0f200d69-c7a3-4287-bbfe-8d469447e0f6" />

## ⚙️ Features
- 👥 Two-player gameplay
- 🎮 Mixed controls:
  - Player 1 → Keyboard (W / S)
  - Player 2 → Mouse movement
- ⚡ Smooth animation using a timer (60 FPS)
- 🧱 Collision detection (walls & paddles)
- 🔄 Ball reset after each point
- 🔢 Live score tracking
- 🎨 Clean visual layout with center line and scoreboard

---

## 🎮 Controls
- **Player 1 (Left Paddle):**
  - `W` → Move up  
  - `S` → Move down  

- **Player 2 (Right Paddle):**
  - Move mouse up/down to control paddle  

---

## 🕹️ Gameplay
- The ball bounces off the top and bottom walls
- The ball changes direction when hitting a paddle
- If the ball passes a paddle:
  - Opponent scores a point
  - Ball resets to the center
- Game continues indefinitely (no win condition implemented)

---

## ▶️ How to Run

### Requirements
- Java installed

---

### Steps

1. Compile both files:
```bash
javac 2playerpong.java JPong.java
