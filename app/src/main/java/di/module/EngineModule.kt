package di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import module.engine.Diesel
import module.engine.Engine
import module.engine.LPG
import javax.inject.Named

@Module
abstract class EngineModule {

    /*@Provides
    fun provideEngine(): Engine {
        return LPG()
    }*/

    @Binds
    abstract fun bindEngine(engine: LPG): Engine
}