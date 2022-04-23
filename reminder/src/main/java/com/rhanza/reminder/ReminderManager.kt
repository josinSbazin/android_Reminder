package com.rhanza.reminder

import android.content.Context
import androidx.annotation.DrawableRes
import com.rhanza.reminder.model.Reminder

class ReminderManager(
    val context: Context,
    @DrawableRes
    val icon: Int? = null
) {
    fun schedule(vararg reminder: Reminder): Result<Unit> {
        return Result.success(Unit)
    }

    fun cancel(vararg id: Int): Result<Unit> {
        return Result.success(Unit)
    }

    fun cancelAll(): Result<Unit> {
        return Result.success(Unit)
    }
}