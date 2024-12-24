package com.scode.parkingspotfinderapp_compose.domain.model

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)
