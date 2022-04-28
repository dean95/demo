package com.example.demo

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay

// TODO 2 Create Worker
class MyWorker(appContext: Context, workerParams: WorkerParameters) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        return try {
            doSomething()
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}

private suspend fun doSomething() {
    delay(1000)
    Log.d("Five", "doSomething")
}
