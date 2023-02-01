package com.example.navigationomponent.data.repository


import com.example.navigationomponent.data.model.Models

class Repository {

    private val catList: ArrayList<Models> = ArrayList()

    fun firstList(): ArrayList<Models> {
        Models("https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg", "title")
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        catList.add(
            Models(
                "https://imgv3.fotor.com/images/homepage-feature-card/Upload-an-image.jpg",
                "title"
            )
        )
        return catList
    }
}