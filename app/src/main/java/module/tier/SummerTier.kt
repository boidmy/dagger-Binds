package module.tier

import javax.inject.Inject

class SummerTier @Inject constructor(): Tier {
    override fun tier(): String {
        return "여름타이어"
    }
}