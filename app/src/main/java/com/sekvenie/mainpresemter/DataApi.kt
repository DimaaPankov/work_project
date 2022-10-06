package com.sekvenie.mainpresemter

import com.sekvenie.model.network.service.Data
import com.sekvenie.model.network.service.DataEvent

interface DataApi<T> {
val data:List<Data>
}