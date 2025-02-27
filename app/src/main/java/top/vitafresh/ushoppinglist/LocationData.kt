package top.vitafresh.ushoppinglist

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeocodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)

class GeocodingResult (
    val formatted_address: String
)
