package com.example.yikai.downloaddemo.biz

interface DownLoadBiz {
    fun DownLoadData(name: String, size: Int, url: String, date: String, time: String, path: String)
}