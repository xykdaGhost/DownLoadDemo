package com.example.yikai.downloaddemo.biz

import com.example.yikai.downloaddemo.bean.*
import java.net.URL

class DownLoadFile : DownLoadBiz {
    override fun DownLoadData(name: String, size: Int, url: String, date: String, time: String, path: String) {
        object : Thread() {
            val download = DownLoadData(name, size, url, date, time, path)
            val urlPath = URL(url)
            val inputstream = urlPath.openStream()
            val end = url.substring(url.lastIndexOf("."))
            val outputstream =
        }.start()
    }

    fun startDownLoad() {

    }
}