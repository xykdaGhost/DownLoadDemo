package com.example.yikai.downloaddemo.bean

class DownLoadBean {
    var fileName: String = ""
    var fileSize: Int = 0
    var fileUrl: String = ""
    var fileDate: String = ""
    var fileTime: String = ""
    var filePath: String = ""

    constructor(fileName: String, fileSize: Int, fileUrl: String, fileDate: String, fileTime: String, filePath: String) {
        this.fileName = fileName
        this.fileSize = fileSize
        this.fileUrl = fileUrl
        this.fileDate = fileDate
        this.fileTime = fileTime
        this.filePath = filePath
    }


    fun getfileName() = fileName
    fun setfileName(name: String) = {this.fileName = name}

    fun getfileSize() = fileSize
    fun setfileSize(size: Int) = {this.fileSize = size}

    fun getfileUrl() = fileUrl
    fun setfileUrl(url: String) = {this.fileUrl = url}

    fun getfileDate() = fileDate
    fun setfileDate(date: String) = {this.fileDate = date}

    fun getfileTime() = fileTime
    fun setfileTime(time: String) = {this.fileTime = time}

    fun getfilePath() = filePath
    fun setfilePath(path: String) = {this.filePath = path}

}