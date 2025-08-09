# 🎬 Trending Pop

Trending Pop is an Android app built with **Jetpack Compose**, **Hilt**, and **Clean Architecture** that fetches movie data from [TMDB API](https://www.themoviedb.org/documentation/api) and displays them in different categories such as:

- **Now Playing**
- **Popular**
- **Top Rated**
- **Trending**

This project was created as a **learning exercise** to practice modern Android development, dependency injection, API integration, and state management.

---

## ✨ Features

- 📌 **Browse movies by category**
- 🎭 **Movies grouped by genre** for better browsing
- 📷 **Poster previews** with smooth loading using Coil
- 📱 **Bottom navigation** for quick switching between categories
- ⚡ **Asynchronous data loading** using Kotlin Coroutines & Flows
- 🎨 **Material 3 UI** with Jetpack Compose

---

## 🛠 Tech Stack

- **Language**: Kotlin
- **UI**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Architecture**: Clean Architecture (Presentation, Domain, Data layers)
- **Dependency Injection**: [Hilt](https://dagger.dev/hilt/)
- **Networking**: [Retrofit](https://square.github.io/retrofit/) with GSON for JSON parsing
- **Image Loading**: [Coil](https://coil-kt.github.io/coil/)
- **State Management**: Kotlin Flows with `collectAsStateWithLifecycle`
- **Async Operations**: Coroutines
- **API**: [TMDB API](https://developers.themoviedb.org/3)

---

## 📸 Screenshots

| Home Screen (Now Playing) | Popular Movies | Top Rated |
|---------------------------|----------------|-----------|
| ![Now Playing](screenshots/now_playing.png) | ![Popular](screenshots/popular.png) | ![Top Rated](screenshots/top_rated.png) |

---

## 🎥 Demo Video

[![Watch the video](screenshots/demo_thumbnail.png)](https://github.com/yourusername/trendingpop/assets/demo.mp4)

---

## 🧭 Future improvements (ideas)

Add offline caching (Room)

Add pagination for long lists

Add a detail screen (title, overview, release date, backdrop)

Add error UI and retry flows

