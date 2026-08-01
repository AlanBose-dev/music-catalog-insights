🎵 Music Catalog Insights

Deliverables

GitHub Repositories

Backendhttps://github.com/AlanBose-dev/music-catalog-insights

Frontendhttps://github.com/AlanBose-dev/music-catalog-insights-frontend

Live Deployment

Frontendhttps://music-catalog-insights-frontend-ten.vercel.app

Backendhttps://music-catalog-insights-production-eaae.up.railway.app

Demo Credentials

Email: alanbose701@gmail.com

Password: 123456

Project Overview

Music Catalog Insights is a full-stack web application built as part of my Full Stack Java learning journey. It allows users to search albums using the Apple iTunes Search API, save albums, rate them, add notes, view analytics, and generate an AI-style summary.

Features

JWT Authentication

Album Search

Save Albums

Personal Library

Rating & Notes

Delete Albums

Analytics Dashboard

AI Summary

Tech Stack

Frontend: React, Vite, Axios, React Router, Chart.js

Backend: Java 21, Spring Boot, Spring Security, JWT, Spring Data JPA, Maven

Database: PostgreSQL (Neon)

Deployment: Vercel + Railway

Setup

Backend

git clone https://github.com/AlanBose-dev/music-catalog-insights.git

mvn spring-boot

Frontend

git clone https://github.com/AlanBose-dev/music-catalog-insights-frontend.git

npm install

npm run dev

Entity Choice

User

id

name

email

password

Album

id

appleCatalogId

albumName

artistName

genre

artworkUrl

releaseDate

trackCount

price

rating

notes

Database Schema

users(id,name,email,password)

albums(id,appleCatalogId,albumName,artistName,genre,artworkUrl,releaseDate,trackCount,price,rating,notes)

AI Feature

The AI Summary feature analyzes the user's saved music collection and generates a concise summary of ratings and listening preferences.

Trade-offs

Registration omitted from deployed version for simple evaluation.

Apple iTunes API is queried on demand.

Pagination, caching and unit testing are planned future improvements.

Screenshots

Create a folder named screenshots and add:

login.png

search.png

library.png

analytics.png

ai-summary.png

Then reference them in README:



AI-assisted Development

This project was developed by me with AI assistance for learning, debugging, documentation and UI improvements. The implementation, integration, testing and deployment were completed by me.

Developer

Alan Bose

GitHub:https://github.com/AlanBose-dev

Portfolio:https://alanbose.vercel.app

LinkedIn:(Add your LinkedIn URL)