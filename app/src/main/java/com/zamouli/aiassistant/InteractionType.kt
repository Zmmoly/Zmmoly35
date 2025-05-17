package com.zamouli.aiassistant

/**
 * أنواع التفاعلات المختلفة التي يمكن للمستخدم إجراؤها مع المساعد الذكي
 */
enum class InteractionType {
    GENERAL_QUESTION,   // سؤال عام
    DEVICE_CONTROL,     // التحكم في الجهاز
    SMART_HOME,         // التحكم في المنزل الذكي
    WEATHER,            // معلومات الطقس
    TRAVEL,             // معلومات السفر
    HEALTH,             // معلومات صحية
    CALENDAR,           // إدارة التقويم
    REMINDER,           // تذكيرات
    ENTERTAINMENT,      // ترفيه
    NEWS,               // أخبار
    CONVERSATION        // محادثة عامة
}