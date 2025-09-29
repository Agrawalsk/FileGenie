# 📂 FileGenie – AI-Powered File Management System

## ✨ Overview
**FileGenie** is a smart **File Management System** built with **Spring Boot, React, and GenAI**.  
It allows users to upload multiple files of any type, automatically organizes them into **zip folders by category**, extracts file content, and enables **AI-powered search** by keywords or semantic meaning.  

Instead of just storing files, **FileGenie makes your files searchable and intelligent**.

---

## 🚀 Features
- 🖱️ **Drag & Drop File Upload** (multiple files at once)
- 📦 **Auto-Zipping** – groups files into zips by type (PDFs, Docs, Images, etc.)
- 📑 **Text Extraction** – reads content from PDF, Word, and Images (OCR)
- 🔎 **Keyword Analysis** – finds most frequent words for fast lookup
- 🤖 **GenAI Semantic Search** – search with natural language and get the right files
- 📂 **File Suggestions** – recommends related files based on content

---

## 🛠️ Tech Stack
- **Frontend**: React.js (Drag & Drop, File Preview, Search UI)
- **Backend**: Spring Boot (REST APIs for file handling & search)
- **Database**: MySQL/Postgres for metadata + (optional) Elasticsearch
- **AI/ML**:
  - NLP: Tokenization, Stopword Removal, TF-IDF
  - Embeddings: Sentence-BERT / HuggingFace for semantic search
  - OCR: Tesseract for images
- **Storage**: Local file system / AWS S3 for storing raw & zipped files

---

## ⚡ Workflow
1. User uploads multiple files via **drag & drop**.  
2. **FileGenie** organizes files into zips by type.  
3. Extracts text from documents (PDF/Word/Images).  
4. Creates an **index of frequent words** and builds **semantic embeddings**.  
5. On search:
   - Keyword match → quick file retrieval  
   - Semantic match → suggest files even if keywords differ (*invoice ↔ bill*)  

---

## 🎯 Use Cases
- HR systems (resume management)  
- Invoice & document storage  
- Digital libraries  
- Knowledge base search  

---

## 🔮 Future Enhancements
- AI-based **auto-tagging** of files  
- **Summarization** of long documents  
- Role-based secure access (Admin/User)  
- Cloud deployment (AWS/Azure/GCP)  

---

## 👨‍💻 Contributors
- **Shivkumar bansal** (Backend – Spring Boot)  
- **Sonu kumar**
- **Vansh Garg**
- **Chhavi Agrawal**
- **Himanshi Agrawal**

---

> 💡 *FileGenie – Don’t just store your files, make them intelligent.*  
