package com.scode.parkingspotfinderapp_compose.presentation

import com.google.maps.android.compose.MapProperties
import com.scode.parkingspotfinderapp_compose.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)
