package module.tier

import javax.inject.Inject

class SnowTier @Inject constructor(): Tier {
    override fun tier(): String {
        return "겨울타이어"
    }
}