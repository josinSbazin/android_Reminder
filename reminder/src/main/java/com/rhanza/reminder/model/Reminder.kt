package com.rhanza.reminder.model

import android.app.PendingIntent
import java.util.*

class Reminder(
    val id: Int,
    val eventDate: Date,
    val settings: ReminderSettings,
    val title: String,
    val description: String,
    val pendingIntent: PendingIntent? = null
)