package module.engine

import javax.inject.Inject

class LPG @Inject constructor(): Engine {
    override fun engine(): String {
        return "LPG엔진"
    }
}