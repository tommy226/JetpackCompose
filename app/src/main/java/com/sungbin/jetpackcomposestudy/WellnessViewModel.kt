package com.sungbin.jetpackcomposestudy

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.sungbin.jetpackcomposestudy.data.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> = _tasks

    fun remove(item: WellnessTask){
        _tasks.remove(item)
    }

    fun checkedChange(item: WellnessTask, checked: Boolean){
        _tasks.find { it.id == item.id }?.let { task->
            task.checked = checked
        }
    }
    private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
}