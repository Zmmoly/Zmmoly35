package com.zamouli.aiassistant

/**
 * سياق التوصيات الذكية الذي يساعد في تخصيص التوصيات بناءً على مختلف العوامل السياقية
 */
class RecommendationContext(
    val timeOfDay: TimeOfDay,                 // وقت اليوم
    val userActivity: String,                 // نشاط المستخدم الحالي
    val recentInteractions: List<String>,     // التفاعلات الأخيرة
    val userPreferences: Map<String, Any>,    // تفضيلات المستخدم
    val location: String? = null,             // الموقع الجغرافي (اختياري)
    val weather: String? = null,              // حالة الطقس (اختياري)
    val deviceInfo: Map<String, Any>? = null  // معلومات الجهاز (اختياري)
) {
    /**
     * إنشاء سياق افتراضي بالحد الأدنى من المعلومات
     */
    companion object {
        fun createDefault(): RecommendationContext {
            // تحديد وقت اليوم بناءً على الساعة الحالية
            val currentHour = java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY)
            val timeOfDay = when {
                currentHour in 5..7 -> TimeOfDay.EARLY_MORNING
                currentHour in 8..11 -> TimeOfDay.MORNING
                currentHour in 12..13 -> TimeOfDay.NOON
                currentHour in 14..16 -> TimeOfDay.AFTERNOON
                currentHour in 17..20 -> TimeOfDay.EVENING
                currentHour in 21..23 -> TimeOfDay.NIGHT
                else -> TimeOfDay.LATE_NIGHT
            }
            
            return RecommendationContext(
                timeOfDay = timeOfDay,
                userActivity = "unknown",
                recentInteractions = emptyList(),
                userPreferences = emptyMap()
            )
        }
    }
}