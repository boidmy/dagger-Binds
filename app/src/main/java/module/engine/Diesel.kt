package module.engine

import javax.inject.Inject

class Diesel @Inject constructor(): Engine {
    override fun engine(): String {
        return "디젤엔진"
    }
}