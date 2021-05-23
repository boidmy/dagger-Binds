package di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import module.engine.Engine
import module.engine.Gasoline
import module.engine.LPG
import module.tier.SnowTier
import module.tier.SummerTier
import module.tier.Tier
import javax.inject.Named

@Module
abstract class TierModule {

    @Binds
    abstract fun bindsTier(tier: SummerTier): Tier

    @Binds
    @Named("겨울타이어")
    abstract fun bindsSnowTier(tier: SnowTier): Tier

}