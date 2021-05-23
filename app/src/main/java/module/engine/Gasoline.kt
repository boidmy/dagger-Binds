package module.engine

import javax.inject.Inject

class Gasoline @Inject constructor(): Engine {
    override fun engine(): String {
        return "가솔린엔진"
    }
}