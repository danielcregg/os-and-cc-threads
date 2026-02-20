# OS & CC Threads

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

Java threading examples for the Operating Systems and Concurrent Computing (OS & CC) module at ATU. Demonstrates thread creation using both the `Thread` class and the `Runnable` interface.

## Overview

This repository contains two self-contained Java demos that illustrate fundamental multithreading concepts. The **ThreadDemo** creates threads by extending the `Thread` class, while the **RunnableDemo** creates threads by implementing the `Runnable` interface. Both examples show thread lifecycle states, priority settings, sleep behaviour, and concurrent countdown execution.

## Features

- Thread creation by extending the `Thread` class
- Thread creation by implementing the `Runnable` interface
- Thread state monitoring (NEW, RUNNABLE, TIMED_WAITING, TERMINATED)
- Priority assignment (MIN_PRIORITY through MAX_PRIORITY)
- Real-time console output of thread name, priority, state, and alive status
- Pre-configured VS Code dev container with Java 21 (Zulu)

## Prerequisites

- [Java JDK](https://adoptium.net/) 17+ installed locally, **or**
- A GitHub account with access to [GitHub Codespaces](https://github.com/features/codespaces)

## Getting Started

### Installation

Clone the repository:

```bash
git clone https://github.com/danielcregg/os-and-cc-threads.git
cd os-and-cc-threads
```

Or open directly in GitHub Codespaces for a zero-install experience.

### Usage

**Run the Thread class demo:**

```bash
javac ie/atu/threadspackage/ThreadDemo/*.java
java ie.atu.threadspackage.ThreadDemo.ThreadDemoDriver
```

**Run the Runnable interface demo:**

```bash
javac ie/atu/threadspackage/RunnableDemo/*.java
java ie.atu.threadspackage.RunnableDemo.RunnableDemoDriver
```

Both demos will launch two concurrent threads that count down from 10 to 1, printing thread state changes along the way.

## Tech Stack

- **Language:** Java 17+
- **Dev Environment:** VS Code Dev Containers / GitHub Codespaces
- **Container Image:** Ubuntu 22.04 with Zulu JDK 21

## License

This project is licensed under the [MIT License](LICENSE).
