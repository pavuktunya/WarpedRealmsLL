package adapters.setter

import adapters.queue.ServerQueue

class SetterRequest(
    val queue: ServerQueue
) : ISetRequest {
    override fun sendData(data: Int) {
        queue.push(data)
        println("[CLIENT] Send $data + ${java.time.LocalTime.now()}")
    }
}